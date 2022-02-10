/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 */
public class Build_max_heap {
 
    public static void MAX_HEAPIFY(int []a,int n,int i){
        int l = 2*i+1,r=2*i+2,largest=i;
	if(l<n && a[l]>a[i])
	largest = i;
	else
	largest =r ;
	if(r<n && a[r]>a[largest])
	largest =r;
	if(largest!=i)
	swap(a[i],a[largest]);
	
	MAX_HEAPIFY(a,n,largest);
        return ;
		
    }
public static void swap(int x,int y){
	int z = x;
	x=y;
	y=z;
}
     
    
    public static void BUILD_MAX_HEAP(int []a,int size){
        int i;
        for(i=size/2-1;i>=0;i--)
            MAX_HEAPIFY(a,size,i);
    }
    
    
    public static void main(String[] args) {
        
        int arr[]= {53,21,63,64,86,21,69,110,94};
	int size = arr.length;
	int i=0;
	for(i=0;i<size;i++)
	System.out.print(arr[i]+"  ");
        System.out.print("\n\n");
        
	BUILD_MAX_HEAP(arr,size);
	System.out.print("===== after max-heapify algo=====");
	for(i=0;i<size;i++)
	System.out.print(arr[i]+"  ");
	
    }
}
