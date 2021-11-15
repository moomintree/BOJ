import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			int stu = Integer.parseInt(st.nextToken());
			int arr[] = new int[stu];
			double sum=0;
			for(int j=0;j<stu;j++)
			{
//				arr[j] = Integer.parseInt(br.readLine());
//				sum=sum+arr[j]; --> 형변환 오류 발생한 코드
				int num = Integer.parseInt(br.readLine());
				arr[j]=num;
				sum=sum+num;
			}
					
			double avg = (sum / stu);
			double count=0;
			for(int j=0;j<stu;j++)
			{
				if(arr[j]>avg)
				{
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/stu)*100);
		}
	}

}
/*
 * 5
	5 50 50 70 80 100
	7 100 95 90 80 70 60 50
	3 70 90 80
	3 70 90 81
	9 100 99 98 97 96 95 94 93 91
*/
