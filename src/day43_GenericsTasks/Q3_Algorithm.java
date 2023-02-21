package day43_GenericsTasks;

import java.util.List;

public final class Q3_Algorithm {
    /*
    public static <T> T max(T x, T y) {

        return x > y ? x : y;
    }           ^^ Generics does NOT accept Primitive Types
                Object(x) cannot be greater than another Object

     */

// Q4:

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}

//Q5:

// Given the following classes:

// class Shape { /* ... */ }
// class Circle extends Shape { /* ... */ }
// class Rectangle extends Shape { /* ... */ }
// class Node<T> { /* ... */ }

//Will the following code compile? If not, why?

// Node<Circle> nc = new Node<>();
// Node<Shape> ns = nc;

// NO - b/c once Node<T> is specified as Node<Circle> when creating nc Object
// nc cannot be any other object
// you would need Node<T extends Shape> to have T accept Shape and its child class Objects
