import java.util.*;
class array9 {
public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [10];
		int sum = 0;
		int min=0 , max=0;
		for (int i = 0; i<10; i++)
		{
			arr[i] = sc.nextInt();
			max = arr[0];
			min = arr[0];
				if(min>arr[i])
				min = arr[i];
			if(max<arr[i])
				max = arr[i];
		}
		System.out.println(min);
		System.out.println(max);
	}
}