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
        }else if (command == Command.B) {
                moveBackward();

        }
    }

    public void executeCommands(Command[] commands) {
        for (Command command : commands) {
            executeCommand(command);
        }
    }

    private void turnRight() {
        Direction newDirection = calculateNewDirectionAfterRightTurn();
        updateLocationWithNewDirection(newDirection);
    }

    private void turnLeft() {
        Direction newDirection = calculateNewDirectionAfterLeftTurn();
        updateLocationWithNewDirection(newDirection);
    }

    private void moveForward() {
        Direction currentDirection = getCurrentDirection();
        int[] newCoordinates = calculateNewCoordinates(currentDirection, 1);  // 前进为正方向
        currentLocation = new Location(newCoordinates[0], newCoordinates[1], currentDirection);
    }


    private void moveBackward() {
        Direction currentDirection = getCurrentDirection();
        int[] newCoordinates = calculateNewCoordinates(currentDirection, -1);  // 后退为反方向
        currentLocation = new Location(newCoordinates[0], newCoordinates[1], currentDirection);
    }

    private Direction getCurrentDirection() {
        return currentLocation.getDirection();
    }

    private Direction calculateNewDirectionAfterRightTurn() {
        Direction currentDirection = getCurrentDirection();
        if (currentDirection == Direction.N) {
            return Direction.E;
        } else if (currentDirection == Direction.E) {
            return Direction.S;
        } else if (currentDirection == Direction.S) {
            return Direction.W;
        } else {
            return Direction.N;
        }
    }

    private Direction calculateNewDirectionAfterLeftTurn() {
        Direction currentDirection = getCurrentDirection();
        if (currentDirection == Direction.N) {
            return Direction.W;
        } else if (currentDirection == Direction.W) {
            return Direction.S;
        } else if (currentDirection == Direction.S) {
            return Direction.E;
        } else {
            return Direction.N;
        }
    }

    private void updateLocationWithNewDirection(Direction newDirection) {
        currentLocation = new Location(
                currentLocation.getX(),
                currentLocation.getY(),
                newDirection
        );
    }


    private int[] calculateNewCoordinates(Direction direction, int step) {
        int newX = currentLocation.getX();
        int newY = currentLocation.getY();

        if (direction == Direction.N) {
            newY += step;
        } else if (direction == Direction.E) {
            newX += step;
        } else if (direction == Direction.S) {
            newY -= step;
        } else if (direction == Direction.W) {
            newX -= step;
        }

        return new int[]{newX, newY};
    }
}
