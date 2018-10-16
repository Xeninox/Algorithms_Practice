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
public class SwapWithoutTemp {

    public static void main(String[] args) {
        SwapWithoutTemp.sortMethodTwo(-1, 2);
    }

    public static void sortMethodOne(int a, int b) {
        a = b - a;
        b = b - a;
        a = a + b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void sortMethodTwo(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
