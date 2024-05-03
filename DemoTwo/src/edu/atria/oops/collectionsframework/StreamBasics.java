package edu.atria.oops.collectionsframework;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		
		Stream<Integer>str=Stream.of(10,20,30,40,50);  //of is used to print same order integer 
		//Stream<Integer>strOne = str.map(num->num+2);  //intermediate operation filter and map
		//strOne.forEach(System.out::println);  //foreach print all the element in the string line by line
		

		str.map(num->num+2).forEach(System.out::println);
		
		
		
		Integer[] values = new Integer[] {11,12,12,13,14,15};  //source data
		Arrays.stream(values).map(num->num*num).limit(3).distinct().forEach(System.out::println); //stream of data and pipeline computational operations distinct method are used to remove duplicate values and print one values
	}

}
