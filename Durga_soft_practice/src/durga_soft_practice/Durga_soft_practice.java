/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durga_soft_practice;

/**
 *
 * @author sWX684520
 */

import java.io.*;
import java.util.*;
import java.io.*;


class Student{

}
class Customer{

}
class Ionidea{
    
}


public class Durga_soft_practice {
 int x ;  //  instance variable
    
    public static void main(String[] arg) throws Exception{
        
        
    Object o = Class.forName(arg[0]).newInstance();
        System.out.println("Class created : "+o.getClass().getName());
        
        // TODO code application logic here
//	System.out.println("hello world");
//         Durga_soft_practice d = new Durga_soft_practice();
//        d.m1();
//        Thread t1 = new Thread();
//       System.out.println(t1 instanceof Thread);
//        System.out.println(t1 instanceof Object);
//        System.out.println(t1 instanceof Runnable);
//        System.out.println(d instanceof Durga_soft_practice);
//        System.out.println("sumit" instanceof String);
//        //System.out.println("sumit" instanceof StringBuilder);
//        
//        Object o1 = new Object();
//        o1 = null;
//        System.out.println(o1 instanceof Thread);
//        System.out.println(o1 instanceof Scanner);
//        System.out.println(o1 instanceof Runnable);
//        System.out.println(o1 instanceof Durga_soft_practice);
//        System.out.println(null instanceof Scanner);
//        System.out.println(~-5);
//        
//        
//        System.out.println("checking operator  \n ");
//        
//        int x=10, y=15;
//    if(++x>10 & ++y<15)
//    {
//        System.out.println("x printed :  "+x);
//    }
//    else
//        {
//            System.out.println("y printed :  "+y);
//        }
//    System.out.println(x+"------------"+y);
//        
        
//    
//            int a[] = new int[4];
//            try{
//           
//            System.out.println(a[4]);
//            }
//            catch(ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println("array maie galti");
//               
//                System.out.println(e.getLocalizedMessage());
//                
//                 e.getMessage();
//            }
            
        
        
//        ArrayList<Object> al  = new ArrayList();
//        al.add("abc");
//        al.add(32);
//        al.add(432.53f);
//        al.add('c');
//        
//        for (int i =0 ; i< al.size();i++){
//            System.out.println(al.get(i) + " ");
//        }
//        
//        al.add(1,523.523);
//        System.out.println(al.get(0) instanceof String);
//        System.out.println(al.get(1) instanceof Integer);
//        System.out.println(al.get(2) instanceof Float);
//        
//        
//                for (int i =0 ; i< al.size();i++){
//            System.out.println(al.get(i) + " ");
//        }
//        
//            
//         byte b = 127; 
//         b ++;
//         System.out.println(b);
//         long startTime = System.currentTimeMillis();
//         StringBuffer sb = new StringBuffer("hello");
//         for(int i = 1; i<=10000;i++)
//         {sb.append("world");
//         }
//         System.out.println("time taken by string Buffer: "+(System.currentTimeMillis()-startTime)+"ms");
//    
//         
//         
//         startTime = System.currentTimeMillis();
//         StringBuilder sbuild = new StringBuilder("hello"); 
//         for(int i=1;i<=10000;i++)
//         {sbuild.append("world");}
//         System.out.println("time taken  by stringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
//         
      

//  code for finding next maximum from right for each element in an array

//    int []a = new int[]{32,52,13,1,4,5,26,7,4,36,2};
//    
//    int []ans = new int[9];
//    
//    int i,j,temp;
//    
//    for(i=0;i<a.length-2;i++){
//     for(j=i+1;j<a.length-1;i++){
//         if(a[i]<a[j])
//             temp = -1;
//         break;
//     }
//     ans[i] = a[i];
//    }
//      for(i=0;i<ans.length;i++)
//        System.out.print(ans[i]+" ");

//int x = 10;
//if(  ++x > 0 || 10/0 > 0){  //  use of shortcircuit operator
//    System.out.println("hello");
//}
//else
//{
//    System.out.println("hi");
//}

    
    
    
    





    
    

     
    }
    public void m1(){
        System.out.println(x + " parent class");
    
    }
    
}


class Test extends Durga_soft_practice{
    
    
    public void m1(){
        System.out.println("this is child class");
    }
    
    public static void main(String[] args) {
        
    Test t = new Test();
    
    String myName ;
    Scanner sc = new Scanner(System.in);
    myName = sc.nextLine();
    t.setName(myName);
    System.out.println(t.getName());
    }
    
    private String name ;
    public void setName(String s){
        this.name = "Your name is  : "+ s ;
    }
    
    public String getName(){
        return name;
    }
}
