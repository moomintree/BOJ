import java.util.Scanner;
public class ����14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0)
		{
			if(y>0)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(4);
			}
		}
		else
		{
			if(y<0)
			{
				System.out.println(3);
			}
			else
			{
				System.out.println(2);
			}
		}
	}

}
