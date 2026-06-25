class Solution {
    public int[] productExceptSelf(int[] nums) {

       int count = 1;
       int zerocount = 0;
       for(int i = 0 ; i<nums.length ; i++){
        if(nums[i] != 0){
         count = count * nums[i];
        }
        else{
            zerocount++;
        }

       } 

       if(zerocount >1)
       return new int[nums.length];

       int arr [] = new int [nums.length];

       for(int i =0 ; i< nums.length ; i++){
        if(zerocount > 0){
            arr[i] = (nums[i] == 0) ? count : 0;
        }
        else
        arr[i] = count /nums[i];
       }

       return arr;
    }
}  
