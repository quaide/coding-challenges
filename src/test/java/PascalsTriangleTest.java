import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PascalsTriangleTest {
    @Test
    public void zeroNumRows() {
        ArrayList<ArrayList<Integer>> actualTriangle =
                PascalsTriangle.solve(0);
        ArrayList<Integer> firstRow = actualTriangle.get(0);
        boolean isEmpty = firstRow.isEmpty();
        Assertions.assertEquals(true, isEmpty);
    }

        /**
         * [
         *  [1]
         * ]
         */
    @Test //creating a test in Junit
    public void oneNumRows() {
        ArrayList<ArrayList<Integer>> actualTriangle = PascalsTriangle.solve(1);
        ArrayList<Integer> firstRow = actualTriangle.get(0);
        Assertions.assertEquals(1, firstRow.size());
        Assertions.assertEquals(Integer.valueOf(1), firstRow.get(0) ); //"boxing a primitive"
    }
    /**
     * [
     *  [1]
     *  [1, 1]
     * ]
     */
    @Test
    public void twoNumRows() {
        ArrayList<ArrayList<Integer>> actualTriangle = PascalsTriangle.solve(2);
        ArrayList<Integer> firstRow = actualTriangle.get(0);
        ArrayList<Integer> secondRow = actualTriangle.get(1);
        Assertions.assertEquals(1, firstRow.size());
        Assertions.assertEquals(2, secondRow.size());
        Assertions.assertEquals(Integer.valueOf(1), firstRow.get(0));
        Assertions.assertEquals(Integer.valueOf(1), secondRow.get(0));
        Assertions.assertEquals(Integer.valueOf(1), secondRow.get(1));
    }

    /**
     * [
     *  [1]
     *  [1, 1]
     *  [1, 2, 1]
     *  [1, 3, 3, 1]
     * ]
     */
    @Test
    public void fourNumRows() {
        ArrayList<ArrayList<Integer>> actualTriangle = PascalsTriangle.solve(4);
        ArrayList<Integer> firstRow = actualTriangle.get(0);
        ArrayList<Integer> secondRow = actualTriangle.get(1);
        ArrayList<Integer> thirdRow = actualTriangle.get(2);
        ArrayList<Integer> fourthRow = actualTriangle.get(3);

        Assertions.assertEquals(1, firstRow.size());
        Assertions.assertEquals(Integer.valueOf(1), firstRow.get(0));

        Assertions.assertEquals(2, secondRow.size());
        Assertions.assertEquals(Integer.valueOf(1), secondRow.get(0));
        Assertions.assertEquals(Integer.valueOf(1), secondRow.get(1));

        Assertions.assertEquals(3, thirdRow.size());
        Assertions.assertEquals(Integer.valueOf(1), thirdRow.get(0));
        Assertions.assertEquals(Integer.valueOf(2), thirdRow.get(1));
        Assertions.assertEquals(Integer.valueOf(1), thirdRow.get(2));

        Assertions.assertEquals(4, fourthRow.size());
        Assertions.assertEquals(Integer.valueOf(1), fourthRow.get(0));
        Assertions.assertEquals(Integer.valueOf(3), fourthRow.get(1));
        Assertions.assertEquals(Integer.valueOf(3), fourthRow.get(2));
        Assertions.assertEquals(Integer.valueOf(1), fourthRow.get(3));
    }
}
