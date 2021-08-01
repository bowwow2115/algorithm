package upto_section3;

public class Ex3 {

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0;
        int idxOfIdx = 0;
        for(int item : a){
            if(item == key){
                idx[idxOfIdx] = count;
                idxOfIdx++;
            }
            count++;
        }
        return idxOfIdx;
    }
    public static void main(String args[]){
        int[] a = {1,9,2,9,4,6,7,9};
        int[] idx = new int[a.length];
        int answer = searchIdx(a, a.length, 9, idx);
        System.out.println(answer);

    }
}
