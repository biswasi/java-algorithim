import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class ListIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>  mylist = new ArrayList<String>(); 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks");    
        // Here we are using frequency() method 
        // to get  frequency of element "code" 
        int freq = Collections.frequency(mylist, "code"); 
   
        System.out.println(freq); 
        LinkedList<String> list = new LinkedList<String>(); 
        
        // adding  elements 
        list.add("Geeks"); 
        list.add("4"); 
        list.add("Geeks"); 
        list.add("9"); 
     // printing the list 
        System.out.println("The initial Linked List is : " + list);   
        // using poll() to retrieve and remove the head 
        // removes and displays "Geeks" 
        System.out.println("Head element of the list is : " + list.poll());  
        // printing the resultant list 
        System.out.println("Linked List after removal using poll() : " + list); 
        
        System.out.print("The order of exit is : "); 
        
        while (!list.isEmpty()) { 
            // using poll() to display the order of exit from queue 
            System.out.print(list.poll() + " <-- "); 
        } 
        System.out.println(" Size ="+list.size());
        Integer arr[] = {100, 20, 30, 40, 50,70}; 
        
        System.out.println("Original Array : " + Arrays.toString(arr)); 
        Collections.rotate(Arrays.asList(arr), 2); 
        
        System.out.println("Modified Array : " + Arrays.toString(arr)); 
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
          .reduce(0, Integer::sum);        
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        final int chunkSize = 3;
        final AtomicInteger counter = new AtomicInteger();
        final Collection<List<Integer>> result=numbers.stream().collect(Collectors.groupingBy
        		(it -> counter.getAndIncrement() / chunkSize)).values();
        
        System.out.println(result);
        //ListUtils.partition(List list, int size)      


	}

}
