import java.util.Scanner;
class Sample
{
	public static void main(String args[])
	{
		int F;
		float C;
		Scanner sc=new Scanner(System.in);

		F=sc.nextInt();

		C=(float)((F-32)*5)/9;;

		System.out.format("%.2f",C);
	}
}
