package javapractice.Calendar;

import java.util.Scanner;

public class CalendarClass {
	public static void main(String[] args) {
		int monthDate[] = monthCheck();
		
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
				calPrint(month, monthDate);
		}
		scanner.close();
	}
	
	public static int[] monthCheck() {
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
	
	public static void calPrint(int m, int md[]) {
		System.out.printf("%d월 달력\n",m);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("---------------------------");
		for (int i = 1; i <= md[m-1]; i++) {
			if ((i % 7)-1 == 0) {
			System.out.print("\n");
			}
			if ( i < 10) {
				System.out.print(i + "   ");
			} else {
				System.out.print(i + "  ");
			}
		}
		System.out.printf("\n%d월은 %d일까지 있습니다.\n", m, md[m-1]);
	}
}
