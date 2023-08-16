import java.util.HashSet;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char output=solution("FatherF");
		System.out.println("First No repeating char :"+output);
		char output1=solutionFisrtDuplicate("Fathert");
		System.out.println("First repeating char :"+output1);
		int array[] = {10, 7, 8, 1, 8, 7, 6}; 
		int min=solutionFirstDuplicate(array); 

	}
	static char solution(String s) {
	    char[] c=s.toCharArray();
	for(int i=0;i<s.length();i++){
	    if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
	        return c[i];
	}
	    return '_';
	}
	static char solutionFisrtDuplicate(String s) {
	    char[] c=s.toCharArray();
	for(int i=0;i<s.length();i++){
	    if(s.indexOf(c[i])!=s.lastIndexOf(c[i]))
	        return c[i];
	}
	    return '_';
	}
	
	//array with duplicate
	static int solutionFirstDuplicate(int[] array) {
	    int minimumIndex = -1; 	 
			// Creates an empty hashset 
			HashSet<Integer> set = new HashSet<>(); 	 
			// Iterate over the input array from right to left 
			for (int i=0; i<array.length; i++) 
			{ 
				// If set contains the element, update minimum index 
				if (set.contains(array[i])) {
					minimumIndex = i; 
					return array[minimumIndex];
			}
	 
				else   // Else add element to hash set 
					set.add(array[i]); 
			} 
			return -1;	    

	}
}
