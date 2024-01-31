import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int a = 0; a < n - 1; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                // swap
                if (arr[b] > arr[b + 1]) {
                    arr[b] = arr[b] + arr[b + 1]; // 3 = 3 + 2 = 5
                    arr[b + 1] = arr[b] - arr[b + 1]; // 2 = 5 - 2 = 3
                    arr[b] = arr[b] - arr[b + 1]; // 5 = 5 - 3 = 2
                }
            }
        }
    }

    public void printA(int a[]) {
       System.out.println(Arrays.toString(a)); 
    }

    public static void main(String[] args) {
        BubbleSort j = new BubbleSort();
        int a[] = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("before sorting!");
        j.printA(a);
        System.out.println("after sorting!");
        j.bubbleSort(a);
        j.printA(a);
    }
}
