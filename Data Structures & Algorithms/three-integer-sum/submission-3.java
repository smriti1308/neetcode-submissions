class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       
      Set<List<Integer>> ls1= new HashSet<>();
        Arrays.sort(nums);



        for(int i = 0; i< nums.length;i++){
            int k= nums.length-1;
            for(int j = i+1; j< nums.length ;j++){
              int sum = nums[i] + nums[j] + nums[k];

                if(k>j ) {
                    if (sum == 0 ) {

                        List<Integer> ls2 = new ArrayList<>();
                        ls2.add(nums[i]);
                        ls2.add(nums[j]);
                        ls2.add(nums[k]);
                        Collections.sort(ls2);
                        ls1.add(ls2);
                    } else if(sum>0) {
                        k--;
                        j--;


                    }
                }
            }
        }

        return ls1.stream().toList();
    }
}
