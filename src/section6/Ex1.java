package section6;

import java.util.Random;

public class Ex1 {
    public static void BubbleSort(int[] array){
        int temp = 0;
        int index = array.length-1;

        for(int j = 0; j<array.length-1;j++) {
            for (int i = 0; i < index; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            index -= 1;
            System.out.println(index);
        }
        System.out.println("결과");
        for (int item : array){
            System.out.println(item);
        }
        //4,3,2,1
    }
    public static void main(String[] args){
        Random rd = new Random();
        int[] array = new int[5];
        for(int i=0; i<5; i++){
            array[i]=rd.nextInt(100);
            System.out.println(i+"번째: "+array[i]);
        }
        BubbleSort(array);
    }
}
