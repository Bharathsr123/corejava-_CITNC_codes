package org.tnsif.acc.c2tc.datatype_typecasting;
public class FoodOrder {
	public static void main(String[] args) {
		int orderId = 101;
		double price = 299.99;
		boolean isDelivered = false;
		char rating = 'A';
		float deliveryDistance=5.3f;
		byte deliverTime=45;
		short restaurantId=12;
		String CusomerName="Anjali";
		String[]foodItem= {"Burger","Fries","Coke"};
		System.out.println("Order Summary");
		System.out.println("Customer Name:"+CusomerName);
		System.out.println("Order Id:"+orderId);
		System.out.println("RestaurantID:"+restaurantId);
		System.out.println("Food Items:");
		for(String item : foodItem)
		{
			System.out.println(" - "+ item);
		}
		System.out.println("Total Price:"+price);
		System.out.println("DeliveryDistance:"+deliveryDistance);
		System.out.println("Expected Time:"+deliverTime);
		System.out.println("Delivery Status:"+isDelivered);
		System.out.println("Rating:"+ rating);	
	}
}
