package section6;

import java.util.Random;

public class SelectedSortUpgrade {

    public static void selectSort(int[] array){
        int start = 1;
        String tab = "\t";

        for(int i = 1; i < array.length; i++){
            int j;
            int tmp = array[i];
            for(j=i; j>0 && array[j-1] > tmp; j--){
                array[j] = array[j-1];

                //i=2일 때
                //6754321 -> 6774321 -> 6674321
            }
            array[j] = tmp;
        }
        System.out.println("결과");
        for(int item : array){
            System.out.print(item + "\t");
        }
    }

    public static void main(String args[]){
        Random rd  = new Random();
        int[] array = {7,6,5,4,3,2,1};
        System.out.println();
        selectSort(array);


    }
}
