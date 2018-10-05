package com.capgemini;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ParkingAllotment 
{
	Map<ParkingTicketGenerator, Customer> car = new HashMap<> ();
	static int floor, section, compartment;
	
	public ParkingAllotment(int floor, int section, int compartment) 
	{
		ParkingAllotment.floor = floor;
		ParkingAllotment.section = section;
		ParkingAllotment.compartment = compartment;
	}

	public ParkingAllotment() 
	{
		
	}

	public void addCar(ParkingTicketGenerator key, Customer value)
	{
		car.put(key, value);
	}
	
	@SuppressWarnings("rawtypes")
	public void getAllCarPositions()
	{
		for(Map.Entry m : car.entrySet())
		{  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
	
	public void findPosition(Customer customer)
	{		
		int flag=0;   
        //If any vacant space is present in between of existing parking lot
        Iterator<HashMap.Entry<ParkingTicketGenerator, Customer>> itr = car.entrySet().iterator();
        while(itr.hasNext()) 
        { 
            HashMap.Entry<ParkingTicketGenerator, Customer> entry = itr.next(); 
            Customer customer1 = entry.getValue();
            if(customer1==(null))
            {
				ParkingTicketGenerator parkingTicketGenerator=entry.getKey();
				addCar(parkingTicketGenerator,customer);
				flag=1;
				break;
            }
        } 
        
        //if no space was vacant in between 
         
        if(flag==0) 
        {
	        compartment++;
	        if(compartment>10)
	        {
	        	compartment=0;
	        	section++;
	        	if(section>4)
	        	{
		            compartment=0;
		            section=0;
		            floor++;
	        	}
	        }
        
	        ParkingTicketGenerator parkTicketGenerator=new ParkingTicketGenerator(floor,section,compartment);
	        addCar(parkTicketGenerator,customer);
        }

	}
	
	@SuppressWarnings("rawtypes")
	public void getAllCars()
	{
		for(Map.Entry m: car.entrySet())
		{  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
	
	public void removeCarById(String ticket) 
	{
		Iterator<HashMap.Entry<ParkingTicketGenerator, Customer>> itr = car.entrySet().iterator();
        int flag=0;
        while(itr.hasNext()) 
        { 
              HashMap.Entry<ParkingTicketGenerator, Customer> entry = itr.next(); 
              ParkingTicketGenerator parkingTicketGenerator=entry.getKey();
              if(parkingTicketGenerator.getTicket().equals(ticket))
              {
                   car.remove(parkingTicketGenerator);
                   addCar(parkingTicketGenerator,null);   //Setting null value on position where car is removed
                   flag=1;
                   break;
              }                           
        }
        if(flag==0)
               throw new RuntimeException("Car not present");
	}
	
	public Set<ParkingTicketGenerator> getAllCarTickets()
	{
		return car.keySet();
	}

}
