package upto_section3;

import java.util.Scanner;

public class Ex2 {
    public static void search(){

    }
    public static void main(String[] args){
        int[] array = {19,12,22,34,1,5,6};
        String tab ="\t";
        Scanner sc = new Scanner(System.in);

        System.out.print("찾는 숫자를 입력하세요: ");
        int val = sc.nextInt();
        System.out.println("\t|\t0\t1\t2\t3\t4\t5\t6\t");
        System.out.println("----+--------------------------------------------");
        for(int i=0;i<array.length;i++){
            tab = new String(new char[i]).replace("\0", "\t");
            System.out.println("\t|\t" + tab + "*");
            System.out.println("\t|\t0\t1\t2\t3\t4\t5\t6\t");
            if (array[i] == val) {
                System.out.println(val + "는 x[" + i + "] 에 있습니다.");
                return;
            }
        }

    }
}
