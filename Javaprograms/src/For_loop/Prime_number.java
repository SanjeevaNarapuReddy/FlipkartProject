package For_loop;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 7;
		    int count=0;
		    if(num>1) {
		    for (int i = 1; i <= num; i++) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        count++;
		      }
		    }

		    if (count==2)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		    }
		    else
			      System.out.println(num + " is not a valid number.");
		  }
		}

	


