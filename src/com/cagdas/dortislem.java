package com.cagdas;

import java.util.Scanner;

public class dortislem {

	public static Scanner input1;
	public static Scanner input2;

	static void yaz(String islem) {
		System.out.println(islem);
	}

	static void topla(double a, double b) {
		yaz("Toplam Sonucu" + (a + b));

	}

	static void cikar(double a, double b) {
		yaz("cikarma sonucu" + (a - b));

	}

	static void bolme(double a, double b) {
		yaz("bolme sonucu" + (a / b));

	}

	static void carpma(double a, double b) {
		yaz("carpma sonucu" + (a * b));

	}

	static void mod(double a, double b) {
		yaz("mod sonucu" + (a % b));

	}

	public static void main(String[] args) {

		double a, b;
		System.out.println("birinci sayiyi giriniz");
		input1 = new Scanner(System.in);
		a = input1.nextDouble();

		System.out.println("ikinci sayiyi giriniz");
		input2 = new Scanner(System.in);
		b = input2.nextDouble();

		topla(a, b);
		cikar(a, b);
		bolme(a, b);
		carpma(a, b);
		mod(a, b);
	}

}
