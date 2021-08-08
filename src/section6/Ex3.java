package section6;

import java.util.Random;

public class Ex3 {
    public static void BubbleSort(int[] array){
        int temp = 0;
        int index = array.length-1;
        int countCompare = 0;
        int countChange = 0;

        for(int j = 0; j<array.length-1;j++) {
            System.out.println(j+1+"구간: ");
            countChange = 0;
            for (int i = 0; i < index; i++) {
                if (array[i] > array[i + 1]) {
                    for(int item=0; item<array.length; item++){
                        if(item==i){
                            System.out.print(array[item]+" + ");
                            countCompare++;
                        }
                        else{
                            System.out.print(array[item]+"   ");
                        }
                    }
                    countChange++;
                    System.out.println();
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                else{
                    for(int item=0; item<array.length; item++) {
                        if (item == i) {
                            System.out.print(array[item] + " - ");
                            countCompare++;
                        } else {
                            System.out.print(array[item] + "   ");
                        }
                    }
                    System.out.println();
                }
            }
            if(countChange==0) {
                System.out.println("정렬이 이미 완료되었습니다.");
                System.out.println("결과");
                for (int item : array){
                    System.out.print(item+"\t");
                }
                return;
            }
            index -= 1;
        }
        System.out.println("결과");
        for (int item : array){
            System.out.print(item+"\t");
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
