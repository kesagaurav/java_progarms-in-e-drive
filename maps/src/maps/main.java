package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("gaurav", new Integer(2));
		hm.put("max", new Integer(3));
		hm.put("frank",new Integer(4));
		hm.put("sri", new Integer(5));
		
	     Set< Map.Entry< String,Integer> > st = hm.entrySet();    
	     for (Map.Entry< String,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 

	}

}
