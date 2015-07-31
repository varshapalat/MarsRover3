package com.rover;

public class Application {
    public void start(View view, Rover rover) {
        String positon;String commands;
        view.acceptPlateauBoundaries();
        positon = view.acceptRoverPosition();
        String[] splitPositions = positon.split(" ");
        int x = Integer.parseInt(splitPositions[0]);
        int y = Integer.parseInt(splitPositions[1]);
        String direction = splitPositions[2];
        Position position = new Position(x, y, String.valueOf(direction.charAt(0)));
        commands = view.acceptCommands();
        int length = commands.length();
        char[] commandAtPosition = new char[20];
        for(int i=0; i<length; i++)
        {
            commandAtPosition[i] = commands.charAt(i);
        }
        for(int i=0; i<length; i++)
        {
            if(position.direction.equals('N')) {
                if (commandAtPosition[i] == 'L')
                    position.direction = "W";
                else if (commandAtPosition[i] == 'R')
                    position.direction = "E";
                else if (commandAtPosition[i] == 'M')
                    position.moveAlongYAxis();
            }
        }
        view.printCurrentStatus(position);
    }
}
