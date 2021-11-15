import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ¹®Á¦1546 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());
		double arr[] = new double[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());			
		}
		double max=0;
		
		for(double num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(arr[i]/max)*100;
			sum=sum+arr[i];
		}
		
		System.out.println(sum/n);
	}


}
