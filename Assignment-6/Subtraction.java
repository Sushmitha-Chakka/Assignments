import java.util.Scanner;
public class Subtraction {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers for doing subtraction");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		if(n1>n2)
		{
			System.out.println("Subtraction result is "+(n2-n1));
		}
		else
		{
			System.out.println("Subtraction result is "+(n1-n2));
		}
		scan.close();
	}
}