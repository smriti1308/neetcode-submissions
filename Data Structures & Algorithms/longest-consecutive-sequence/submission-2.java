class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count= 0, right =0;
        if(nums.length<=0){
            return 0;
        }

        for(int i =0; i< nums.length; i++){
           set.add(nums[i]);
        }


        for(int n : set){
            right =1;

            while(set.contains(n+1)){
                right++;
                n++;
            }

            count = Math.max(count, right);

        }

        return count;



    }
}
