import java.util.Scanner;

public class ¹®Á¦1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		int CN = N;
		
		while(true)
		{
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			
			count++;
			
			if(CN == N)
			{
				break;
			}
		}
		System.out.println(count);
	}

}
