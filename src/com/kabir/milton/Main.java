package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String op = "enc";
        String st = "";
//        String aa = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        int ck = 0;
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].matches("-mode")) {
                op = args[i + 1];
            } else if (args[i].matches("-data")) {
                st = args[i + 1];
            } else if (args[i].matches("-key")) {
                ck = Integer.parseInt(args[i + 1]);
            }
        }

        if (op.matches("enc")) {
            for (int i = 0; i < st.length(); i++) {
                int x = st.charAt(i);
                x += ck;
                char ch = (char) (x);
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        } else {
            for (int i = 0; i < st.length(); i++) {
                int x = st.charAt(i);
                x -= ck;
                char ch = (char) (x);
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        }
        System.out.println(st);
    }
}
