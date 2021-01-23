/*--------------------------------------------------------------------------------------------------------------------	
	Referans parametreli metotlar aldıkları referansa ilişkkinin nesne üzerinde değişşiklik yapabilirler. Yani
	referans parametreli metotlar ile nesnelere erişilebilir
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		Date birthDate;
		
		birthDate = new Date();
		
		birthDate.day = 10;
		birthDate.month = 9;
		birthDate.year = 1976;
		
		DateUtil.displayDate(birthDate);
		
		DateUtil.changeDate(birthDate, 11, 7, 1983);
		
		DateUtil.displayDate(birthDate);
	}
}


class DateUtil {
	public static void changeDate(Date date, int day, int month, int year)
	{
		//...
		
		date.day = day;
		date.month = month;
		date.year = year;
	}
	
	public static void displayDate(Date date)
	{
		System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
	}
}

class Date {
	public int day, month, year;
	//...
}
