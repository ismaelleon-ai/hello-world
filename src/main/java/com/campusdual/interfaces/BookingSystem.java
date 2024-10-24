package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking( "0000BBB");
        cb.book(new Date());
        cb.getTicketDetails();
        cb.cancelBook();
        cb.getTicketDetails();
        cb.book(new Date());
        cb.getTicketDetails();
        FlightBooking fb = new FlightBooking("iberia","IBE1231");
        fb.book(new Date(),"v72");
        fb.book(new Date(), "v73");
        fb.getTicketDetails();
    }
}
