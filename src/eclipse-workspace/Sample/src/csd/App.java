/*--------------------------------------------------------------------------------------------------------------------		
	 Point sınıfı ve test kodu
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		Point p = new Point();
		
		p.x = 45;
		p.y = -67;
		
		p.display();		
		
		p.offset(-20, 24);
		
		p.display();
	}
}

class Point {
	public int x;
	public int y;
	
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public void display()
	{
		System.out.printf("{x : %d, y : %d}%n", x, y);
	}
}
