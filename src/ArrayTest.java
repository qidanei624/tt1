class ArrayTest
{
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++){
			if(max < arr[x])
				max = arr[x];
		}
		
		return max;
	}
	
	public static void main(String[] args){
		
		int[] arr = {4,8,1,3,9,5};
		
		int max = getMax(arr);
		System.out.println(max);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}