package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class StringCalculator {

    public int add(String input) 
  {
	  	int sum = 0;int a = 0;
	  	int length = input.length();
	  	String temp = "";
	  	for(int i=0;i<length;i++)
	  	{
	  		char curr = input.charAt(i);
	  		if(curr==',' || curr=='\n')
	  		{
	  			a = 0;
	  	  		try
	  	  		{
	  	  			a = Integer.parseInt(temp);
	  	  		}
	  	  		catch(Exception e)
	  	  		{
	  	  			a = 0;
	  	  		}
	  	  		sum = sum + a;
	  	  		temp = "";
	  		}
	  		else
	  		{
	  			temp = temp + curr;
	  		}
	  	}
	  	
	  	a = 0;
		try
		{
			a = Integer.parseInt(temp);
		}
		catch(Exception e)
		{
			a = 0;
		}
		sum = sum + a;
		temp = "";
	  	
	  	System.out.println(input+"  "+sum);
	    return sum;
  }

}