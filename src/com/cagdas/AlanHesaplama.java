package com.cagdas;

import java.util.Scanner;

public class AlanHesaplama {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu, yukseklik, ucgenAlani, dikdortgenkýsakenar,
				dikdortgenuzunkenar, dikdortgenAlani;

		System.out.print("Üçgenin Birinci Kenar Uzunluðunu giriniz:");
		birinciKenarUzunlugu = input.nextDouble();

		System.out.print("Üçgenin Ýkinci Kenar Uzunluðunu giriniz:");
		ikinciKenarUzunlugu = input.nextDouble();

		System.out.print("Üçgenin Taban Uzunluðunu Giriniz:");
		tabanUzunlugu = input.nextDouble();

		System.out.print("Üçgenin Yüksekliðini Giriniz:");
		yukseklik = input.nextDouble();
		System.out.print("Dikdörtgenin Kýsakenarýný Giriniz:");
		dikdortgenkýsakenar = input.nextDouble();
		System.out.print("Dikdörtgenin Uzunkenarýný Giriniz:");
		dikdortgenuzunkenar = input.nextDouble();

		dikdortgenAlani = dikdortgenAlaniHesapla(dikdortgenkýsakenar, dikdortgenuzunkenar);
		ucgenAlani = ucgenAlaniHesapla(tabanUzunlugu, yukseklik);

		alanYazdir(ucgenAlani);
		dikdortgenalaniYazdir(dikdortgenAlani);

	}

	public static double ucgenAlaniHesapla(double z, double h) {
		double alan = (z * h) / 2;
		return alan;
	}

	public static double dikdortgenAlaniHesapla(double a, double b) {
		double alan = (a * b);
		return alan;
	}

	public static void alanYazdir(double j) {
		System.out.println("Üçgenin Alani:" + j);
	}

	public static void dikdortgenalaniYazdir(double k) {
		System.out.println("Dikdörtgenin Alani:" + k);

	}

}
