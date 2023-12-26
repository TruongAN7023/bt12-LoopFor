package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 12.1
		 */
//		int n = 100;

//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }
		/*
		 * 12.2
		 */
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap so nguyen n: ");
//        int n = sc.nextInt();
//
//        int sum = 0;

//        for (int i = 1; i < n; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }

//        System.out.println("Tong cac so chia het cho 3 va nho hon " + n + " là: " + sum);
		/*
		 * 12.3
		 */
//		int n = 100;
//        long first = 0, second = 1;

//        System.out.println("100 so Fibonacci dau tien:");
//        System.out.print(first + " " + second + " ");

//        for (int i = 2; i < n; i++) {
//            long next = first + second;
//            System.out.print(next + " ");
//            first = second;
//            second = next;
//        }
		/*
		 * 12.4
		 */
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap so nguyen n: ");
//        int n = sc.nextInt();
//        sc.close();

//        int soBanDau = 0;
//        int soGoc = n;

//        for (int temp = n; temp != 0; temp /= 10) {
//            int digit = temp % 10;
//            soBanDau = soBanDau * 10 + digit;
//        }

//        if (soGoc == soBanDau) {
//            System.out.println(n + " la so Palindrome.");
//        } else {
//            System.out.println(n + " khong la so Palindrome.");
//        }
		/*
		 * 12.5
		 */
		System.out.println("Cac so tu 100 den 999 co tong chu so chia het cho 3 la:");
        for (int i = 100; i <= 999; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum % 3 == 0) {
                System.out.println(i);
            }
        }
	}
	

}
