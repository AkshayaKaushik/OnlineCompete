package inTERVIEWpREP;

import java.util.StringTokenizer;

/**
 * @author AKSHAYAK
 * Swapping of two string without using third variable via split method, String Tokenizer and Substring method.
 */
public class StringEX3 {
public static void main(String[] args) {
	String first="Hello",second="World";
	display_tokenizer(first, second);
	display_substring(first, second);
	display_split(first, second);
}
public static void display_tokenizer(String first,String second) {
	first=first+"/"+second;
	StringTokenizer str=new StringTokenizer(first, "/");
	second=str.nextToken();
	first=str.nextToken();
	System.out.println("Swapping by string tokenizer");
	System.out.println("After Swap\n second is ="+second+" first is= "+ first+"\n");
}
public static void display_substring(String first, String second) {
	first=second+first;
	second=first.substring(second.length(), first.length());
	first=first.substring(0, second.length());
	System.out.println("SWapping By substring method");
	System.out.println("After Swap\n second is ="+second+" first is= "+ first+"\n");
}
public static void display_split(String first, String second) {
	first=first+"/"+second;
	second = first.split("/")[0];
	first=first.split("/")[1];
	System.out.println("SWapping By split method");
	System.out.println("After Swap\n second is ="+second+" first is= "+ first);
}
}
