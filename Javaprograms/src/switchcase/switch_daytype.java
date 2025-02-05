package switchcase;

public class switch_daytype {

	public static void main(String[] args)
	{
int daynumb=5;
switch(daynumb)
{
case 1: System.out.print("monday");
break;   
case 2: System.out.print("tuesday");
break;   
case 3: System.out.print("wendsday");
break;   
case 4: System.out.print("thursday");
break;   
case 5: System.out.print("friday");
         break;                         /* keyword which indicate us to stop the current operation and make jvm to come  out of the current executing body*/ 
        
case 6: System.out.print("saturday");
         break;
case 7: System.out.print("sunday");
         break;
default :System.out.print("invalid day");     // it is not compulsory to mention default
}
	}

}
