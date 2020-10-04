package Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, Integer> hm = new Map<>();
//		hm.put(0, "aditya");
//		hm.put(1, "aditya");
//		hm.put(2, "aditya");
//		
//		System.out.println(hm.f);
//		System.out.println(hm.get(0));
//		System.out.println(hm.containsKey(0));
//		System.out.println(hm.containsKey(12));
//		System.out.println(hm.containsValue("aditya"));
//		System.out.println(hm.containsValue("a"));
		Map<String, Integer> hm = new HashMap<>();
		hm.put("aditya",0);
		hm.put("aditya",1);
		hm.put("aditya",8);
		
		System.out.println(hm.get("aditya"));
		System.out.println(hm.get("aditya"));
	}
}
