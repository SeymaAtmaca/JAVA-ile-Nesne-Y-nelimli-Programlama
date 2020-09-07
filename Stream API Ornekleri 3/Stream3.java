package denemee;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream3 {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Collect kullanimi -List,Set donusumu");
		List <Integer> liste=List.of(1,2,3,4,5);
		Set<Integer> set= liste.stream()			
				.collect(Collectors.toSet());		//Set e donusum yaptigimiz icin toSet() kullandik.
				set.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Map kullanimi-elemanlarin uc katini almak");
		
			 
		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
			     list.stream()
			    .map(number -> number * 3)			//Her bir sayi alinir ve uc kati dondurulur
			    .forEach(System.out::println);
			     
		System.out.println();  
		
		
		System.out.println("Reduce kullanimi-elemanlarin sirasiyla toplanmasi");
		
			int result=IntStream
					.of(1,2,3,4,5)
					.reduce(0,(a,b)->{
						System.out.format("%d %d %n",a,b);
						return a+b;
					});		     
		
	}
	
}
