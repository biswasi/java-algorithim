
public static void main(String[] args) {
List<Integer> firstArray= new ArrayList<>(Arrays.asList(1, 
                2, 
                9));
List<Integer> secondArray =new ArrayList<>(Arrays.asList(2,6,10));
List<Integer> sortedMergedList=Stream.of(firstArray,secondArray).flatMap(n->n.stream()).sorted().collect(Collectors.toList());
System.out.println(sortedMergedList);
 mergeTwoSortedArray(firstArray,secondArray);
}


public static void mergeTwoSortedArray(List<Integer> A,List<Integer> B)
	{
		int a=A.size() -1;int b=B.size() -1;
		int writeIndex=A.size()+B.size() -1;
		//System.out.println("Write Index="+writeIndex);
		List<Integer> mergeArray = new ArrayList<Integer>(writeIndex);
		
		while( a>=0 && b>=0)
		{
			mergeArray.add(A.get(a) > B.get(b) ? A.get(a--):B.get(b--));
		}
		while(a>=0)
		{
			mergeArray.add( A.get(a--));
		}
		System.out.println("MergerArray="+mergeArray);
	}
