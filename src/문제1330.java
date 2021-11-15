import java.util.Scanner;
public class ¹®Á¦1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		
		if(a>b)
		{
			System.out.println(">");
		}
		else if(a<b)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}
	}

}
