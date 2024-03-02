package com.org.Practice;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string type value to check : ");
        String A=sc.next();
        String temp = "";
        for(int i=A.length()-1;i>=0;i--){
            temp+=A.charAt(i);
        }
        if(A.equals(temp))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
