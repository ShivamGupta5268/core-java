package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Trier {

	static void show() {
		
		Object obj=new Object();
		obj="fadjksfhjkhasdjhfjh";
		
		List li=new ArrayList();
		
		ArrayList l=new ArrayList();
		l.add("umesh");
		l.add(878);
		l.add(8789.343);
		l.add(obj);
		System.out.println(l);
		
		ArrayList l2=new ArrayList();
		
		l2.addAll(l);
		l2.add("This is Naya Object");
		l2.add(3897897.8978);
		System.out.println(l2);	
		
		
	}
	
	static void display() {
		
		Object obj=new Object();
		obj="fadjksfhjkhasdjhfjh";
		
		List li=new ArrayList();
		
		ArrayList l=new ArrayList();
		l.add("Rays Technolgy");
		l.add(878);
		l.add(8789.343);
		l.add(obj);
		System.out.println(l);
		
		ArrayList l2=new ArrayList();
		
		l2.add("This is Naya Object");
		l2.add(3897897.8978);
		l2.addAll(l);
		System.out.println(l2);	
		System.out.println(l2.contains("umesh"));
		System.out.println(l2);	
		System.out.println("L2 clear method");

		
	}
	
	private static void fetchData() {
		// TODO Auto-generated method stub
		
		Object obj=new Object();
		obj="fadjksfhjkhasdjhfjh";

		List li=new ArrayList();
		
		li.add("This is Anotehr data");
		
		ArrayList l=new ArrayList();
		l.add("Rays Technolgy");
		l.add(878);
		l.add(8789.343);
		l.add(obj);
		System.out.println(l);
		
		ArrayList l2=new ArrayList();
		
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add(null);
		l2.add(null);
		l2.add(null);
		l2.add(null);
		l2.add(3897897.8978);
		l2.addAll(l); 
		l2.addAll(li); 
		
		
		Iterator it=l2.iterator();
	while(it.hasNext()) {
//		it.remove();
		Object obj2=it.next();
		
		System.out.println(obj2);
		
		
//		System.out.println(it.next());
		
		
	}
	}

	
	public static void main(String[] args) {
//		show();
//		
//		display();
//		
//		fetchData();
		
		
		testSet();
	}
	private static void testSet() {
		// TODO Auto-generated method stub
		
		Object obj=new Object();
		obj="fadjksfhjkhasdjhfjh";

		List li=new ArrayList();
		
		li.add("This is Anotehr data");
		
		Set l=new HashSet();
		
		l.add("Rays Technolgy");
		l.add(878);
		l.add(8789.343);
		l.add(obj);
		System.out.println(l);
		
		HashSet l2=new HashSet();
		
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add("This is Naya Object");
		l2.add(null);
		l2.add(null);
		l2.add(null);
		l2.add(null);
		l2.add(3897897.8978);
		l2.addAll(l); 
		l2.addAll(li); 
		
		
		Iterator it=l2.iterator();
	while(it.hasNext()) {
//		it.remove();
		Object obj2=it.next();
		
		System.out.println(obj2);
		
		
//		System.out.println(it.next());
		
		
	}
	}


}

