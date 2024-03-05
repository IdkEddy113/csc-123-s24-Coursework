package lab10;

public class Animal {
	String name;
	int age;
	int weight;
	public Animal(String name, int age,int weight)	{
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	public int getweight()
	{
		return weight;
	}
	public void setweight(int weight) {
		this.weight = weight;
	}
	public String getname()
	{
		return name;
		
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void makeNoise()
	{
		System.out.print("GENERIC ANIMAL NOISE");
	}
}
