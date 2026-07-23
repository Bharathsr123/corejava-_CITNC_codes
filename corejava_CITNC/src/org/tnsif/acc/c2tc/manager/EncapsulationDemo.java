package org.tnsif.acc.c2tc.manager;

class Human{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
    
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setName("Neha");
		obj.setAge(26);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
		obj.setName("Vaishu");
		obj.setAge(22);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}