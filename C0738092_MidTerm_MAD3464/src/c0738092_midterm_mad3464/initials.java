/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738092_midterm_mad3464;

/**
 *
 * @author macstudent
 */
public class initials {
    private String string1;
    public void initials(String s)
        {
            this.string1= s;
            String temp;
            String t;
            String[] split = s.split(" ",2);
            for (int i=0; i<split.length; i++)
            {   
                temp =split[i];
                t= temp.toUpperCase();
                
                System.out.println("initialized String: " + t.charAt(0));
            }   
        }
    
}
