package processing.sketches;

import processing.core.PApplet;

public class Circle implements Comparable<Circle> {
    private static PApplet p = Main.sketch;
    private static final float AMPLITUDE = 100.0f;
    private static final float DIAMETER_AMPLITUDE = 20.0f;
    private static final float AVE_DIAMETER = 30.0f;

    private int color;
    private float diameter;
    private float xCoord;
    private float yCoord;
    private float angle;

    public Circle(int color, float diameter, float xCoord, float yCoord, float angle) {
        this.color = color;
        this.diameter = diameter;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.angle = angle;
    }

    public void drawSelf() {
        p.fill(color);
        p.ellipse(xCoord, yCoord, diameter, diameter);
    }

    public void move() {
        yCoord = p.height / 2 + (float) Math.sin(angle) * AMPLITUDE;
        diameter = (float) Math.cos(angle) * DIAMETER_AMPLITUDE + AVE_DIAMETER;
        angle += Math.PI / 60;
    }

    @Override
    public int compareTo(Circle o) {
        // returns a negative number if 'this' is smaller than 'o'
        // returns a 0 if 'this' is equivalent to 'o'
        // otherwise returns a positive number
        return (int) (this.diameter - o.diameter);
    }
}
