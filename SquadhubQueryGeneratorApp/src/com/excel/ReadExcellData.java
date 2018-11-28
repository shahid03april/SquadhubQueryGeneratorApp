package com.excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcellData {

	public static void main(String[] args) throws IOException {
		String excelFilePath = "D:\\squadhubdb\\Book1.xlsx";
		File fout = new File("D:\\squadhubdb\\excellSheetDataInsertQueries.txt");
		FileOutputStream fos = null;
		BufferedWriter bw = null;
		FileInputStream inputStream = null;
		XSSFWorkbook workbook = null;
		DataArray dataArray = new DataArray();
		try {
			fos = new FileOutputStream(fout);
			bw = new BufferedWriter(new OutputStreamWriter(fos));
			inputStream = new FileInputStream(new File(excelFilePath));
			// Create Workbook instance holding reference to .xlsx file
			workbook = new XSSFWorkbook(inputStream);
			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				int count = 0;
				String userId = null;
				String userName = null;
				String userEmail = null;
				String userCSD = null;
				while (cellIterator.hasNext()) {
					count++;
					String cell = cellIterator.next().toString().trim();
					if (cell.toString().trim().length() == 0) {
						continue;
					}
					if (!isNumeric(cell)) {
						if (cell.toLowerCase().contains("CSD".toLowerCase())) {
							userCSD = cell.toString();
							continue;
						}
						userId = getUserId(dataArray, cell.toLowerCase());
						userEmail = getUserEmail(dataArray, cell.toLowerCase());
						userName = cell;
						continue;
					}
					double doubleValue = Double.parseDouble(cell);
					if (doubleValue <= 0) {
						continue;
					}
					int hours = (int) (doubleValue * 8);
					int percentage = hours * 100 / 8;
					String status = getStatus(percentage);
					bw.write("INSERT INTO `booked_user` VALUES ('" + userId + "', '" + userEmail + "', '" + userCSD
							+ "', '" + hours + "', " + "'" + userName + "', '" + percentage + "', '" + status + "', '"
							+ getDate(dataArray, count) + "', "
							+ "'https://www.gravatar.com/avatar/01c3f5143c5a2800bc8f8122bdabfadb?d=mm&s=48')");
					bw.newLine();

					
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (workbook != null) {
				workbook.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			if (fos != null) {
				fos.close();
			}
			if (bw != null) {
				bw.close();
			}
		}
	}

	public static String getDate(DataArray dataArray, int count) {
		return dataArray.dateArray[count];
	}

	public static String getUserId(DataArray dataArray, String username) {
		Map<String, String> map = dataArray.getUserMap();
		return dataArray.getUserMap().get(username.trim().toLowerCase()).split("_")[1];
	}

	public static String getUserEmail(DataArray dataArray, String username) {
		return dataArray.getUserMap().get(username.trim().toLowerCase()).split("_")[0];
	}

	public static int getPrcentage(int num) {
		return 0;
	}

	public static String getStatus(int num) {
		if (num == 100) {
			return "not available";
		} else if (num > 0 && num < 100) {
			return "partial";
		}
		return null;

	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
