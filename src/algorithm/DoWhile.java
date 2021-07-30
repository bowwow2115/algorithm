package algo;

import java.util.Scanner;

public class DoWhile {
	public String doWhile() {
		Scanner scan = new Scanner(System.in);
		int a;
		int count = 1;
		int i = 1;
		do {
			System.out.println("자연수를 입력하세요: ");
			a = scan.nextInt();
		} while (a <= 0);

		while (true) {
			if ((a / i) < 10) {
				return ("자릿수는 "+count+" 입니다.");
			}
			count += 1;
			i *= 10;
		}
	}
}
