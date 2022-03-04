package com.java.priyanka;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecharacter {

	public static void main(String[] args) {
		String str= "Priyanka";
		Map<Character,Integer> basemap= new HashMap<Character,Integer>();
		
       char []obj =str.toCharArray();
       for(Character ch :obj)
       {
    	   if(basemap.containsKey(ch))
    	   {
    		   basemap.put(ch,basemap.get(ch)+1);
    	   }
    	   else
    	   {
    		   basemap.put(ch,1);
    	   }
       }
       Set<Character> s1= basemap.keySet();
       for(Character key:s1)
       {
    	   if(basemap.get(key)>1)
    	   {
    		   System.out.println(key + " " +  basemap.get(key ));
    	   }
       }
	}

}
