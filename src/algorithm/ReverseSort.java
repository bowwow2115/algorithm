package algorithm;

public class ReverseSort {
	
	public static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}
	
	public static void reverse(int[] array) {
		int right;
		for(int i=0;i<array.length/2;i++) {
			right = array.length-1-i;
			swap(array, i, right);
			System.out.println("a["+i+"]"+"과 a["+right + "]를 교환합니다.");
		}
	}
	
	public static void  main(String[] args) {
		int[] arrays ={1,2,3,4,5};
		reverse(arrays);

		for(int i : arrays){
			System.out.println(i);
		}
	}
}
