package gangadharprograms;

public class armstrong_number
{

	public static void main(String[] args) 
	{
	
         int num =153,rem,arm=0,temp=num;
          while(num>0)//   153>0   15>0   10>0
          {
        	  rem=num%10;// 3        5      0
        	  num=num/10;// 15      10      1
     arm=arm+rem*rem*rem;// 27      152    153
          }
          if(temp==arm)  //   153==153
        	  System.out.print(temp+" armstrong number");
          else
        	  System.out.print(temp+" non armstrong number");
	}

	}


