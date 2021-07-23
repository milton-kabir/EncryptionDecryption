package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner scanner=new Scanner(System.in);
        String st="we found a treasure!";
        for(int i=0;i<st.length();i++){
            int x=st.charAt(i);
//            System.out.print(x+"->");
            x=97+25-x+97;
            char ch=(char)x;
//            System.out.println(x);
            if(st.charAt(i)>='a'&&st.charAt(i)<='z') {
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        }
        System.out.println(st);
    }
}
