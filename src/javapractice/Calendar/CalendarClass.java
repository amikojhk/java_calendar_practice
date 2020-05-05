package javapractice.Calendar;

public class CalendarClass {
	public static void main(String[] args) {
		System.out.println(" Hello, Calendar!\n");
		System.out.println("월   화   수   목   금   토   일");
		System.out.println("-------------------");

		int[][] calArray = new int[4][7];

		int day = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				calArray[i][j] = day;
				day++;
			}

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (calArray[i][j] < 10) {
					System.out.print(calArray[i][j] + "  ");
				} else {
					System.out.print(calArray[i][j] + " ");
				}
			}
			System.out.print("\n");
		}
	}
}
