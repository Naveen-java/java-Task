public class greatestElement
{
	public static void Greatest(int[] arr,int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
	}
    
	public static void main(String[] args) 
	{
	    int n=Integer.parseInt(args[0]),j=1;
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=Integer.parseInt(args[j]);
		    j++;
		}
		Greatest(arr,n);
		
	}
}