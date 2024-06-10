package com.example.ACTIVITY;

public class Activity1 {
    public static void main(String Args[])
    {
        car mycar = new car();
        mycar.color = "Blue";
        mycar.transmission = "Manual";
        mycar.make = 2024;

        mycar.displayCharacterstics();
        mycar.accelerate();
        mycar.brake();

    }

}
