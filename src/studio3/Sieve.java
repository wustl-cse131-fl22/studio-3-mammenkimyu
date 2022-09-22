package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for (int x = 0; x < arr.length; x++)
		{
			arr[x] = x+1;
		}
		
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = 1; j < arr.length; j++)
			{
				if (arr[j] % arr[i] == 0 && arr[i] > 0)
				{
					if(arr[j] != arr[i])
							arr[j] = -1;
				}
			}
			if (arr[i] != -1)
			{
				System.out.print(arr[i] + ", ");
			}
		}
		
	}

}
