import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {
    @Test
    public void area_whenInputValueIs2_shouldReturn4() {
        int input_side = 2;
        Square square = new Square(input_side);
        int expectedOutput = 4;

        int actualOutput = square.area();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void area_whenInputValueIs3_shouldReturn9() {
        int input_side = 3;
        Square square = new Square(input_side);
        int expectedOutput = 10;

        int actualOutput = square.area();

        assertEquals(expectedOutput, actualOutput);
    }
}
