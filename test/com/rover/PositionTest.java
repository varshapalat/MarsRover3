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
}
