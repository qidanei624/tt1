
public class ArrayTest3 {
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
	
	public static void main(String[] args){
		int[] arr = {12,3,5,9,1,8,7};
		printArr(arr);
		bubbleSort2(arr);
		printArr(arr);
	}
	public static void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// 利用角标 冒泡排序
	public static void bubbleSort2(int[] arr){
		int idx = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			idx = 0;//必须初始化
			
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[idx] < arr[j+1]) {
					idx = j+1;
				}
				//每圈最后一次比较
				if (j == arr.length-i-2) {
					//System.out.println(j);
					
					if (arr[idx] > arr[j+1]) {
						temp = arr[idx];
						arr[idx] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
