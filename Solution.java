package second;


import java.util.List;
import java.util.Arrays;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int i=0;i<test_case;i++){
            int size=sc.nextInt();
            Integer arr[]=new Integer [size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
           Integer dummy[]=arr.clone();
            Arrays.sort(dummy);

            List<Integer> t= Arrays.asList(dummy);
            boolean flag=false;
            int index=0;
            while(true){
                for(int j=0;j<(size-2);j++){
                    if(result(arr[j],j,arr,t)){
                        if(arr[j]>arr[j+2]){
                            int swap=arr[j];
                            arr[j]=arr[j+2];
                            arr[j+2]=swap;
                            flag=true;
                        }
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
                if(flag==false)
                    break;
                flag=false;
            }
            int count=0;
            for(int j=0;j<size;j++){
                 if(j!=t.indexOf(arr[j])){
                    count=j;
                    break;
                }
            }
            if(count!=0)
            System.out.println("Case #"+(i+1)+": "+ count);
            else
                System.out.println("Case #"+(i+1)+": OK");
        }
    }

    public static boolean result(int val,int index,Integer arr[],List list){
       // System.out.println(list.isEmpty());
       boolean flag=false;
        if(index==list.indexOf(val)){
            flag=true;
        }
        else{
            for(int i=index;i<(arr.length-1);i++){
                if(arr[i]>arr[i+1]){
                    flag=true;
                }
            }
        }
        return flag;
    }
}
