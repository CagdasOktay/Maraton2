package com.cagdas;

public class CustomString {

	String string;

	public int uzunluk() {

		return string.length();
	}

	public boolean iceriyormu(String kontrol) {

		return string.contains(kontrol);

	}

	public char �ndeksdekiDeger(int index) {

		return string.charAt(index);

	}

	public boolean ilemiBasl�yor(String baslang�c) {

		return string.startsWith(baslang�c);

	}

	public boolean ilemiBitiyor(String bitis) {

		return string.startsWith(bitis);

	}

	public int degerinIndeksiniBul(String deger) {

		return string.indexOf(deger);

	}

	public void bastakiSondakiBosluklar�Al() {

		string.trim();
	}

	public String degerDegi�tirme(String eskideger, String yeniDeger) {
		string = string.replace(eskideger, yeniDeger);
		return string;
	}

	public void degeriBolme(int index) {

		string.substring(index);

	}

	public void degeriBolme(int baslang�c, int bitis) {

		string.substring(baslang�c, bitis);

	}

	public boolean esitMi(String deger) {
		return string.equals(deger);
	}

	public String[] degereG�reBolme(String deger) {
		return string.split(deger);

	}

}
