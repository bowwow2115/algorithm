package upto_section3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static int binSearch(int[] numArray, int val){
        int end = numArray.length-1;
        int start = 0;
        int pivot = 0;
        do{
            String startIndex = "\t|\t";
            pivot = (end + start) / 2;
            //        시작 인덱스 설정
            for(int i = 0; i< numArray.length; i++){
                if(i==start){
                    startIndex += "<-";
                }
                if(i==pivot){
                    startIndex += "+";
                }
                if(i==end){
                    startIndex += "->";
                }
                startIndex += "\t";
            }
            System.out.println(startIndex);
            System.out.print(pivot+"\t|");
            for (int item : numArray){
                System.out.print("\t"+item);
            }
            System.out.println();
            if(numArray[pivot]==val){
                return pivot;
            }else if(numArray[pivot]>val){
                //찾는 값이 기준 값보다 작은 경우
                end = pivot - 1;
//                System.out.println("start: " + start);
//                System.out.println("end: " + end);
            }else{
                start = pivot + 1;
//                System.out.println("start: " + start);
//                System.out.println("end: " + end);
            }

        }while (start <= end);

        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 배열의 길이를 입력하세요: ");
        int length = sc.nextInt();
        int[] numArray = new int[length];
        String startSet = "\t|\t";
        String startSetLine = "----+----";
        for(int i = 0; i<length; i++){
            numArray[i] = i+1;
            startSet += i+"\t";
            startSetLine += "----";
        }


        System.out.print("찾고싶은 숫자를 입력하세요: ");
        int val = sc.nextInt();

        System.out.println(startSet);
        System.out.println(startSetLine);
        System.out.println(Ex4.binSearch(numArray,val));



    }
}