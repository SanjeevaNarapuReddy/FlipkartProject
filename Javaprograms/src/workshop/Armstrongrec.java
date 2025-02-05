package workshop;

public class Armstrongrec {   // by using recursion we can call method itself

	public static int armstrong(int i) {
		
        int temp=i,rem,arm=0,num=i;
				while(i>0)
				{
					rem =i%10;
					i=i/10;
					arm=arm+rem*rem*rem;
				}
				if(temp==arm)
				{
					System.out.println(temp);
				}
				 num=num+1;                        //2                                    1001
				if(num<=1000)                      // true                                false
					return armstrong(num);         // call amstrong method one more time
				else
					return 0;                      //retuen 0 and come out of the loop
	}
public static void main(String[] args) {
	armstrong(1);
}
}
