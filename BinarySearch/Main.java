package Search;

import java.util.Scanner;

public class Main {
	public static int[] liste;
	
	public static int kontrol;
	public static void main(String args[] ) {
		System.out.println("Hosgeldiniz :))");
		
		System.out.println("Lutfen tahminde bulunacaginiz aralik icin son deger giriniz");
		Scanner scan2=new Scanner(System.in);
		int sonDeg=scan2.nextInt();
		
		
		System.out.println("Lutfen tahminde bulundugunuz sayiyi girin");
		Scanner scan3=new Scanner(System.in);
		int tahmin=scan3.nextInt();
		
		Search search=new Search(sonDeg,tahmin);
		
		System.out.println("Program bitti. :))"); 
	
	}
	
	public static void ArrayOlustur(int sonDeg,int key) {
	
		
		liste=new int[Search.sonDeg-Search.ilkDeg+1];
		int kontroll=0;
		for(int i=0;kontroll!=sonDeg+1;i++) {
			liste[i]=kontroll++;
		}
		
		if(key<sonDeg  &&  key>Search.ilkDeg) {
			Search.Ara(sonDeg,key,Search.ortDeg,Search.ilkDeg);
		}
		else 
			System.out.println("Yanlis bir islem yaptiniz tekrar deneyin");
		
	}
}
