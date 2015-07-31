package com.rover;

public class Application {
    public void start(View view, Rover rover) {
        String positon;
        view.acceptPlateauBoundaries();
        positon = view.acceptRoverPosition();
        String[] splitPositions = positon.split("\\s+");
        int x = Integer.parseInt(splitPositions[0]);
        int y = Integer.parseInt(splitPositions[1]);
        String direction = splitPositions[2];
        Position position = new Position(x, y, String.valueOf(direction.charAt(0)));
    }
}
