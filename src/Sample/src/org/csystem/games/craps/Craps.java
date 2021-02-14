package org.csystem.games.craps;

public class Craps {
	public boolean win;
	public java.util.Random r;	
	
	public int total()
	{
		return r.nextInt(6) + 1 + r.nextInt(6) + 1;
	}
	
	public void doWorkForIndeterminite(int sum)
	{
		int newSum;
		
		while ((newSum = total()) != sum)
			if (newSum == 7)
				break;		
		
		win = newSum == sum;
	}
	
	public void doWorkForSum(int sum)
	{
		switch (sum) {
		case 7:
		case 11:
			win = true;
			break;
		case 2:
		case 3:
		case 12:
			win = false;
			break;
		default:
			doWorkForIndeterminite(sum);
		}		
	}
	
	public Craps()
	{
		r = new java.util.Random();
	}
	
	public void play()
	{		
		doWorkForSum(total());
	}
}
