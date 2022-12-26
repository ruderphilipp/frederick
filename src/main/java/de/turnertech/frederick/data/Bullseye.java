package de.turnertech.frederick.data;

import java.io.Serializable;

public class Bullseye implements Serializable {
    
    private double x;

    private double y;

    public Bullseye() {
        this(0.0, 0.0);        
    }

    public Bullseye(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

}
