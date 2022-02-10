/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 */
public class bubble_sort {
    
    public static void main(String[] args) {
        
        int []a ={45,23,56,64,2351,12,1234,326,123456,23,13456,234,623415,3451345,1513,523,556456,6346,346345,63,451};
        int i,j,swapped=0,k;
        System.out.println("BEFORE BUBBLE SORTING ");
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
        
        for(i=0;i<a.length;i++){
            swapped =0;
            for(j=0;j<a.length-i-1;j++){
                if( a[j] < a[j+1])
                {
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1] =k ;
                    swapped =1;
                }
            }
            if(swapped == 0)
                break;
        }
         System.out.println("AFTER BUBBLE SORTING ");
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        
        
    }
}
