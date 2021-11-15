import java.util.Scanner;
public class ¹®Á¦10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] arr = new int[c];
		
		for(int i=0;i<c;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i]=a+b;
		}
		
		for(int j=0;j<c;j++)
		{
			System.out.println(arr[j]);
		}
	}

}
