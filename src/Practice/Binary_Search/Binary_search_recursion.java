package Practice.Binary_Search;

import java.util.Scanner;

public class Binary_search_recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases ;
        int size;
        int[] arr;
        int item;

        test_cases = sc.nextInt();
        for (int j = 0; j < test_cases; j++) {
            size = sc.nextInt();
            item = sc.nextInt();
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if (binarySearchRecursion(arr, 0, arr.length - 1, item) != -1) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
        //System.out.println(binarySearchRecursion(data, 0, data.length - 1, find));
    }

    static int binarySearchRecursion(int[] arr, int lb, int ub, int item) {
        int mid = (lb + ub) / 2;
        if (lb <= ub) {
            if (arr[mid] == item) {
                return arr[mid];
            }
            if (arr[mid] < item) {
                return binarySearchRecursion(arr, mid + 1, ub, item);
            } else {
                return binarySearchRecursion(arr, lb, mid - 1, item);
            }
        } else {
            return -1;
        }
    }
}
