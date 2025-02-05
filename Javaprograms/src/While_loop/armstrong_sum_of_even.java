package While_loop;

public class armstrong_sum_of_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long num=8824686428688868888l,rem,sum=0;
while(num>0)
{
	rem=num%10;
	num=num/10;
	if(rem%2==0)
	{
		sum=sum+rem;
	}
}
System.out.print("sum is :" +sum);
	}

}
