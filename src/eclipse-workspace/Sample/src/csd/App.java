/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgisine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerine döndecektir
		- Haftanın günü 1.1.1900 ile verilen tarih arasınddaki gün sayısının 7 ile bölümünden elde edilen kalan ile 
		bulunabilir. Bu değer 0 (sıfır) için "Pazar", 1 için "Pazartesi", ..., 6 için "Cumartesi" gününe ilişkindir.
		- 1.1.1900 öncesindeki tarihler geçersiz kabul edilecektir
		- İleride daha iyileri yazılacaktır
		- Ekran çıktısında haftanın günü bilgisini Türkçe olarak da gösteriniz. Örneğin:
			03/01/2021 Pazar
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün?");
			int day = Integer.parseInt(kb.nextLine());
			
			if (day == 0)
				break;
			
			System.out.print("Ay?");
			int month = Integer.parseInt(kb.nextLine());
			
			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());
			
			int dayOfYear = DateUtil.getDayOfYear(day, month, year);
			
			if (dayOfYear > 0)
				System.out.printf("%02d/%02d/%04d tarihi yılın %d. günüdür%n", day, month, year, dayOfYear);
			else
				System.out.println("Geçersiz tarih");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += 28;
			if (isLeapYear(year))
				++dayOfYear;
		case 1:
			dayOfYear += 31;			
		}
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;
		
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return day <= days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
	}
}
