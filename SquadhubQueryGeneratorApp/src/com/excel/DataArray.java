package com.excel;

import java.util.HashMap;
import java.util.Map;


public class DataArray {
	String[] dateArray = { "2018-07-01", "2018-07-02", "2018-07-03", "2018-07-04", "2018-07-05", "2018-07-06",
			"2018-07-07", "2018-07-08", "2018-07-09", "2018-07-10", "2018-07-11", "2018-07-12", "2018-07-13",
			"2018-07-14", "2018-07-15", "2018-07-16", "2018-07-17", "2018-07-18", "2018-07-19", "2018-07-20",
			"2018-07-21", "2018-07-22", "2018-07-23", "2018-07-24", "2018-07-25", "2018-07-26", "2018-07-27",
			"2018-07-28", "2018-07-29", "2018-07-30", "2018-07-31", "2018-08-01", "2018-08-02", "2018-08-03",
			"2018-08-04", "2018-08-05", "2018-08-06", "2018-08-07", "2018-08-08", "2018-08-09", "2018-08-10",
			"2018-08-11", "2018-08-12", "2018-08-13", "2018-08-14", "2018-08-15", "2018-08-16", "2018-08-17",
			"2018-08-18", "2018-08-19", "2018-08-20", "2018-08-21", "2018-08-22", "2018-08-23", "2018-08-24",
			"2018-08-25", "2018-08-26", "2018-08-27", "2018-08-28", "2018-08-29", "2018-08-30", "2018-08-31",
			"2018-09-01", "2018-09-02", "2018-09-03", "2018-09-04", "2018-09-05", "2018-09-06", "2018-09-07",
			"2018-09-08", "2018-09-09", "2018-09-10", "2018-09-11", "2018-09-12", "2018-09-13", "2018-09-14",
			"2018-09-15", "2018-09-16", "2018-09-17", "2018-09-18", "2018-09-19", "2018-09-20", "2018-09-21",
			"2018-09-22", "2018-09-23", "2018-09-24", "2018-09-25", "2018-09-26", "2018-09-27", "2018-09-28",
			"2018-09-29", "2018-09-30", "2018-10-01", "2018-10-02", "2018-10-03", "2018-10-04", "2018-10-05",
			"2018-10-06", "2018-10-07", "2018-10-08", "2018-10-09", "2018-10-10", "2018-10-11", "2018-10-12",
			"2018-10-13", "2018-10-14", "2018-10-15", "2018-10-16", "2018-10-17", "2018-10-18", "2018-10-19",
			"2018-10-20", "2018-10-21", "2018-10-22", "2018-10-23", "2018-10-24", "2018-10-25", "2018-10-26",
			"2018-10-27", "2018-10-28", "2018-10-29", "2018-10-30", "2018-10-31", "2018-11-01", "2018-11-02",
			"2018-11-03", "2018-11-04", "2018-11-05", "2018-11-06", "2018-11-07", "2018-11-08", "2018-11-09",
			"2018-11-10", "2018-11-11", "2018-11-12", "2018-11-13", "2018-11-14", "2018-11-15", "2018-11-16",
			"2018-11-17", "2018-11-18", "2018-11-19", "2018-11-20", "2018-11-21", "2018-11-22", "2018-11-23",
			"2018-11-24", "2018-11-25", "2018-11-26", "2018-11-27", "2018-11-28", "2018-11-29", "2018-11-30",
			"2018-12-01", "2018-12-02", "2018-12-03", "2018-12-04", "2018-12-05", "2018-12-06", "2018-12-07",
			"2018-12-08", "2018-12-09", "2018-12-10", "2018-12-11", "2018-12-12", "2018-12-13", "2018-12-14",
			"2018-12-15", "2018-12-16", "2018-12-17", "2018-12-18", "2018-12-19", "2018-12-20", "2018-12-21",
			"2018-12-22", "2018-12-23", "2018-12-24", "2018-12-25", "2018-12-26", "2018-12-27", "2018-12-28",
			"2018-12-29", "2018-12-30", "2018-12-31", "2019-01-01", "2019-01-02", "2019-01-03", "2019-01-04",
			"2019-01-05", "2019-01-06", "2019-01-07", "2019-01-08", "2019-01-09", "2019-01-10", "2019-01-11",
			"2019-01-12", "2019-01-13", "2019-01-14", "2019-01-15", "2019-01-16", "2019-01-17", "2019-01-18",
			"2019-01-19", "2019-01-20", "2019-01-21", "2019-01-22", "2019-01-23", "2019-01-24", "2019-01-25",
			"2019-01-26", "2019-01-27", "2019-01-28", "2019-01-29", "2019-01-30", "2019-01-31", "2019-02-01",
			"2019-02-02", "2019-02-03", "2019-02-04", "2019-02-05", "2019-02-06", "2019-02-07", "2019-02-08",
			"2019-02-09", "2019-02-10", "2019-02-11", "2019-02-12", "2019-02-13", "2019-02-14", "2019-02-15",
			"2019-02-16", "2019-02-17", "2019-02-18", "2019-02-19", "2019-02-20", "2019-02-21", "2019-02-22",
			"2019-02-23", "2019-02-24", "2019-02-25", "2019-02-26", "2019-02-27", "2019-02-28", "2019-03-01",
			"2019-03-02", "2019-03-03", "2019-03-04", "2019-03-05", "2019-03-06", "2019-03-07", "2019-03-08",
			"2019-03-09", "2019-03-10", "2019-03-11", "2019-03-12", "2019-03-13", "2019-03-14", "2019-03-15",
			"2019-03-16", "2019-03-17", "2019-03-18", "2019-03-19", "2019-03-20", "2019-03-21", "2019-03-22",
			"2019-03-23", "2019-03-24", "2019-03-25", "2019-03-26", "2019-03-27", "2019-03-28", "2019-03-29",
			"2019-03-30", "2019-03-31" };

	public Map<String, String> getUserMap() {
		Map<String, String> usersMap = new HashMap<String, String>();
		usersMap.put("akshay dhankar", "Akshay.9.Dhankar@niit.com_1");
		usersMap.put("anil kumar", "Anil.1b.Kumar@niit.com_2");
		usersMap.put("anju  swami", "Anju.Swami@niit.com_3");
		usersMap.put("ankur kaushik", "Ankur.Kaushik@niit.com_4");
		usersMap.put("ashish mukharjee", "Ashish.Mukherjee@niit.com_5");
		usersMap.put("ashutosh kumar", "Ashutosh.Kumar@niit.com_6");
		usersMap.put("atul kumar pandey", "Atul.9.Pandey@niit.com_7");
		usersMap.put("avinash  kaur", "Avinash.Kaur@niit.com_8");
		usersMap.put("chandan kumar", "hmh.9.team@niit.com_9");
		usersMap.put("charu chabra", "Charu.Chhabra@niit.com_10");
		usersMap.put("deepak sachdeva", "Deepak.9.Sachdeva@niit.com_11");
		usersMap.put("divyanshu sharma", "Divyanshu.Sharma@niit.com_12");
		usersMap.put("garima juneja", "Garima.9.Juneja@niit.com_13");
		usersMap.put("garima pandey", "Garima.9.Pandey@niit.com_14");
		usersMap.put("gaurav kumar", "Gaurav.9.Kumar@niit.com_15");
		usersMap.put("gobind saini", "Gobind@niit.com_16");
		usersMap.put("jayant tiwari", "Jayant.9.Tiwari@niit.com_17");
		usersMap.put("kishan gupta", "Kishan.9.Gupta@niit.com_18");
		usersMap.put("krishna gupta", "Krishna.Gupta@niit.com_19");
		usersMap.put("lalit kumar", "Lalit.kumar@niit.com_20");
		usersMap.put("mamta upadyay", "Mamta.9.Upadhyay@niit.com_21");
		usersMap.put("manish kapoor", "Manish.Kapoor@niit.com_22");
		usersMap.put("manish kumar", "Manish.9a.Kumar@niit.com_23");
		usersMap.put("manjeet", "Manjeet.9@niit.com_24");
		usersMap.put("mohit kumar", "Mohit.Kumar@niit.com_25");
		usersMap.put("mukesh", "Mukesh.9.Kumar@niit.com_26");
		usersMap.put("nikhil", "Nikhil.Nagpal@niit.com_27");
		usersMap.put("niru rai", "Niru.Rai@niit.com_28");
		usersMap.put("nishant kumar sawhney ", "Nishant.9.Sawhney@niit.com_29");
		usersMap.put("nitin osmand  prem", "Nitin.Prem@niit.com_30");
		usersMap.put("pankaj pachuri", "Pankaj.Pachauri@niit.com_31");
		usersMap.put("pooja negi ", "Pooja.9.Negi@niit.com_32");
		usersMap.put("prashant tewari ", "Prashant.9.Tewari@niit.com_33");
		usersMap.put("punit kumar", "Punit.Kumar@niit.com_34");
		usersMap.put("rakesh", "Rakesh.Kumar@niit.com_35");
		usersMap.put("raman sehgal", "Raman.Sehgal@niit.com_36");
		usersMap.put("ramesh chand saini", "Ramesh.9.Saini@niit.com_37");
		usersMap.put("ritesh ojha", "Ritesh.9.Ojha@niit.com_38");
		usersMap.put("sachin kumar ", "Sachin.9a.Kumar@niit.com_39");
		usersMap.put("sameera", "Sameera.9.Talib@niit.com_40");
		usersMap.put("sandeep kumar kesari", "Sandeep.9.Keshari@niit.com_41");
		usersMap.put("sanjeev saxena", "Sanjeev.Saxena@niit.com_42");
		usersMap.put("sarthak  keshav", "Sarthak.Keshav@niit.com_43");
		usersMap.put("shanu soni", "Shanu.Soni@niit.com_44");
		usersMap.put("sitakshi goel", "Sitakshi.9.Goel@niit.com_45");
		usersMap.put("sumit barthwal", "Sumit.9.Barthwal@niit.com_46");
		usersMap.put("sumit shankar", "Sumit.Agrawal@niit.com_47");
		usersMap.put("sunil stephen", "Sunil.9.Stephen@niit.com_48");
		usersMap.put("tajinder singh tanwar", "Tajinder.9.Tanwar@niit.com_49");
		usersMap.put("tarun", "Tarun.9a.Kumar@niit.com_50");
		usersMap.put("vasu tyagi", "hmh.9.team@niit.com_51");
		usersMap.put("vijay", "Vijay.Kumar@niit.com_52");
		usersMap.put("vikramjeet singh ", "Vikramjeet.9.Singh@niit.com_53");
		usersMap.put("vinay kathuria ", "Vinay.9.Kathuria@niit.com_54");
		usersMap.put("vishal yadav", "Vishal.9.Yadav@niit.com_55");
		usersMap.put("bir  singh", "Bir.Singh@niit.com_56");
		usersMap.put("charmila  haribabu", "Charmila.Haribabu@niit.com_57");
		usersMap.put("gaurav  goel", "Gaurav.Goel@niit.com_58");
		usersMap.put("kanika  kanda", "Kanika.Kanda@niit.com_59");
		usersMap.put("p elayaraja  paramu", "Elayaraja.Paramu@niit.com_60");
		usersMap.put("rupal  pathak", "Rupal.Pathak@niit.com_61");
		usersMap.put("sandhya  dev", "Sandhya.Dev@niit.com_62");
		usersMap.put("santanu  chakraborty", "Santanu.Chakraborty@niit.com_63");
		usersMap.put("tejasvi  singh", "Tejasvi.Singh@niit.com_64");
		usersMap.put("akash deep tewari", "hmh.9.team@niit.com_65");
		usersMap.put("ankur goel", "hmh.9.team@niit.com_66");
		usersMap.put("deeksha gupta", "hmh.9.team@niit.com_67");
		usersMap.put("dhruv panchal", "hmh.9.team@niit.com_68");
		usersMap.put("himanshu kashiwal", "hmh.9.team@niit.com_69");
		usersMap.put("puneet nangia", "hmh.9.team@niit.com_70");
		usersMap.put("sushant mishra", "hmh.9.team@niit.com_71");
		usersMap.put("tulsi sitoriya", "hmh.9.team@niit.com_72");
		usersMap.put("dalip kumar sharma", "hmh.9.team@niit.com_73");
		usersMap.put("shahid husain", "shahid.husain@niit.com_74");
		usersMap.put("dheeraj gupta", "dheeraj.gupta@niit.com_75");
		usersMap.put("emanuel joseph", "Niit-emanuel.joseph@niit.com_76");
		usersMap.put("Resource Addition", "hmh.9.team@niit.com_77");
		usersMap.put("Outsourced", "hmh.9.team@niit.com_78");
		return usersMap;
	}
}
