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
    }
}
