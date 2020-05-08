package javapractice.Calendar;

import java.util.Scanner;

public class MonthCheck
{
	public static void main(String[] args)
	{
		int monthDate[] = new int[12];
		
		for(int i = 1; i < 13; i++)
		{
			if(i < 8) 
			{
				if(i % 2 == 0)
				{
					monthDate[i-1] = 30;
				}
				else monthDate[i-1] = 31;
			}
			else if(i % 2 == 1)
			{
				monthDate[i-1] = 30;
			}
			else monthDate[i-1] = 31;
		}
		monthDate[1] = 28;
		
		Scanner scanner = new Scanner(System.in);
		
		String monthString;
		System.out.println("월을 입력해주세요.");
		monthString = scanner.next();
		int month = Integer.parseInt(monthString);

		if(month < 13 && 0 < month)
		{
			System.out.printf("%d월은 %d일까지 입니다.\n", month, monthDate[month-1]);
		}
		else System.out.println("1부터 12 사이의 숫자를 입력해주세요.");
		
		scanner.close();
	}
}
