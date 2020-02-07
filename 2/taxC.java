import java.util.Scanner;

public class taxC {
	static float ind=1.18f,us=1.10f,can=1.15f,t;
	static float amt;
	static int choice;
	static void a(float a1)
	{
		amt=a1;
	}
	public static void selC()
	{
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		if(choice==1)
			t=ind;
		else if(choice==2)
			t=us;
		else if(choice==3)
			t=can;
	}
	static float bill()
	{	
	
		amt=t*amt;
		return amt;
	}
}
