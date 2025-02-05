package Sting.prog;

public class wordrepeat {

	public static void main(String[] args) {
String s=" we are happy and we want to be happy";
String str[]=s.split(" ");
int count=0;
for(String d:str)
	{
	if(d.equals("happy"))
	{
		count++;
	}
	}
System.out.println("count is : "+count);
	}

}
