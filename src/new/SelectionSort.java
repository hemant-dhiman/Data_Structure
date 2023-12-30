import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public void print(int a[]) {
        System.out.println(Arrays.toString(a));
    }

    public void selectionSort(int a[]) {
        int minInd, size = a.length;
        for (int i = 0; i < size; i++) {
            minInd = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[minInd]) {
                    minInd = j;
                }
            }

            int tmp = a[minInd];
            a[minInd] = a[i];
            a[i] = tmp;
        }
    }

    public static void main(String[] args) {
        SelectionSort j = new SelectionSort();
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("before sorting!");
        j.print(a);
        System.out.println("after sorting!");
        j.selectionSort(a);
        j.print(a);
    }
}