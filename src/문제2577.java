import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// ������ �Է¹޾� �������¿��� �� ó�� �� ���ڿ��� ��ȯ �� �迭 ���·� ���� �� ���ڰ� ��Ÿ�� Ƚ�� ��� �ʿ��غ���.
public class ����2577 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count[] = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int sum = a*b*c;
		String str = String.valueOf(sum);
		String arr[] = str.split("");
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(Integer.parseInt(arr[i])==j)
				{
					count[j]++;
					break;
				}
				
			}
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(count[i]);
		}
		
	}

}
