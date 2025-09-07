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
    @Test
    void should_face_W_when_execute_command_L_given_initial_position_0_0_N() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));
        // When
        marsRover.executeCommand(Command.L);
        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.W, currentLocation.getDirection());
    }

    @Test
    void should_face_E_when_execute_command_R_given_initial_position_0_0_N() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));

        // When
        marsRover.executeCommand(Command.R);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.E, currentLocation.getDirection());
    }

    @Test
    void should_move_to_0_neg1_S_when_execute_command_M_given_initial_position_0_0_S() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.S));

        // When
        marsRover.executeCommand(Command.M);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(-1, currentLocation.getY());
        assertEquals(Direction.S, currentLocation.getDirection());
    }

    @Test
    void should_face_E_when_execute_command_L_given_initial_position_0_0_S() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.S));

        // When
        marsRover.executeCommand(Command.L);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.E, currentLocation.getDirection());
    }

    @Test
    void should_face_W_when_execute_command_R_given_initial_position_0_0_S() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.S));

        // When
        marsRover.executeCommand(Command.R);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.W, currentLocation.getDirection());
    }

    @Test
    void should_move_to_1_0_E_when_execute_command_M_given_initial_position_0_0_E() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.E));

        // When
        marsRover.executeCommand(Command.M);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(1, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.E, currentLocation.getDirection());
    }

    @Test
    void should_face_N_when_execute_command_L_given_initial_position_0_0_E() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.E));

        // When
        marsRover.executeCommand(Command.L);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.N, currentLocation.getDirection());
    }

    @Test
    void should_face_S_when_execute_command_R_given_initial_position_0_0_E() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.E));

        // When
        marsRover.executeCommand(Command.R);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.S, currentLocation.getDirection());
    }

    @Test
    void should_move_to_neg1_0_W_when_execute_command_M_given_initial_position_0_0_W() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.W));

        // When
        marsRover.executeCommand(Command.M);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(-1, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.W, currentLocation.getDirection());
    }


    @Test
    void should_face_S_when_execute_command_L_given_initial_position_0_0_W() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.W));

        // When
        marsRover.executeCommand(Command.L);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.S, currentLocation.getDirection());
    }

    @Test
    void should_face_N_when_execute_command_R_given_initial_position_0_0_W() {
        // Given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.W));

        // When
        marsRover.executeCommand(Command.R);

        // Then
        Location currentLocation = marsRover.getCurrentLocation();
        assertEquals(0, currentLocation.getX());
        assertEquals(0, currentLocation.getY());
        assertEquals(Direction.N, currentLocation.getDirection());
    }

    }

