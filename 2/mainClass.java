import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		ArrayList<store> st=new ArrayList<store>();
		st.add(new store("Bat","cricket",3000f));
		st.add(new store("Ball","Cricket",50f));
		st.add(new store("Racquet","Tennis",4000f));
		st.add(new store("Paddle","Table-tennis",500f));
		for(int i=0;i<4;i++)
		{
			System.out.println(st.get(i));
		}
		System.out.println("Enter the country\n 1.India\n 2.USA\n 3.Canada");
		
		taxC.selC();
		float amt=0;
		
		for(store s1: st)
		{	
			amt=amt+s1.price;
		}
		System.out.println("Amount without tax= "+amt);
		taxC.a(amt);
		System.out.println("Amount after taxes is= "+taxC.bill());		
	}
}
