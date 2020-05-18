package javapractice.Calendar;

import java.util.Scanner;

public class CalendarClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("연월을 입력해주세요.");
		int year = 0;
		int month = 0;
		while (month != -1) {
			System.out.print("연> ");
			year = scanner.nextInt();
			System.out.print("월> ");
			month = scanner.nextInt();
			if (month == (-1)) {
				System.out.print("프로그램을 종료합니다");
				break;
			} else if (month > 12 || 1 > month) {
				System.out.println("1부터 12 사이의 숫자를 입력해주세요.");
			} else
				calPrint(year, month);
		}
		scanner.close();
	}

	public static int[] monthCheck(int year) {
		int monthDate[] = new int[12];
		for (int i = 1; i <= 12; i++) {
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
		if ((year % 400) == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
			monthDate[1] = 29;
		} else
			monthDate[1] = 28;
		return monthDate;
	}

	public static void calPrint(int year, int month) {
		int monthDate[] = monthCheck(year);

		System.out.printf("%d년 %d월 달력\n", year, month);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.print("---------------------------");
		for (int i = 1; i <= monthDate[month - 1]; i++) {
			if ((i % 7) == 1) {
				System.out.print("\n");
			}
			System.out.printf("%2d  ", i);
		}
		System.out.printf("\n%d년 %d월은 %d일까지 있습니다.\n", year, month, monthDate[month - 1]);
	}
}
