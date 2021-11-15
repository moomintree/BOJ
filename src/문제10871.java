import java.util.Scanner;
public class ¹®Á¦10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int cd = sc.nextInt();
		
		for(int i=0;i<=n-1;i++)
		{
			int a = sc.nextInt();
			arr[i]=a;
		}
		
		for(int i=0;i<=n-1;i++)
		{
			if(arr[i]<cd)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
