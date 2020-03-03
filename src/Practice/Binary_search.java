package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int size;
        int[] arr;
        int item;
        //test case loop
        for (int i = 0; i < test_cases; i++) {
            //size of array loop
            size = sc.nextInt();
            //item wgich we need to find
            item = sc.nextInt();
            //array initialization
            arr = new int[size];
            //array input
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            //binary sort
            int lb = 0;//left side
            int up = arr.length - 1;//right side
            boolean found = false;
            while (lb <= up) {
                int mid = (lb + up) / 2;
                //if item is present
                if (arr[mid] == item) {
                    System.out.println("Element Found:" + arr[mid] + " at index:" + mid);
                    found = true;
                    break;
                }
                //if item is greater, then ignore the left half
                if (arr[mid] < item) {
                    lb = mid + 1;//updating new left side
                } else {
                    //if item id lesser, then ignore the right half
                    //or
                    //if (arr[mid] > item) {
                    up = mid - 1;//updating the right half
                }
            }
            //if element not found
            if (!found)
                System.out.println("not found");

            System.out.println("size" + size);
            System.out.println("item" + item);
            System.out.println("array" + Arrays.toString(arr));
        }
        sc.close();
    }
}


/*
geeksforgeeks submission
import java.util.*;
        import java.lang.*;
        import java.io.*;

class GFG {
    public static void main (String[] args) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int size = 0;
        int[] arr;
        int item = 0;
        //test case loop
        for (int i = 0; i < test_cases; i++) {
            //size of array loop
            size = sc.nextInt();
            //item wgich we need to find
            item = sc.nextInt();
            //array initialization
            arr = new int[size];
            //array input
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            //binary sort
            int lb = 0;//left side
            int up = arr.length - 1;//right side

            while (lb <= up) {
                found = false;
                //while (!found) {
                int mid = (lb + up) / 2;
                //if item is present
                if (arr[mid] == item) {
                    //System.out.println("found"+ arr[mid]);
                    found = true;
                    break;
                }
                //if item is greater, then ignore the left half
                if (arr[mid] < item) {
                    lb = mid + 1;//updating new left side
                } else {
                    //if item id lesser, then ignore the right half
                    //or
                    //if (arr[mid] > item) {
                    up = mid - 1;//updating the right half
                }
            }
            //if element not found
            if(found)
                System.out.println("1");
            else
                System.out.println("-1");
        }
        sc.close();
    }
}

 */