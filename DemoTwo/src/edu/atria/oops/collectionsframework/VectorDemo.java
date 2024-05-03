package edu.atria.oops.collectionsframework;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vector<Integer> number = new Vector<>(); //<> used to give a data type name like int,float
 
number.add(10);
number.add(20);
number.add(30);
number.add(40);

// calculate the size

System.out.println("the size of vector:"+number.size());

//printing the values

System.out.println("the number are:"+number);

//For each loop used to print in multi line not in single line which is not there in collection

for(Integer value:number)
{
	System.out.println(value);
}
number.add(2,80);
System.out.println(number);
	}

}