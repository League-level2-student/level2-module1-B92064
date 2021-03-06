package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> S = new ArrayList<String>();
		//2. Add five Strings to your list
		S.add("1");
		S.add("seee");
		S.add("3");
		S.add("e");
		S.add("5");
		//3. Print all the Strings using a standard for-loop
		
		for(int i = 0; i < S.size(); i++) {
			System.out.println(S.get(i));
			String s = S.get(i);
			if(i%2 == 0) {
				System.out.println(s);
			}
		}
		
		
		//4. Print all the Strings using a for-each loop
		for(String s : S) {
			
			//System.out.println(s);
			
			if(s.contains("e")) {
				System.out.println(s);
			}
		
		}
		for(int i = S.size()-1; i > -1; i--) {
		System.out.println(S.get(i));
			
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
		
	}
}
