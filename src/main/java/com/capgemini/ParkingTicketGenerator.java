package com.capgemini;

public class ParkingTicketGenerator 
{
	private int floor,section,compartment;
	
	public ParkingTicketGenerator() 
	{
		super();
	}

	public ParkingTicketGenerator(int floor, int section, int compartment)
	{
		super();
		this.floor = floor;
		this.section = section;
		this.compartment = compartment;
	}

	/*public int getFloor() 
	{
		return floor;
	}

	public int getSection() 
	{
		return section;
	}

	public int getCompartment() 
	{
		return compartment;
	}*/

	public String getTicket()
	{
		return "ParkingTicket = [ F"+floor+"S"+section+"C"+compartment+" ]";
	}
	
	@Override
	public String toString()
	{
		return "ParkingTicket = [ F"+floor+"S"+section+"C"+compartment+" ]";
	}
	
}
