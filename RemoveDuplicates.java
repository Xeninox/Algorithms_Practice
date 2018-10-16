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
public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates.removeDups("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void removeDups(String str) {
        if (str == null) {
            return;
        }
        if (str.length() < 2) {
            return;
        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean dup = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                build.append(str.charAt(i));
            }
        }
        System.out.println(build.toString());
    }

}
