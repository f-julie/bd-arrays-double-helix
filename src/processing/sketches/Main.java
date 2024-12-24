package processing.sketches;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.Collections;

public class Main extends PApplet {
    public static PApplet sketch;

    private Circle[] circles;

    int num = 5;

    final int TAN = color(255, 230, 200);
    final int RED = color(255, 100, 80);

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {
        // [null, null, null, null, null]
        // 0        1    2      3   4
        circles = new Circle[num * 2]; // *2 so there's 10 instead of 5

        // Index based loop
        // Needed for any changing of what each index is looking at
        // Needed fo any time you need to know the index number of elements
        for (int i = 0; i < num; i++) { // length is 5 not 4.  Can also use circles.length
            //  0  1 2 3 4
            // -2 -1 0 1 2
            int x = width / 2 + 60 * (i - num / 2);
            float angle = PI / 6 * i;
            circles[i] = new Circle(RED, 40, x, height / 2, angle);
            circles[i + num] = new Circle(TAN, 40, x, height / 2, angle + PI); // + PI is halfway across the circle
        }

        // For-each / enhanced for loop - his preference
        // Useful for calling methods on your objects
        // Useful for basic calculations
        // Useless for anything that needs to know the index number nor
        // for changing the array itself
        /*for ( Circle c : circles) { // c is the value (null) not the index number
        }*/
    }

    public void draw() {
        background(20);

        Arrays.sort(circles); // Only works if circles are sortable
        for (Circle currentCircle : circles) {
            currentCircle.drawSelf();
            currentCircle.move();
        }

        // Same
        //for (int i = 0; i < circles.length; i++) {
        //    circles[i].drawSelf();
        //}
    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
