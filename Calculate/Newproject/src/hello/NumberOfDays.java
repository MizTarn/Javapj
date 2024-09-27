package hello;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int flag = 1;
		while (true) {
			int year = ns.nextInt();
			int month = ns.nextInt();
			switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				flag = 1;
				System.out.println("Trong thang " + month + " co 31 ngay");
				break;
			case 4, 6, 9, 11:
				flag = 1;
				System.out.println("Trong thang " + month + " co 30 ngay");
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					System.out.println("Trong thang 2 co 29 ngay");
				else
					System.out.println("Trong thang 2 co 28 ngay");
				break;
			default:
				flag = 0;
				System.out.println("Nhap thang khong hop le, hay nhap lai");
			}
			if (flag == 1) break;
		}
		ns.close();
	}
}
