/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 */

import java.util.*;
public class Demo_print {
    public static float add(float x , float y){
        return x+y;
    }
    public static float sub(float x , float y){
        return x-y;
    }
    public static float multiply(float x , float y){
        return x*y;
    }
        public static float divide(float x , float y){
            if(y>0)
            return x/y;
            else return -1;
    } 
       // you can also add some more function
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Enter 1st number : ");
        a = sc.nextFloat();
        System.out.println("Enter 2nd number : ");
        b= sc.nextFloat();
        System.out.println("=============CHOOSE OPTION FROM BELOW =================");
        System.out.println("1. Addtion \n2. Subtration \n3. Multiply \n4. Divide");
        
        int option  = sc.nextInt();
        float z=0;
        switch(option){
            
            case 1:z = add(a,b);
            break;
            
            case 2:z = sub(a,b);
            break;
            
            case 3:z = multiply(a,b);
            break;
            
            case 4:z = divide(a,b);
            break;
        }
        
        System.out.println("Answer : "+z);
        
       // System.out.println("good bye sahil !!!");
    }
}
