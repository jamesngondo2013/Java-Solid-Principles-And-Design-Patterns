package com.james.facade.pattern;


public class TravelPackageFacade implements ITravelPackageFacade{

	public void booking() {
		
		try {
			Thread.sleep(6000);
			IFlightBooking flight = new FlightBooking();
			flight.booking();
			
			Thread.sleep(8000);
			IHotelBooking hotel = new HotelBooking();
			hotel.booking();
			
			Thread.sleep(8000);
			ITransferBooking transfer = new TransferBooking();
			transfer.booking();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("Travel Package booking completed successfully...!");
		
	}

}
