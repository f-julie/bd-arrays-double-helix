package processing.sketches;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.Collections;

public class Main extends PApplet {
    public static PApplet sketch;

    int num = 5;

    final int RED = color(255, 230, 200);
    final int TAN = color(255, 100, 80);

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {

    }

    public void draw() {
        background(20);

    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
