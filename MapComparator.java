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
	}
}
