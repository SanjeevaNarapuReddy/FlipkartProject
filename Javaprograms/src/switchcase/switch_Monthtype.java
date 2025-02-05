package switchcase;

public class switch_Monthtype {

	public static void main(String[] args)
 {
	int monthnum =8;
	switch (monthnum)
	{
	case 1:
	case 2:
	case 3:
	case 4:System.out.print("summer");
	       break;
	case 5:
	case 6:
	case 7:
	case 8: System.out.print("winter");
	        break;
	case 9:
	case 10:
	case 11:
	case 12: System.out.print("rainey");
	        break;
	default:System.out.print("invaild month");
	

	}

	}

}
