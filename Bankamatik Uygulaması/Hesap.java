package BankaHesap;

import java.util.Scanner;

public class Hesap {
	
	public static void main(String args[]) {
		Banka temel=new Banka("Kullaninin Adi",123,1234,13000);
		System.out.println("Hosgeldiniz.Lutfen kullanici adinizi ve sifrenizi giriniz");
		Banka.Hesaplar("Kullanicinin adi",1234);
	}

}