package user_definemethod;

 class without_arguments
{
public static void areaoftri()
{ 
	int b=5,h=6;
	float a=0.5f,area_t;
	area_t=a*h*b;
	System.out.println("area of triangle: "+area_t);
}
public static void cirofcir()
{
	int R=8;
	float pie=3.14f,cirof_c;
	cirof_c=pie*2*R;
 System.out.println("circumferance of circle: "+cirof_c);
}
public static void main(String args[])
{
	areaoftri();
	cirofcir();
}
}