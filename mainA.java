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
		//2. Use for loop
		for(int i=0;i<2;i++)
		{
			System.out.println(arr1.get(i));
		}
		for(student s:arr1)
		{
			System.out.println(s);
		}
		Iterator<student> it=arr1.iterator();
		while(it.hasNext())
		{
			student s1=it.next();
			System.out.println(s1.name);
			System.out.println(s1.id);
		}
	}
}
