/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;

/**
 *
 * @author Constant Likudie
 */
public class CheckDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        boolean uniq = true;
//        String testString = "Consta";
//        HashMap uniquemap = new HashMap();
//        for (int i = 0; i < testString.length(); i++){
//            if (uniquemap.containsKey(testString.charAt(i))){
//                uniq = false;
//                break;
//            } else {
//                uniquemap.put(testString.charAt(i), 1);
//            }
//        }
//        
//        if (uniq){
//            System.out.println("Unique");
//        } else{
//            System.out.println("duplicates present");
//        }

        boolean[] dups = new boolean[256];
        String inputString = "Constant";
        for (int i = 0; i < inputString.length(); i++){
            int numVal = inputString.charAt(i);
            if (dups[numVal]) System.out.println("duplicate");
            
            
        }
    }

}
