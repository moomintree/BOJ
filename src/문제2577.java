import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 정수로 입력받아 정수상태에서 값 처리 후 문자열로 변환 및 배열 형태로 만들어서 각 숫자가 나타난 횟수 출력 필요해보임.
public class 문제2577 {

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
