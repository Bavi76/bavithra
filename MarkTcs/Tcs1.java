package MarkTcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tcs1 {
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<>(Arrays.asList(1,2,1,3));
	Collections .sort(li);
   ArrayList<Integer>list=new ArrayList<Integer>();
   for(int i=1;i<=li.size()-1;i++) {
	   if(li.get(i-1)==li.get(i)) {
		   continue;
	   }
		   list.add(i);
	   }
   System.out.println(list);
   }
   
	}

