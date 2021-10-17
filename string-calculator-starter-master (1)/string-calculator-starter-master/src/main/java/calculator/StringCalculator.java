package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class StringCalculator {

    public int add(String input) 
    {
    	int sum = 0;
    	StringTokenizer st = new StringTokenizer(input,",");
    	while(st.hasMoreTokens())
    	{
    		int a = 0;
    		String temp = st.nextToken();
    		try
    		{
    			a = Integer.parseInt(temp);
    		}
    		catch(Exception e)
    		{
    			a = 0;
    		}
    		sum = sum + a;
    	}
    	
    	System.out.println(input+"  "+sum);
        return sum;
    }
  

}