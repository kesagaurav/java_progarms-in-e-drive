package hash;

import java.util.Hashtable;
import java.util.*;

public class Hash {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(1,"gaurav");
		hm.put(13, "tom");
		hm.put(23, "bucket");
		hm.put(56, "berlin");
		System.out.println(hm);
	}

}
