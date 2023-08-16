//Two integers are considered to be digit anagrams if they contain the same digits.
// For example, 54175 and 45571 are digit anagrams, but 123 and 782 are not (since they don't contain the same digits). 220 and 22 are also not considered as digit anagrams,

long solutionDigitAnagram(int[] a) {
	    Map<List<Integer>,Integer> map = new HashMap<>();
	    long ans=0;
	    for(int val:a){
	        List<Integer> tp = new ArrayList<>();
	        while(val>0){
	            int t = val%10;
	            val/=10;
	            tp.add(t);
	        }
	        Collections.sort(tp);
	        if(map.containsKey(tp)){
	            ans+=map.get(tp);
	            map.put(tp,map.get(tp)+1);
	        }
	        else map.put(tp,1);
	        
	    }
	    
	   return ans;

	}
