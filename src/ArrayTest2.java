
public class ArrayTest2 {

	public static void selectSort(int[] arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]){
		int[] arr = new int[]{4,2,9,7,3,1,6};
		int[] arr2 = new int[]{14,21,9,7,31,1,6};
		selectSort(arr);
		selectSort(arr2);
		printArr(arr);
		printArr(arr2);
	}
	
	public static void printArr(int[] arr){
		String str="";
		
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				str += arr[i]+",";
			}else {
				str += arr[i];
			}
		}
		System.out.print("{" + str + "}");
		System.out.println();
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

