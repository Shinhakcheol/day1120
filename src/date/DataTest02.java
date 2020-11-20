package date;

import java.time.LocalDate;
import java.util.Scanner;

public class DataTest02 {

	public static void main(String[] args) {

		int year, month;

		Scanner in = new Scanner(System.in);
		System.out.print("연도 : ");
		year = in.nextInt();
		System.out.print("월 : ");
		month = in.nextInt();

		System.out.println();
		LocalDate date = LocalDate.of(year, month, 1);
		System.out.print("Sun ");
		System.out.print("Mon ");
		System.out.print("Tue ");
		System.out.print("Wen ");
		System.out.print("Thu ");
		System.out.print("Fri ");
		System.out.println("Sat ");

		// 해당하는 년,월 의 1일의 객체생성
		// 매월 1일에 요일의 숫자를 확인 후 숫자만큼 공백을 만들어주자.
		int first_dow = date.getDayOfWeek().getValue();
		if (first_dow < 7) {
			for (int i = 0; i < first_dow; i++) {
				System.out.printf("    ");
			}
		}

		// 날짜출력
		int lastDay = date.lengthOfMonth();// 매월 말일
		for (int day = 1; day <= lastDay; day++) {
			System.out.printf("%3d ", day);
			// LocalDate today = LocalDate.of(year, month, day);
			// int dow = today.getDayOfWeek().getValue();
				if (first_dow%7==6) {// 토요일 체크
					System.out.println();
			}
				first_dow++;
		}
	}

}
