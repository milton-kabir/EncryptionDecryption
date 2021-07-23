package com.kabir.milton;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String op = "enc";
        String st = "";
//        String aa = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        int ck = 0;
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-mode")) {
                op = args[i + 1];
            } else if (args[i].equals("-key")) {
                ck = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-in")) {
                File file = new File(args[i + 1]);
                try {
                    Scanner scanner = new Scanner(file);
                    st = scanner.nextLine();
                    scanner.close();
                } catch (IOException e) {
                    return;
                }
            }
        }
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-data")) {
                st = args[i + 1];
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
        boolean ob = true;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-out")) {
                File file = new File(args[i + 1]);
                try (PrintWriter writer = new PrintWriter(file)) {
                    writer.println(st);
                    ob = false;
                } catch (Exception e) {

                }
            }

        }
        if (ob) {
            System.out.println(st);
        }
    }
}
