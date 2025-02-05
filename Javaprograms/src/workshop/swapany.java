package workshop;

import java.util.Scanner;

public class swapany {   

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	
	int option =s.nextInt();
	switch(option)
	{
	case 1:int a=10,b=20,c;
	       System.out.println("before swap " +a+" "+b);
           c=a;
	       a=b;
	       b=c;
	       System.out.println("after swap " +a+" "+b);
	break;
	
	case 2:int mul=7;
	       for(int i=6;i>=1;i--)
           System.out.println("seven facotial are "+mul*i);
	break;
	
	case 3:for(int i=1;i<=100;i++)
           if(i%30!=0)
   	       System.out.println(i);
   	break;
   	
	case 4: for (int i=1;i<=10;i++)
	       System.out.println("5*"+i+"="+5*i);
    break;
	}
	}
	}

     
   