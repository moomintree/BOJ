import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����2562 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int arr[] = new int[9];
		
		for(int i=0;i<9;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		int index = 0;
		int max = 0;
		
		for(int value:arr)
		{
			count++;
			
			if(value>max)
			{
				max=value;
				index=count;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
