/*
42
84
252
420
840
126
42
84
420
126
// ������ �Ŀ� ���� max�� ���ϸ鼭 ���� ���Ҷ����� count�� +��Ŵ
 * 39
40
41
42
43
44
82
83
84
85
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ����3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		int dif = 0;
		int count = 1;
		for(int i=0;i<10;i++)
		{
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(temp!=arr[i])
				{
					temp = arr[i];
					count++;
				}
				
		}
		
		System.out.println(count);
	}

}
