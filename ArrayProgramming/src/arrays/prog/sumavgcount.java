package arrays.prog;



public class sumavgcount {

	public static void main(String[] args) {

	int a[]=new int[] {11,12,13,14,15};
		int sum=0,count_p=0;
			for(int i=0;i<a.length;i++)//0-4 index 11,12,13,14,15
			{
			
				int count=0;//for each number division count should start with zero
				for(int j=1;j<=a[i];j++)
				{
			if(a[i]%j ==0)//12%1-12%12,13%1-13%13------15%1-15%15
			{
				count++;
			}
				}
				if(count==2)
				{
				sum=sum+a[i];//0+11+13
				count_p++;
				}
			}
		float avg=sum/count_p;//24/2
		System.out.println("Sum :"+sum);
		System.out.println("Avg :"+avg);
		System.out.println(" Count : "+count_p);
	}

}
		
		