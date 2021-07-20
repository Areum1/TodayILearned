class up_arr {
public static void main(String ar[]) {
	int arr[] = { 10,9,8,6,7,5};
	int temp;
	System.out.println("---정렬전---");
	for (int n = 0; n<arr.length; n++)
		{
		System.out.print(arr[n]+" ");
		}
		for (int i = 0; i<arr.length; i++)
		{
			for (int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("");
			System.out.println("---정렬후---");
	for (int m = 0; m<arr.length; m++)
		{
		System.out.print(arr[m]+" ");
		}
		}
	}