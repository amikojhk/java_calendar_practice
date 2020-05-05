package javapractice.Calendar;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		String a1, b1;
		
		System.out.println("두 개의 값을 입력해주세요");
		a1 = scan.next();
		b1 = scan.next();
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		
		int result = Hap(a, b);
		
		System.out.printf("%d와 %d의 합은'%d'입니다", a, b, result);
		
		scan.close();
	}

	public static int Hap(int x, int y) {
		int result = 0;

		result = x + y;

		return result;
	}
}