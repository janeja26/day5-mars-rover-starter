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
}
