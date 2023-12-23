# Instructions

We are creating a Double Helix animation out of 2D Circles.

While the animation looks 3D it all takes place on a 2D canvas.

Your instructor will show you the animation at the start of
this guided project. The goal is to break down what looks
to be a complicated design, into small, more manageable
classes.

1. Look at just one of the circles in the animation.
    - What properties describe this circle?
    - What actions (methods) does this circle take?
1. Start by creating a circle class.
    - provide it with the properties discussed in class
    as well as an `angle` property which we'll use later.
1. Reference the Diagrams Section below to see how the `sin`
function works.
    - We can use this to move our circles up and down.
    - Also, to make the circle grow larger and smaller.
1. Create a `Circle` type array to hold 5 circles
    - Use the `num` variable as the array size so that
    we can change this single value later.
1. Initialize the array with RED circles.
1. Use a loop to call the `move` method on each circle.
1. Now each circle is moving up and down in-synch.
    - You'll need to provide each Circle with an angle
    offset to create a wave.
1. Edit the initial for loop to include TAN circles.
    - note that now the size of the array will have to
    be twice the value of `num`.
1. Now we need to sort the circles, your instructor will
walk you through the `Comparable` interface and `sort` method.

## A Completed Project Will

Display the Double Helix Animation.
Allow the programmer to change the value of `num` to set
the number of Circles in the helix.

## Extensions

Experiment more with Sine functions. Can you make a 3 or 4 segment helix?

What other patterns can you make?
- Can you make the helix longer?
- How would you make it spin faster/slower?
- Can you make the radius of the path of the circles oscillate so that the helix widens and narrows sinusoidally?
