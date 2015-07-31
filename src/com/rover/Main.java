package com.rover;

public class Main {
    public static void main(String [] args) {
        Application marsRoverApplication = new Application();
        View view = new View();
        Rover rover = new Rover();
        marsRoverApplication.start(view, rover);
    }
}
