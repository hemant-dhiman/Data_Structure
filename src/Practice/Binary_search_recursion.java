package Practice;

public class Binary_search_recursion {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int find = 5;
        System.out.println(binarySearchRecursion(data, 0, data.length - 1, find));
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
