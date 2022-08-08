package com.cagdas;

import java.util.Scanner;

public class AlanHesaplama {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu, yukseklik, ucgenAlani, dikdortgenk�sakenar,
				dikdortgenuzunkenar, dikdortgenAlani;

		System.out.print("��genin Birinci Kenar Uzunlu�unu giriniz:");
		birinciKenarUzunlugu = input.nextDouble();

		System.out.print("��genin �kinci Kenar Uzunlu�unu giriniz:");
		ikinciKenarUzunlugu = input.nextDouble();

		System.out.print("��genin Taban Uzunlu�unu Giriniz:");
		tabanUzunlugu = input.nextDouble();

		System.out.print("��genin Y�ksekli�ini Giriniz:");
		yukseklik = input.nextDouble();
		System.out.print("Dikd�rtgenin K�sakenar�n� Giriniz:");
		dikdortgenk�sakenar = input.nextDouble();
		System.out.print("Dikd�rtgenin Uzunkenar�n� Giriniz:");
		dikdortgenuzunkenar = input.nextDouble();

		dikdortgenAlani = dikdortgenAlaniHesapla(dikdortgenk�sakenar, dikdortgenuzunkenar);
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
		System.out.println("��genin Alani:" + j);
	}

	public static void dikdortgenalaniYazdir(double k) {
		System.out.println("Dikd�rtgenin Alani:" + k);

	}

}
