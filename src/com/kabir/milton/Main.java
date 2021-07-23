package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine();
        String st = scanner.nextLine();
//        String aa = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        int ck = scanner.nextInt();
        if (op.matches("enc")) {
            for (int i = 0; i < st.length(); i++) {
                int x = st.charAt(i);
                x += ck;
                char ch = (char)(x);
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        }
        else{
            for (int i = 0; i < st.length(); i++) {
                int x = st.charAt(i);
                x -= ck;
                char ch = (char)(x);
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        }

        System.out.println(st);
    }
}
