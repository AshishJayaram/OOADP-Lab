
public class store {
	String name,cat;
	float price;
	store(String n,String c,float p)
	{
		name=n;
		cat=c;
		price=p;
	}
	public String toString()
	{
		return cat+" "+name+" "+price;
	}
}
