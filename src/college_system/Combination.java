/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

/**
 *
 * @author AJEET
 */

import java.io.*;
import java.util.*;
import java.math.*;
public class Combination {
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
   find(n,k,"",1,0,0);
                    }

    private static void find(int n, int k, String string, int j,int count,int sum) {
if(count==k && sum==n)
{
    System.out.println(string);
}
if(sum>n || count>k)
    return;
for(int i=j;i<n;i++)
{
   
    find(n,k,string+" "+i,i+1,count+1,sum*i);
}
}
}
