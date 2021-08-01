package upto_section2;

public class ArraysSumOf {

    static int sumOf(int[] a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }
    public static void main(String args[]){
        int[] a = {1,2,3,4,5};
        int result = sumOf(a);
        System.out.println(result);
    }
}
