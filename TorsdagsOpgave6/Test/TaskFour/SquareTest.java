package TaskFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getArea() {
        Square s1 = new Square(20);
        assertEquals(400, s1.getArea());
    }
}