class decimalToBinary
{
	public static void dtb(int a)
	{
		int i=0;
		int arr[]=new int[10];
		while(a>0)
		{
			arr[i++]=a%2;
			a=a/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		dtb(a);	
	}
}