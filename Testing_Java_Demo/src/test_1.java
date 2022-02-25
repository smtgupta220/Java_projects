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

class A{
    
    int i,j;  // instance variable
    int result; // instance variable
    public A(){ // use of consturctor is to allocate the memory to object 
                // it is a member method , same name as class name , never return anything,
                //,can be use to initialize the value, default constuctor is called automatically
    i = 5 ; 
        j = 5 ;
    }
    public A(int x){ // example of constructor overloading , also called this type of constructor is paratermized constructor
        i = x;
    }
    public A(double i, double j){
        this.i = (int)i; // this.i  points to instance variable 
        this.j = (int)j;
    }
    
    public void perform (){
        result= i+j;
        System.out.println(result);
       
    }
    
}

class MethodOverloadingDemo{
    
    public void add(int x,int y){
        System.out.println(x+y);
    }
//    public void add(int x,int y,int z){
//        System.out.println(x+y+z);
//    }
    public void add(int ...z){
        System.out.println("\n"+"No of arguments : "+z.length);
            System.out.print("Values  :  ");        
        for(int i: z){
            System.out.print(i+" ");
        }
    }
    
}

class Emp{
    

    int eid;
    int salary;
    static String ceo ;   // by using static , we can access this variable by using class name & also with Object name 
    
   static {  // if u have more than 1 static block, then it will execute in seq.
        System.out.println("this is 2nd static");
    }
        static{
        System.out.println("this is 3rd static");
    }
    
    Emp(){
        eid = 100 ; 
        salary = 1000000;
       
        System.out.println("called from constructor");
    }
    
    
    public void show (){
        System.out.println("\n"+this.eid + " "+this.salary+" "+this.ceo);
    }
    
    
    static { //Executed  when u load a class , & it will be executed before constructor, 
            //also cannot use non-static variable in static block
        ceo = "Ramesh";
        System.out.println("called from static");
    }   
}


class Outer{   //Outer.class file will be generated
    int j ; 
    public void show (){
        System.out.println("outer class -- show method");
    }
    
    class Inner{       //Outer$Inner.class will be generated
        int i ;
    
        public void display(){
            System.out.println("Inner class  - display method");
        }
        public void display(int i){
            this.i = i ;
            System.out.println("value entered : "+i);
        }
    }
     
    static class Inner2nd { // Outer.$Inner2nd class file will be generated 
         static int k ; 
         int x;
         
         Inner2nd(){
             
         }
         
         Inner2nd(int x, int k){
             this.x = x ; 
             this.k = k;
             System.out.println("Constructor of Inner2nd with value  x : "+this.x + " , k : "+k);
         }
         
         
    public static void display(){
        System.out.println("2nd Inner class, within Outer Class");
    }
    public void showX(){
        //this.x = x ;
        System.out.println("2nd Inner class value of x : "+x);
    } 
        public void showK(){
        
        System.out.println("2nd Inner class value of static k : "+this.k);
    } 
}
}

public class test_1 {
    public static void main(String[] args) {

/*        
        Outer ob = new Outer(); // Object created for Outer class 
        ob.show();
        
        Outer.Inner in = ob.new Inner(); // when Inner class in not static , then create the object of Outer
                                        // class and then use that object of Outer class to create a object of 
                                        // Inner class 
        in.display();
        in.i = 64 ; 
        in.display(in.i);
        */

        Outer.Inner2nd in2nd = new Outer.Inner2nd(40,20); //when Inner2nd class is static , then no need to 
                                        //create the object of Outer class , you can create object of Inner class like this.
                                         
        in2nd.showK();
        in2nd.showX();
        
        System.out.println("=============");
        Outer.Inner2nd obj3 = new Outer.Inner2nd();
        obj3.showX();
        obj3.showK();
        
        System.out.println("=============");
        
        Outer.Inner2nd obj2 = new Outer.Inner2nd(200,300);
        obj2.showK();
        obj2.showX();
        System.out.println("=============");
        //Outer.Inner2nd obj3 = new Outer.Inner2nd();
        obj3.showX();
        obj3.showK();
        
        
        
        
        
        
        
        /*
        A obj1 = new A(10.4,2.5);  // knows someting and does something 
        obj1.perform();
        
        MethodOverloadingDemo mo = new MethodOverloadingDemo();
        mo.add(5, 90);
        mo.add(4, 6,4);
        mo.add(10,20,30,40,50);
*/        
        
  /*      
        Emp Rahul = new Emp();
        Rahul.eid = 10;
        Rahul.salary = 10000;
//        Emp.ceo = "ABC";
               Rahul.show();
        Emp Ram = new Emp();
//        Ram.eid = 20;
//        Ram.salary = 50000;
//        Emp.ceo = "ABC";
        
 
        Ram.show();
        
        Emp.ceo = "XYZ" ; 
        System.out.println("After change ");
        
        Rahul.show();
        Ram.show();
    
        */
  
        
        /*
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter multiply-table of number : ");
        float n = sc.nextFloat();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+i*n+"\n");
        }
        System.out.println("Thank You !! ");
*/
    }

}
