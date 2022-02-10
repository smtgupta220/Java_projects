/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 * 
 * Greedy algo 
 * 1: sort the p/w ratio in decreasing order
 * apply greedy algo on that problem 
 */
public class Greeedy_KnapSack {
    
    public static void main(String[] args) {
        
        int []profit = {25,24,15};
        int weight[] = {18,15,10};
        int m = 20,n =weight.length; 
        float pw[] = new float[weight.length],temp;
        int i,j,k,swapped;
        for(i=0;i<n;i++){
            pw[i] = (float)profit[i]/(float)weight[i];
        }
        // print p/w ratio
        for(i=0;i<n;i++){
            System.out.print(pw[i]+ " ");
        }
        System.out.println("\n");
        
       //bubble sort according to the p/w ratio
      
       for(i=0;i<n;i++){
           swapped =0 ;
           for(j=0;j<n-i-1;j++){
               if(pw[j]<pw[j+1]){
                   temp = pw[j];
                   pw[j] = pw[j+1];
                   pw[j+1]= temp;
                   swapped = 1;
                   // swap profit 
                   k = profit[j];
                   profit[j] = profit[j+1];
                   profit[j+1] = k;
                   // swap corresponding weight 
                   k = weight[j];
                   weight[j]= weight[j+1];
                   weight[j+1] = k;
               }
           }
             if(swapped == 0)
                   break;
       }
       
       // print p/w ratio and their profit & weight 
                  System.out.println("Profit : ");
       for(i=0;i<n;i++){
           System.out.print(profit[i]+"   ");
       }
                         System.out.println("\nWeight : ");
       for(i=0;i<n;i++){
           System.out.print(weight[i]+"   ");
       }
                         System.out.println("\nP/Wt Ratio: ");
       for(i=0;i<n;i++){
           System.out.print(pw[i]+"  ");
       }  
    // greedy algorithm 
    float Final_profit = 0  ; 
    for(i=0;i<n;i++){
        if(m>0 && weight[i]<=m){
            m = m-weight[i];
            Final_profit +=profit[i];
        }
        else
            break;
    }
    if(m>0 && i<n){
        Final_profit += pw[i]*m;
    }
        System.out.println("\nMAXIMUM PROFIT : "+ Final_profit);
    }
    
}
