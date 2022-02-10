/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sWX684520
 */
public class bpsc_count {
    
    public static void main(String[] args) {
        int i,j;
        String s = "Newman Software technologies";
        String temp = "";
        char ch;
        for(i= 0;i<s.length();i++){
        ch = s.charAt(i);
        if(temp.indexOf(ch)<0){
            temp+=ch;
          }
        }
        
                System.out.println(temp);
        
    }
}
