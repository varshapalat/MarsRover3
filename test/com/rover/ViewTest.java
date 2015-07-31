package com.rover;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;
    InputStream originalIn;


    @Before
    public void setUpStreams() {
        original = System.out;
        originalIn = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
        System.setIn(originalIn);
    }

    @Test
    public void acceptPlateauBoundariesFromUser () {
        View view = new View();

        System.setIn(new ByteArrayInputStream("5 5".getBytes()));

        assertEquals("5 5", view.acceptPlateauBoundaries());
    }

    @Test
    public void acceptRoverInitialPositionFromUser () {
        View view = new View();

        System.setIn(new ByteArrayInputStream("1 2 N".getBytes()));

        assertEquals("1 2 N", view.acceptRoverPosition());
    }
}
