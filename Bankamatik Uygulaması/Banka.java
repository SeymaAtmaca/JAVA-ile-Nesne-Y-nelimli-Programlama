package BankaHesap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Banka {
	String KullaniciAdi;
	int HesapNo,sifre,bakiye;
	
	static ArrayList <Banka> hesaplar=new ArrayList <Banka> ();
	
	public Banka(String KullaniciAdi,int HesapNo ,int sifre ,int bakiye) {
		this.HesapNo=HesapNo;
		this.KullaniciAdi=KullaniciAdi;
		this.sifre=sifre;
		this.bakiye=bakiye;
		hesaplar.add(this);
		
	}
	
	public static void Hesaplar(String KullaniciAdi,int sifre) {
		for(int i=0;i<hesaplar.size();i++) {
			Banka banka=hesaplar.get(i);
					IslemSecimi(banka);	
		}
	}
	
	public static void IslemSecimi(Banka banka) {
		for(int i=1;i>0;i++) {
			System.out.println("Lutfen bir islem secin");
			System.out.println("1)Bakiye kontrol, 2)Para Yatir, 3)Para Cek");
			Scanner scan=new Scanner(System.in);
			int secim=scan.nextInt();
			
			if(secim==1) 			System.out.println(banka.bakiye);
			else if(secim==2)  		ParaYatir(banka); 
			else if(secim==3)  		ParaCek(banka);
			else 					System.out.println("Yanlis bir islem yaptiniz");
			
			int cevap=Soru(banka);
			if(cevap==0) break;
		}
	}
	
	private static void ParaYatir(Banka banka) {
		System.out.println("Yatirmak istediginiz miktari giriniz");
		Scanner scann=new Scanner(System.in);
		int miktar=scann.nextInt();
		
		banka.bakiye+=miktar;
		System.out.println("Yeni bakiyeniz "+banka.bakiye);
	}
	private static void ParaCek(Banka banka) {
		System.out.println("Cekmek istediginiz miktari giriniz");
		Scanner scann=new Scanner(System.in);
		int miktar=scann.nextInt();
		
		if(banka.bakiye<miktar) 	System.out.println("Bakiye yetersiz.");
		else {
			banka.bakiye-=miktar;
			System.out.println("yeni bakiyeniz "+ banka.bakiye);
		}
	}
	
	private static int Soru(Banka banka) {
		int deger=1;
		System.out.println("Baska bir islem yapmak ister misiniz? E/H");
		Scanner scan=new Scanner(System.in);
		String cevap=scan.nextLine();
		if(cevap.equals("H")) deger=0;
		return deger;
	}

}
