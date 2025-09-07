package com.afs.tdd;

public class MarsRover {
    private Location currentLocation;

    public MarsRover(Location initialLocation) {
        this.currentLocation = initialLocation;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void executeCommand(Command command) {
        if (command == Command.M) {
            moveForward();
        } else if (command == Command.L) {
            turnLeft();
        } else if (command == Command.R) {
            turnRight();
        }
    }

    private void moveForward() {
        int newX = currentLocation.getX();
        int newY = currentLocation.getY();

        if (currentLocation.getDirection() == Direction.N) {
            newY += 1;
        } else if (currentLocation.getDirection() == Direction.E) {
            newX += 1;
        } else if (currentLocation.getDirection() == Direction.S) {
            newY -= 1;
        } else if (currentLocation.getDirection() == Direction.W) {
            newX -= 1;
        }
        currentLocation = new Location(newX, newY, currentLocation.getDirection());
    }

    private void turnLeft() {
        Direction newDirection;
        Direction currentDirection = currentLocation.getDirection();

        if (currentDirection == Direction.N) {
            newDirection = Direction.W;
        } else if (currentDirection == Direction.W) {
            newDirection = Direction.S;
        } else if (currentDirection == Direction.S) {
            newDirection = Direction.E;
        } else if (currentDirection == Direction.E) {
            newDirection = Direction.N;
        } else {
            newDirection = currentDirection;
        }

        currentLocation = new Location(
                currentLocation.getX(),
                currentLocation.getY(),
                newDirection
        );
    }

    private void turnRight() {
        Direction newDirection;
        Direction currentDirection = currentLocation.getDirection();

        if (currentDirection == Direction.N) {
            newDirection = Direction.E;
        } else if (currentDirection == Direction.E) {
            newDirection = Direction.S;
        } else if (currentDirection == Direction.S) {
            newDirection = Direction.W;
        } else if (currentDirection == Direction.W) {
            newDirection = Direction.N;
        } else {
            newDirection = currentDirection;
        }

        currentLocation = new Location(
                currentLocation.getX(),
                currentLocation.getY(),
                newDirection
        );
    }
}
