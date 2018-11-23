package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> S = new ArrayList<String>();
		//2. Add five Strings to your list
		S.add("lol");
		S.add("e");
		S.add("lol");
		S.add("lol");
		S.add("lol");
		//3. Print all the Strings using a standard for-loop
		
		for(int i = 0; i < S.size(); i++) {
			System.out.println(S.get(i));
			String s = S.get(i);
		}
		
		
		//4. Print all the Strings using a for-each loop
		for(String s : S) {
			int i = Integer.parseInt(s);
			//System.out.println(s);
			if(i%2 == 0) {
				System.out.println(s);
			}
			
			if(S.get(i).charAt(1) == e) {
				
			}
		}
		for(int i = S.size(); i > 0; i++) {
			System.out.println(S.get(i));
			
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
		
	}
}
