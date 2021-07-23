package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        String aa="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        int ck=scanner.nextInt();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a'&&st.charAt(i)<='z') {
                int x=st.charAt(i)-97;
                x+=ck;
                char ch=aa.charAt(x);
                st = st.substring(0, i) + ch + st.substring(i + 1);
            }
        }
        System.out.println(st);
    }
}
