package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test

    void should_move_to_0_1_N_when_execute_command_M_given_initial_position_0_0_N() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));

        // When
        marsRover.executeCommand(Command.M);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(1, currentLocation.getY());
        assertEquals(Direction.N, currentLocation.getDirection());
    }


    }

