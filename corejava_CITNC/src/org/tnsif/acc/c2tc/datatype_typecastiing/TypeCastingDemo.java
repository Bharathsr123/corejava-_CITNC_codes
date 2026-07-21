package org.tnsif.acc.c2tc.datatype_typecastiing;
public class TypeCastingDemo {
	public static void main(String[] args) {
		double pricePerItem=99.50;
		int quantity=3;
		double totalPrice=quantity*pricePerItem;
		double discount=10.75;
		int roundedDiscount=(int)discount;
		double finalAmount=totalPrice-roundedDiscount;
		System.out.println("Online Shopping Summary");
		System.out.println("items Bought:"+quantity);
		System.out.println("Price per item"+pricePerItem);
		System.out.println("Final Amount to pay after discount:"+finalAmount);
	}
}
