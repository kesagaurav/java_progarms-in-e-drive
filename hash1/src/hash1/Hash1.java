package hash1;

import java.util.*;

public class Hash1 {
	static void createHashMap(int a[]) {
		Hashtable<Integer,Integer> hmap=new Hashtable<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			Integer  c = hmap.get(a[i]);
			if(hmap.get(a[i])==null) {
				hmap.put(a[i],1);
			}
			else
			{
				hmap.put(a[i],c++);
			}
		}
	System.out.println(hmap);
	}
		public static void main(String[] args) {
			int a[]= {12,3,4,34,56};
			createHashMap(a);
		}

}
