package gangadharprograms;

public class Forloop_sum_pdt
{

	public static void main(String[] args)
	{
	
    int prd=1;
    int sum=0;
    for(int i=1;i<=20;i++)
    {
    	if(i%2==0)
    	{
    		sum=sum+i;
    	}
    	if(i%2!=0)
    	{
    
    	prd=prd*i;
    }
    }
    System.out.println(sum);
    System.out.println(prd);
	}
}
    	