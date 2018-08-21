/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;
import java.util.Scanner;
import java.util.*;  
/**
 *
 * @author AJEET
 */
public class NewClass1 {
    public static void main(String ar[]) throws Exception
    {
        Scanner var = new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>(); 
        List<Integer> b=new ArrayList<Integer>();
        al.add(2);
        al.add(4);
        al.add(5);
        b=closest(al);
        for(Integer i:b)
            System.out.println(i);
    }

    private static List<Integer> closest(List<Integer> al)throws Exception {
        int a=0,b=0;
        char ch;
        ArrayList<Integer> c=new ArrayList<Integer>();
        c=(ArrayList<Integer>) al;
        Collections.sort(al);
        for(Integer j:al)
        { 
            if (c.size()>1)
            {
                a=c.get(c.size()-1);
                b=c.get(c.size()-2);
                if(a==b)
                {
                    c.remove(c.size()-1);
                    c.remove(c.size()-2);
                }
                else
                {
                    c.remove(c.size()-1);
                    c.remove(c.size()-2);
                    c.add(Math.abs(a-b));
                }
            }
            else
            {
                return(c);
            }
        }
        return(c);
    }
}
