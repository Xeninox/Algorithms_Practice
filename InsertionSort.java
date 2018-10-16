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
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 3, 23, 66, 54, 100, 3200, -4, 6};
        InsertionSort.printArray(InsertionSort.insertionSort(arr));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int ind = i - 1;
            while (ind >= 0 && arr[ind] > value) {
                arr[ind + 1] = arr[ind];
                ind = ind - 1;
            }
            arr[ind + 1] = value;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("Insertion Sort...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
