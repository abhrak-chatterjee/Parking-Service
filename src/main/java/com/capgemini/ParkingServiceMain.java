package com.capgemini;

public class ParkingServiceMain 
{

	public static void main(String[] args) 
	{
		ParkingAllotment parkingAllotment = new ParkingAllotment();
		Customer customer = new Customer();
		
		parkingAllotment.findPosition(new Customer("Abhrak","1",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Kamal","2",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Raj","3",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Sachin","4",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Bibhash","5",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Soma","6",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Kaushik","7",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Animesh","8",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Ankit","9",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Ashmok","10",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Kochu","11",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("PG","12",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Sayak","13",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Angshu","14",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Anish","15",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Suman","16",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Bishu","17",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Arghya","18",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Bantu","19",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Pandey","20",2441139,System.currentTimeMillis()));
		parkingAllotment.findPosition(new Customer("Dhruba","21",2441139,System.currentTimeMillis()));
		
		//parkingAllotment.getAllCars();
		
		//parkingAllotment.removeCarById("ParkingTicket = [ F0S0C6 ]");
		//parkingAllotment.getAllCars();
		
		//System.out.println(parkingAllotment.getAllCarTickets());
	}

}
