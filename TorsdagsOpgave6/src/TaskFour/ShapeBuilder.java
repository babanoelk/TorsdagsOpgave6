package TaskFour;

import java.util.ArrayList;

public class ShapeBuilder implements Shape {


    /*4.3 Lav en klasse ShapeBuilder, som kan holde en samling af Shapes i en ArrayList.
    Lav en metode addShape(Shape s) som bruges til at tilføje nye Shape-objekter.*/
    ArrayList<Shape> shapes;

    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    /* 4.4 Lav metoden getTotalArea() i klassen ShapeBuilder, som returnerer det samlede areal af alle
    Shape-objekterne i ArrayListen.*/
    @Override
    public double getArea() {
        double count = 0;
        for(Shape s: shapes){
            count = s.getArea() + count;
        }
        return count;
    }
}
