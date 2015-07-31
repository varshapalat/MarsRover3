package com.rover;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {

    @Test
    public void applicationCallsViewToAcceptPlateauBoundaries() {
        View view = mock(View.class);
        Application marsRoverApplication = new Application();
        Rover rover = new Rover();

        marsRoverApplication.start(view, rover);

        verify(view).acceptPlateauBoundaries();
    }

    @Test
    public void applicationCallsViewToAcceptRoverPosition() {
        View view = mock(View.class);
        Application marsRoverApplication = new Application();
        Rover rover = new Rover();

        marsRoverApplication.start(view, rover);

        verify(view).acceptRoverPosition();
    }
}
