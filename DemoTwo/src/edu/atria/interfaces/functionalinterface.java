package edu.atria.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class display
{
	static void show(String s) {
		System.out.println("****" + s + "*****");
	}
}

public class functionalinterface {

	public static void main(String[] args) {
		Consumer<String> consumer = display::show;
		consumer.accept("amit");
		
        Supplier<String> supplier = () -> "hello from supplier";
        consumer.accept(supplier.get());
       
        
      Predicate<Integer> predicate = num -> num > 0;  //variable name num and predicate
      System.out.println(predicate.test(20));  // without print function we cannot print
      System.out.println(predicate.test(-20));
      
      
      BiFunction<Integer, Integer, Integer> maxfunction = (x,y) -> x>y?x:y;  // ternary operator
      System.out.println(maxfunction.apply(25, 14));
      
      BiFunction<String, Integer, String> printfunction = (name,num) -> name+num;
      System.out.println(printfunction.apply("good mornning",2));
      
		
		

	}

}
