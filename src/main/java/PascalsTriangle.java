import java.util.ArrayList;

public class PascalsTriangle {
    public static ArrayList<ArrayList<Integer>> solve(int numRows) {
        if(numRows == 0) {
            ArrayList<Integer> firstRow = new ArrayList<>();
            ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
            triangle.add(firstRow);
            return triangle;
        }
        else if(numRows == 1) {
            ArrayList<Integer> firstRow = new ArrayList<>();
            ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
            return triangle;
        }
        else {
            ArrayList<Integer> firstRow = new ArrayList<>();
            ArrayList<Integer> secondRow = new ArrayList<>();
            ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
            firstRow.add(1);
            secondRow.add(1);
            secondRow.add(1);
            triangle.add(firstRow);
            triangle.add(secondRow);
            //add n more rows where n = numRows - 2
            for(int row = 2; row < numRows; row++) {
                //create row
                //add elements to row
                //add row to triangle
                ArrayList<Integer> newRow = new ArrayList<>();
                for(int col = 0; col < row + 1; col++) {
                    if(col == 0) {
                        newRow.add(1);
                    }
                    else if(col == row) {
                        newRow.add(col, 1);
                    }
                    else {
                        int calcCurrentIndex = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                        newRow.add(calcCurrentIndex);
                    }
                }
                triangle.add(newRow);
            }
            return triangle;
        }
    }
}
