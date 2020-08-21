class duplicateElement
{
	public static void Duplicate(int[] arr,int n)
	{ 
		for (int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				
					System.out.println(arr[j]);
			}	
		}
	}
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]),j=1;
		int arr[]=new int[n];
		for (int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(args[j]);
			j++;			
		}	
		Duplicate(arr,n);
	}
}