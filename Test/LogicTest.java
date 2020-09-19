import com.company.Logic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    public void MaxTest() {
        // проверка на правильное нахождение максимума
        Logic.Result array = Logic.MinMax(new int[]{ 1, 2, 3, 4 });
        assertEquals(4, array.max1);
        assertEquals(3, array.max2);
    }
    @Test
    public void MinTest() {
        // проверка на правильное нахождение максимума
        Logic.Result array = Logic.MinMax(new int[]{ 1, 2, 3, 4 });
        assertEquals(1, array.min1);
        assertEquals(2, array.min2);
    }
    @Test
    public void TheSameTest() {
        // проверка на правильное нахождение максимума
        Logic.Result array = Logic.MinMax(new int[]{ 2, 4, 2, 4 });
        assertEquals(4, array.max1);
        assertEquals(4, array.max2);
        assertEquals(2, array.min1);
        assertEquals(2, array.min2);

    }


}