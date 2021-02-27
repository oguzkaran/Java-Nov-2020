/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgisine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerine döndecektir
		- Haftanın günü 1.1.1900 ile verilen tarih arasınddaki gün sayısının 7 ile bölümünden elde edilen kalan ile 
		bulunabilir. Bu değer 0 (sıfır) için "Pazar", 1 için "Pazartesi", ..., 6 için "Cumartesi" gününe ilişkindir.
		- 1.1.1900 öncesindeki tarihler geçersiz kabul edilecektir		
		- Ekran çıktısında haftanın günü bilgisini Türkçe olarak da gösteriniz. Örneğin:
			03/01/2021 Pazar
		- Parametresi ile aldığı gün, ay ve yıl bilgisine ilişkin tarihin hafta sonu olup olmadığını test eden
		isWeekend metodunu yazınız. Metot geçerlilik kontrolü yapmayacaktır
		- Parametresi ile aldığı gün, ay ve yıl bilgisine ilişkin tarihin hafta içi olup olmadığını test eden
		isWeekday metodunu yazınız. Metot geçerlilik kontrolü yapmayacaktır
		- İleride daha iyileri yazılacaktır
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.samples.date;

public class DateApp {
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
			
			DateUtil.displayDateTR(day, month, year);
			System.out.println("/////////////////");
			DateUtil.displayDateEN(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");	
	}
}
