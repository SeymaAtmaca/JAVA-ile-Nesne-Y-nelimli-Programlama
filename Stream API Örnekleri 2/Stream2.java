package denemee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream2 {
	
	public static void main(String[] args) {
		
		//count metodu yigin icindeki eleman sayisini hesaplar
		
		System.out.println("Count kullanimi");
		List<Integer> sayilar=List.of(1,4,9,5,3,4);
		Stream<Integer> str=sayilar.stream();
		System.out.println(str.count());
		System.out.println();
		
		//limit metodu baslangici ve sonucu belirlenen bir dizin icin
		//ilk elemandan itibaren ,belirlenen sayida elemaný olan bir dizi dondurur
		
		
		System.out.println("Limit kullanimi");
		LongStream range=LongStream.range(2,9);
			range
				.limit(4)
				.forEach(System.out::println);
			System.out.println();
			
		//sorted metodu, yigin elemanlarini siralayarak geri dondurur
			
		System.out.println("Sorted metodu kullanimi");
		List<Integer> sayi=List.of(1,8,5,46,74,3,9);
		List<Integer> stream=sayi.stream()
				.sorted()
				.collect(Collectors.toList());
			stream.stream().forEach(System.out::println);
		
		
	}

}
