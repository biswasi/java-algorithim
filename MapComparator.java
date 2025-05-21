import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapComparator {
	public static void main(String[] args) {
		Map<String,String> cityMap=new HashMap<String,String>();
		cityMap.put("ND", "New Delhi");
    cityMap.put("MU", "Mumbai");
	  cityMap.put("CH", "Chennai");
	  cityMap.put("ND", "Kolkata");
	    Map<String,String>sortedByname=cityMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
	    		              collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	    System.out.println(sortedByname);
	Map<String, ArrayList<String>> map = new HashMap<>();
        map.computeIfAbsent("Fruits", k -> new ArrayList<>()).add("Orange");
        map.computeIfAbsent("Sweets", k -> new ArrayList<>()).add("Chocolate");
        map.computeIfAbsent("Sweets", k -> new ArrayList<>()).add("Ice Cream");

        // Print the map
        System.out.println(map);
	}
}
