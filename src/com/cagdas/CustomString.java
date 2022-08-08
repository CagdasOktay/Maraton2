package com.cagdas;

public class CustomString {

	String string;

	public int uzunluk() {

		return string.length();
	}

	public boolean iceriyormu(String kontrol) {

		return string.contains(kontrol);

	}

	public char ýndeksdekiDeger(int index) {

		return string.charAt(index);

	}

	public boolean ilemiBaslýyor(String baslangýc) {

		return string.startsWith(baslangýc);

	}

	public boolean ilemiBitiyor(String bitis) {

		return string.startsWith(bitis);

	}

	public int degerinIndeksiniBul(String deger) {

		return string.indexOf(deger);

	}

	public void bastakiSondakiBosluklarýAl() {

		string.trim();
	}

	public String degerDegiþtirme(String eskideger, String yeniDeger) {
		string = string.replace(eskideger, yeniDeger);
		return string;
	}

	public void degeriBolme(int index) {

		string.substring(index);

	}

	public void degeriBolme(int baslangýc, int bitis) {

		string.substring(baslangýc, bitis);

	}

	public boolean esitMi(String deger) {
		return string.equals(deger);
	}

	public String[] degereGöreBolme(String deger) {
		return string.split(deger);

	}

}
