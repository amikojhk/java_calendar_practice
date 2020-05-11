package javapractice.Calendar;

import java.util.Scanner;

public class MonthCheck {
	public static void main(String[] args) {

		int monthDate[] = monthSet();

		Scanner scanner = new Scanner(System.in);

		System.out.println("몇 번 반복할까요?");
		int month[] = monthInput(scanner.nextInt());
		
		scanner.close();

		System.out.println("계산 결과를 출력합니다.");
		monthOutput(monthDate, month);
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

	public static int[] monthInput(int rc) {
		int month[] = new int[rc];

		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		for (int i = 0; i < rc; i++) {
			System.out.printf("%d번째 입력:", (i + 1));
			month[i] = scanner.nextInt();
		}
		scanner.close();
		return month;
	}

	public static void monthOutput(int md[], int m[]) {
		int i = 0;
		while (i < m.length) {
			if (m[i] < 13 && 0 < m[i]) {
				System.out.printf("%d월은 %d일까지 입니다.\n", m[i], md[m[i] - 1]);
			} else
				System.out.println("1부터 12 사이의 숫자를 입력해주세요.");
			i++;
		}
	}
}