package com.test.HACKEREARTH;

import java.util.Arrays;
import java.util.Scanner;

public class XORtest {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int cases=sc.nextInt();
for(int i=0;i<cases;i++)
{
	int result[]=new int[3];
	int arr_length=sc.nextInt();
	int arr[]=new int[arr_length];
	for(int j=0;j<arr_length;j++) {
		arr[j]=sc.nextInt();
	}
	if(Integer.bitCount(arr[arr_length-1])==1)
	//System.out.println(arr[arr_length-2]+" "+arr[arr_length-1]+" "+(arr[arr_length-1]^arr[arr_length-2]));
	{
		result[0]=arr[arr_length-2];
		result[1]=arr[arr_length-1];
		result[2]=arr[arr_length-1]^arr[arr_length-2];
	}
		else
		for(int k=0;k<arr_length-1;k++)
		{
			if(result[2]<(arr[arr_length-1]^arr[k])) {
				result[0]=arr[k];
				result[1]=arr[arr_length-1];
				result[2]=arr[arr_length-1]^arr[k];
		}
		}
	System.out.println(Arrays.toString(result));
}
}

}
