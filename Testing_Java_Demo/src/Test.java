/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 */
public class Test {
    private static Object s = new Object();
    private static int count = 0;
    public static void main(String[] argv){
        for(;;){
            new Thread(new Runnable(){
                
                    public void run(){
                        synchronized(s){
                            count += 1;
                            System.err.println("New thread #"+count);
                        }
                        for(;;){
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e){
                                System.err.println(e);
                            }
                        }
                    }
                }).start();
        }
    }
    
    
}
    
    
    
    
    
    
//         static int x ;
//         static {
//              x  = 343;
//             
//         }
//        
        
//    public static void main(String[] args) {
//        
//        System.out.println(x);
//        System.out.println(Test.x);
//        
//        String s = "abcds";
//        
//        System.out.println("sumit"+10+"abc"+s);
//        s= s;
//        Object[] o = new Object[3];
//        Thread n1 = new Thread();
//        Float n2 = new Float(20.04);
//        String s1 = new String("abcds");
//        String s2 = new String("abcds");
//        
//        
//        Number n[] = new Number[5];
//        n[0] = new Float(32.53);
//        System.out.println(n[0]==n2);
//        n[0] = n2;
//        System.out.println(n[0]==n2);
//        o[0] = new Float(423.4387);
//        System.out.println(o[0]==n2);
//        o[0]= n2;
//        System.out.println( o[0]==n2);
//        
//        Test t = new Test();
//        int xy = t.sum (new int[]{10,20,20,30});
//        System.out.println(xy);
//    }
//    
//      int sum(int... a){
//        int total=0;
//        for(int x:a){
//            total +=x;
//        }
//        return total;
//    }

