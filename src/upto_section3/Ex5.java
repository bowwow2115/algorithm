package upto_section3;

import java.util.Scanner;

public class Ex5 {
    public static int binSearch(int[] numArray, int val){
        int end = numArray.length-1;
        int start = 0;
        int pivot = 0;
        do{
            pivot = (end + start) / 2;
            if(numArray[pivot]==val){
                for(int i=0; i<pivot; i++){
                    if(numArray[pivot-i]==numArray[pivot]){
                        pivot = pivot-i;
                        continue;
                    }
                    return pivot;
                }
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
    public static void main(String[] args){
        int[] numArray = {1,3,5,7,7,7,8,8,9,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾고싶은 값을 입력하세요: ");
        int val = sc.nextInt();
        int answer = binSearch(numArray, val);
        System.out.println(answer+"에 위치합니다.");
    }
}
