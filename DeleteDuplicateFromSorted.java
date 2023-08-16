import java.util.stream.Collectors;

public class DeleteDuplicateFromSorted {

	public DeleteDuplicateFromSorted() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
		System.out.println("To delete duplicate from sortd array");
		List<Integer>inputArray=new ArrayList<>(Arrays.asList(1,2,2,3,8,9,10,11,12,12,12));
		printArrayList(inputArray);
		List<Integer>outArray=new ArrayList<Integer>();
		System.out.println(inputArray.size()+"Input ArraySize");
		if(inputArray.isEmpty()) {
			System.out.println("Array is empty");	
		}
		int writeIndex= 1;
		for(int i=1;i < inputArray.size() ; i++)
		{
			System.out.println(i+"= Value of i");
			System.out.println(writeIndex+ " = Value of index");
			System.out.println(inputArray.get(i));
			if(!inputArray.get(writeIndex - 1).equals(inputArray.get(i)))
			{
				inputArray.set(writeIndex++, inputArray.get(i));
			}
			if(i==inputArray.size() -1 && inputArray.get(writeIndex).equals(inputArray.get(i))) {
				inputArray.remove(writeIndex);
			}
			//System.out.println(inputArray.get(i));
		}
		System.out.println(inputArray.size()+" = ArraySize");
		for(int i=0;i < writeIndex ; i++)
		{
			System.out.println(inputArray.get(i));
		}
	}
	
	public static void printArrayList(List<Integer> list)
	{
		 List<Integer> newList = list.stream()
                 .distinct()
                 .collect(Collectors.toList());
    System.out.println("ArrayList with duplicates removed: "
      + newList);
	}
}
