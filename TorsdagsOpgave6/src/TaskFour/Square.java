package TaskFour;

public class Square implements Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (length * length);
    }

    /* 4.2 Lav to klasser, Circle og Square, som implementerer interfacet. Lad de to klasser tage en double som
    parameter i konstruktøren. Denne double repræsenterer henholdsvis radius og længde på en cirkel og et kvadrat.
    Metoderne getArea() skal returnere cirklens eller kvadratets areal.
    Arealet for en cirkel er pi * r² (altså 3,14 * (radius * radius)). Test getArea()-metoderne med unittests.*/

}
