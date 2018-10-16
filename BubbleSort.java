/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Constant Likudie
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {20, 3, 23, 66, 54, 100, 3200, -4, 6};
        BubbleSort.printArray(BubbleSort.sort(arr));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    BubbleSort.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static int[] swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
