package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void roverCanMoveAlongXAxis() {
        Position position = new Position(2, 3, "N");
        Position expectedPositon = new Position(3, 3, "N");

        position.moveAlongXAxis();

        assertEquals(expectedPositon, position);
    }

    @Test
    public void roverCanMoveAlongYAxis() {
        Position position = new Position(2, 3, "N");
        Position expectedPositon = new Position(2, 4, "N");

        position.moveAlongYAxis();

        assertEquals(expectedPositon, position);
    }

    @Test
    public void roverCanMoveAlongXAxisInOppositeDirection() {
        Position position = new Position(2, 3, "N");
        Position expectedPositon = new Position(1, 3, "N");

        position.moveAlongXAxisInOppositeDirection();

        assertEquals(expectedPositon, position);
    }

    @Test
    public void roverCanMoveAlongYAxisInOppositeDirection() {
        Position position = new Position(2, 3, "N");
        Position expectedPositon = new Position(2, 2, "N");

        position.moveAlongYAxisInOppositeDirection();

        assertEquals(expectedPositon, position);
    }
}
