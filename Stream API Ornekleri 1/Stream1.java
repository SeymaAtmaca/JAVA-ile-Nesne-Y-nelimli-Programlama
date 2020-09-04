package denemee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;


public class Stream1 {
	
	public static void main(String[] args) {
		
		
		
		//forEach metodu , yigini sirayla dolasir
		System.out.println("ForEach");
		
		List isimListesi=Arrays.asList("Banu","Ceylin","Asu");
		Stream stream=isimListesi.stream();
		
		stream.forEach(System.out::println);		//forEach ile bastirma islemi yapiliyor
		System.out.println();
		
		
		
		
		//filter metodu, yiginda istenen sorguyu yapar ve ayýklar
		System.out.println("Filter");
		
		List <Integer> sayilar=List.of(1,2,3,4);
		Predicate predicate=sayi ->! sayilar.equals(3);		//filtreleme icin kosul olusturuluyor
		
		List <Integer> sonuc=(List<Integer>) sayilar.stream()
		.filter(predicate)									//filtreleme islemi yapiliyor
		.collect(Collectors.toList());
		sonuc.stream().forEach(System.out::println);		
		System.out.println();
		
		
		
		//distinct, bir yiginda tekrarli verileri cikarmak icin kullanilir
		System.out.println("Distinct");
		
		List <Integer> distinctt=List.of(1,1,1,2,5,8,4,4,4);
		List<Integer> DisSonuc=distinctt.stream()
				.distinct()
				.collect(Collectors.toList());
				DisSonuc.stream().forEach(System.out::println);
		
		
		
	}

}
