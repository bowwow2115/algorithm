package upto_section2;

public class ArrayCopy {
    public static void copy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            a[i] = b[i];
        }
        for( int item  : a ){
            System.out.println(item);
        }
    }
    public static void rCopy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            a[i] =  b[b.length-1-i];
        }
        for(int item : a){
            System.out.println("rCopy결과: " + item);
        }
    }
    public static void main(String args[]){
        int[] b = {1,2,3,4,5};
        int[] a = new int[b.length];
        rCopy(a,b);
    }
}
