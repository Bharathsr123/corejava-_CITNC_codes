package org.tnsif.acc.c2tc.oops;
class Students
{
	String name;
	int age;
	Students()
	{
		System.out.println("Default constructor");
	}
	Students(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Students(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +"Age "+age);	 
	}	
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Students std1 = new Students();
		Students std2 = new Students("Bharath.SR");
		Students std3 = new Students("Bharath.SR",21);
	}
}