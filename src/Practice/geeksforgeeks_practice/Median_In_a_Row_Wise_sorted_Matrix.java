package Practice.geeksforgeeks_practice;

import java.util.Scanner;

/**
 * link of the problem
 * https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix/0
 */
public class Median_In_a_Row_Wise_sorted_Matrix {
    /**
     * We are given a row wise sorted matrix of size r*c, we need to find the median of the matrix given. It is assumed that r*c is always odd.
     * <p>
     * Input:
     * The first line of input contains an integer T denoting the number of test cases. Each test case contains two integers r and c, where r is the number of rows and c is the number of columns in the array a[]. Next r line contains space separated c elements each in the array a[].​
     * <p>
     * Output:
     * Print an integer which is the median of the matrix.
     * <p>
     * Constraints:
     * 1<= T <=100
     * 1<= r,c <=150
     * 1<= a[i][j] <=1000
     * <p>
     * Example:
     * Input:
     * 1
     * 3 3
     * 1 3 5
     * 2 6 9
     * 3 6 9
     * <p>
     * Output:
     * 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int[][] arr;
        //test cases
        for (int i = 0; i < test_cases; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            arr = new int[col][row];
            for (int c = 0; c < col; c++) {
                for (int r = 0; r < row; r++) {
                    arr[c][r] = sc.nextInt();
                }

            }
            /*prints
            for (int c = 0; c < col; c++) {
                for (int r = 0; r < row; r++) {
                    System.out.println("arr[" + c + "][" + r + "]: " + arr[c][r]);
                }
            }*/



        }
    }
}
