package com.campusdual.override;

import com.campusdual.Utils;

public class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

}
