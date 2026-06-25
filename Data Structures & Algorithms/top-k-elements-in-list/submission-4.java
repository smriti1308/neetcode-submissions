class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> mp = new HashMap<>();
       for(int no : nums){
           if(mp.containsKey(no)) {
               mp.put(Integer.valueOf(no), mp.get(no)+1);
           }
           else
               mp.put(no, 1);
       }

        List<Map.Entry<Integer, Integer>> collect = mp.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toList());

       int arr[]  = new int[k];
       for(int i = 0 ; i< k ;i++){
           arr[i] = collect.get(i).getKey();
        }
       
       return arr;

        
    }
}
