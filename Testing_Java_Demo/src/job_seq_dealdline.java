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
public class job_seq_dealdline {
    
    public static void main(String[] args) {
       
     
        int profit[] ={2,4,3,1,10};
        int deadline[] = {3,3,3,4,4};
        //int maxi = Arrays.stream(deadline).max().getAsInt();
        
        
        
        int max , i ,j , k ,x = deadline[0];
        
         System.out.println(" Given Profit : ");
        for(i =0; i< profit.length;i++){
            System.out.print("  "+profit[i]);
        }
         System.out.println("");
                System.out.println("Given Deadline : ");
        for(i =0; i< deadline.length;i++){
            System.out.print("  "+deadline[i]);
        }
        
        
        
        for(i=1;i<deadline.length;i++){ // find the maximum from deadline , to know how many job that can schedule
        if(x<=deadline[i]){
            x = deadline[i];
        }
        }
        max = x ;
        int swapped = 0;
        for(i=0;i<profit.length;i++){  // sorting descending order the profit array corresponding with its deadline
            swapped = 0; 
            for(j=0;j<profit.length-i-1;j++){
                if(profit[j]<profit[j+1]){
                    k = profit[j];
                    profit[j] =  profit[j+1];
                    profit[j+1] = k;
                    
                    k = deadline[j];
                    deadline[j] = deadline[j+1];
                    deadline[j+1] = k;
                    
                    swapped = 1;
                }
            }
            
        }

        // insert the -ve profit into that array as default 
        
         int arr[] =new int[max];
         for(i = 0; i<arr.length;i++){
             arr[i] = -9999;
         }
          // Job  Sequence Algorithm 
         for(i= 0 ;i<max ; i++){
             x= deadline[i];
             {
                 for(j=arr.length-1;j>=0;j--){
                     if(j+1<=x && arr[j]== -9999)
                     {
                         arr[j] = profit[i];
                          break;
                     }
                    
                 }
             }
             
         }
         
         // print the  profit -array  
         System.out.println();
         System.out.println(" profit array  :  ");
         for(i=0;i<arr.length ;i++){
             System.out.print(arr[i] + " ");
         }
         
    int total_profit = 0;
    for(i=0;i<arr.length;i++)
        total_profit += arr[i];
    
        System.out.println("");
        System.out.println("Maximum  Profit : "+total_profit);

    }

}
