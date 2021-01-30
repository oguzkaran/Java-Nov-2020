/*--------------------------------------------------------------------------------------------------------------------		
	Complex sınıfı ve test kodu
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Complex z, conjugate;
		
		z = new Complex(3, 4);
		conjugate = z.getConjugate();
		
		z.display();
		conjugate.display();		
	}
}

class Complex {
	public static Complex add(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{		
		return new Complex(a1 + a2, b1 + b2);
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{
		return add(a1, b1, -a2, -b2);
	}
	
	public double re;
	public double im;
	
	public Complex()
	{		
	}	
	
	public Complex(double a)
	{
		re = a;
	}
	
	public Complex(double a, double b)
	{
		re = a;
		im = b;
	}
	
	public double getNorm()
	{
		return Math.sqrt(re * re + im * im);
	}
	
	public Complex getConjugate()
	{
		return new Complex(re, -im);		
	}
	
	//add methods
	public Complex add(Complex other)
	{
		return add(re, im, other.re, other.im);						
	}
	
	public Complex add(double val)
	{
		return add(re, im, val, 0);
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.re, z.im);
	}
	
	//subtract methods
	public Complex subtract(Complex other)
	{
		return subtract(re, im, other.re, other.im);						
	}
	
	public Complex subtract(double val)
	{
		return subtract(re, im, val, 0);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.re, z.im);
	}
	
	public void display()
	{
		System.out.printf("|%.2f + %.2f * i| = %f%n", re, im, getNorm());
	}
}