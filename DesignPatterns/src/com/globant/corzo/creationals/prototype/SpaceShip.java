package com.globant.corzo.creationals.prototype;

public abstract class SpaceShip {

    private double mass;
    private double height;
    private Position position;

    public SpaceShip(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Tree [mass=" + mass + ", height=" + height + ", position=" + position + "]";
    }

    public abstract SpaceShip copy();

}
