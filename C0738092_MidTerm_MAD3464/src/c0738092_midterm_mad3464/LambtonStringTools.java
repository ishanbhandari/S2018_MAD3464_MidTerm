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
public class LambtonStringTools{
    private String string1;
    
    
    public void reverse()
    
    {
        String s = "Lambton";
        StringBuilder i= new StringBuilder();
        i.append(s);
        i=i.reverse();
        System.out.println(i);
        
}
    public void binaryToDecimal(String s)
    {
        this.string1= s;
        char[] charArray= {};
        charArray= s.toCharArray();
        for (int i=0; i<charArray.length; i++)
            {
            
                
            }
        }
        
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
                
                System.out.println(t.charAt(0) );
            }   
        }
        
        public void mostFrequent(String s)
        {
            this.string1= s;
            char[] charArray;
            int count=0;
            
            charArray =s.toCharArray();
            for (int i=0; i<charArray.length-1 ;i++)
            { 
                for (int j=1; j<charArray.length-1 ;j++)
            
            if (charArray[i] == (charArray[j]))
                count = count+1;
                
                System.out.println(charArray[i]+ "---->" + count);
                else ()
                     
                System.out.println(count);
                
            }
        }
}

                
                
            
                



            
        
        
        
    
            
    

 
    
    
        
        
       
 

            
   
