import java.util.ArrayList;
import java.util.ListIterator;


/**
 * @author akshayak
 *  ArrayList examples to generate infinite loop - Interview Question
 */
public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Hello");
	list.add("Geeks");
	list.add("Welcome");
	
	ListIterator<String> itr=list.listIterator(); 
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		System.out.println(itr.previous());
	}			
}
}
