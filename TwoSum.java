//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 public static void main(String[] args) {
    List<Integer> sourceArray= Arrays.asList(2,5,7,8,9,10,12);
        Map<Integer,Integer> dataMap=new HashMap<Integer,Integer>();
        int target=15;
        int index=0; int complement=0;
        for(Integer currentVal: sourceArray)
        {
            dataMap.put(currentVal,index);
            complement= target - currentVal;
            System.out.println("Calculated the complement value :"+complement);
            if( dataMap.containsKey(complement))
            {
                System.out.println("Got the lower limit ="+dataMap.get(complement)+ " and " +
                        "upper limit ="+index);
                break;
            }
            index++;
        }


 }
