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
    public void acceptCommands () {
        View view = new View();

        System.setIn(new ByteArrayInputStream("LMLMLMLMM".getBytes()));

        assertEquals("LMLMLMLMM", view.acceptPlateauBoundaries());
    }

    @Test
    public void viewCanPrintCurrentStatus() {
        View view = new View();
        Position position = new Position(1, 3, "N");

        view.printCurrentStatus(position);

        assertEquals("1 3 N", outContent.toString());
    }
}
