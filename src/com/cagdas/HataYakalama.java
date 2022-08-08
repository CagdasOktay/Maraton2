package com.cagdas;

import java.util.Scanner;

public class HataYakalama {

	public static void main(String[] args) {

		System.out.println("Program baþladý!");
		int a = 0, b;
		int[] arr = new int[3];

		Scanner sc = new Scanner(System.in);

		try {
			a = 2 / 0;

			arr[0] = 10;
			b = sc.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("0'a bölünme hatasý !");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array boyut hatasý !");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Bir hata var");
			System.out.println(e.toString());
		}

		System.out.println("Program Bitti!");

	}

}
