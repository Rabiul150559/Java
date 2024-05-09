package comoutenumber;

public class RangOfPrimeNumber {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int sum=doSumOfArays(numbers);

        System.out.println("sum");

    }

    public static int doSumOfArays(int[][] myArrays) {
        int sum =0;
        for (int row = 0; row < myArrays.length; row++) {
            for (int col = 0; col < myArrays[0].length; col++) {
                sum += myArrays[row][col];

            }
        }
        return sum;

    }
}
