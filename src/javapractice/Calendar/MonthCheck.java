package javapractice.Calendar;

import java.util.Scanner;

public class MonthCheck {
	public static void main(String[] args) {
		int monthDate[] = monthSet();

		monthCheck(monthDate);

		System.exit(0);
	}

	public static int[] monthSet() {
		int monthDate[] = new int[12];
		for (int i = 1; i < 13; i++) {
			if (i < 8) {
				if (i % 2 == 0) {
					monthDate[i - 1] = 30;
				} else
					monthDate[i - 1] = 31;
			} else if (i % 2 == 1) {
				monthDate[i - 1] = 30;
			} else
				monthDate[i - 1] = 31;
		}
		monthDate[1] = 28;

		return monthDate;
	}

	public static void monthCheck(int md[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		int month = 0;
		while (month != -1) {
			System.out.print(">");
			month = scanner.nextInt();
			if (month == (-1)) {
				System.out.print("프로그램을 종료합니다");
				break;
			} else if (month > 12 || 1 > month) {
				System.out.println("1부터 12 사이의 숫자를 입력해주세요.");
			} else
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, md[month - 1]);
		}
		scanner.close();
	}
}