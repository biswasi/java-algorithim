import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdafuncWork {
	public static void main(String[] args) {
		Stream<List<Integer>> numberStream = Stream.of(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8));
		Stream<List<Integer>> numberStream1= Stream.of(Arrays.asList(2,3,5,6),Arrays.asList(6,8,9,4),Arrays.asList(3,8,8,4));
		numberStream1.flatMap(n -> n.stream()).filter(n -> n %2!= 0).forEach(System.out::println);
		
		numberStream.flatMap(n -> n.stream()).filter(n -> n % 2 ==0).forEach(System.out::println);
		String str="abcd.efg.qwerty";
    //Reverse
		String reversed= Arrays.asList(str.split("\\.")).stream().sorted(Comparator.reverseOrder()).map(m -> new 
				StringBuilder(m).reverse().toString()).collect(Collectors.joining("."));
		System.out.println(reversed);
		
		String reversedWord= Arrays.asList(str.split("\\.")).stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining("."));
		String reverseWord = Arrays.asList(str.split("\\.")).stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining("."));
		System.out.println("Reverse word = "+reverseWord);
		System.out.println("Reversed word = "+reversedWord);
	}

}
