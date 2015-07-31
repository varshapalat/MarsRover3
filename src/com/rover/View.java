package com.rover;

import java.util.Scanner;

public class View {
    public String acceptPlateauBoundaries() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String acceptRoverPosition() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String acceptCommands() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printCurrentStatus(Position position) {
        System.out.print(position.x + " " + position.y + " " + position.direction);
    }
}
