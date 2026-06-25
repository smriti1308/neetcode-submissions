class Solution {
    public int[] twoSum(int[] input, int target) {
        
      
        int [] output = new int[2];
        int p1 = 0;
        int p2 = 1;
        while(p1< input.length-1 & p2<input.length){
            if(input[p1] + input[p2] == target){
                output[0]= p1;
                output[1]= p2;
                break;
            }
            else if(p2== input.length-1){
                p1++;
                p2= p1+1;
            }
            else
                p2++;
        }

        return output;
    }
}
