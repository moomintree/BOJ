import java.util.Scanner;
import java.util.Arrays;


public class ����8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "O";
		String b = "X";
		int count = 0;
		int countS = 0;
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			String[] arr = s.split("");
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[j].equals(a))
				{
					count++;
					countS += count;
				}
				else if(arr[j].equals(b))
				{
					count = 0;
				}
						
			}
			
			System.out.println(countS);
			count = 0;
			countS = 0;
			
		}
		

	}
}
/*
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringBuilder sb = new StringBuilder();
		int test_case = Integer.parseInt(br.readLine());	//�׽�Ʈ ���̽�
		
		String arr[] = new String[test_case];
 
		for (int i = 0; i < test_case; i++) {
			arr[i] = br.readLine();
		}
 
		
		for (int i = 0; i < test_case; i++) {
			
			int cnt = 0;	// ����Ƚ��
			int sum = 0;	// ���� �ջ� 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			sb.append(sum).append('\n');
		}
		
		System.out.print(sb);
	}
}
*/