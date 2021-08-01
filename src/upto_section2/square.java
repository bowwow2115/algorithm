package algo;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		System.out.println("사각형을 출력합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력해주세요: ");
		int line = sc.nextInt();
		for(int i=0;i<line;i++) {
			for(int j=0;j<line;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
