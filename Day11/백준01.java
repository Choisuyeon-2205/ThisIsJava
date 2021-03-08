package com.kosta.day11;

import java.util.*;

public class น้มุ01{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int testCase= s.nextInt();
        
        for(int i=0; i<testCase; i++){
            int num1= s.nextInt();
            int num2= s.nextInt();
            
            System.out.println("Case #"+(i+1)+": "+num1+" + "+num2+" = "+(num1+num2));
        }
    }
}