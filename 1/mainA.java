package lab1;
import java.util.*;
class student{
	 String name;
	 int id;
	 student(String name, int id){
		 this.name=name;
		 this.id=id;
	 }
	 public String toString()
	 {
		 return name+" "+id;
	 }
}
public class mainA {
	public static void main(String[] args) {
		//1. Create ArrayList
		ArrayList<student> arr1=new ArrayList<student>(10);
		arr1.add(new student("Ashish",29));
		arr1.add(new student("Gagan",43));
		System.out.println();
		//2. Use for loop
		System.out.println("\nFor Loop- \n");
		for(int i=0;i<2;i++)
		{
			System.out.println(arr1.get(i));
		}
		System.out.println("\nFor each loop-");
		System.out.println();
		for(student s:arr1)
		{
			System.out.println(s);
		}
		System.out.println("\nIterator (only moves forward)-");
		Iterator<student> it=arr1.iterator();
		while(it.hasNext())
		{
			student s1=it.next();
			System.out.println();
			System.out.println(s1.name);
			System.out.println(s1.id);
		}
		System.out.println("\nList Iterator forward-");
		ListIterator<student> lit=arr1.listIterator();
		while(lit.hasNext())
		{
			student s2=lit.next();
			System.out.println();
			System.out.println(s2.name);
			System.out.println(s2.id);
		}
		System.out.println("\nList Iterator backward-");
		while(lit.hasPrevious())
		{
			student s2=lit.previous();
			System.out.println();
			System.out.println(s2.name);
			System.out.println(s2.id);
		}
		ArrayList<student> arr2=new ArrayList<student>();
		for
	}
}
