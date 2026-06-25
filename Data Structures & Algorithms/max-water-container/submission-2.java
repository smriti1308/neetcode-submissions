class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int l = 0, r = heights.length-1;
        int minHeight= Integer.MAX_VALUE;
        for(int i = 0 ; i< heights.length;i++){
             minHeight =  Math.min(heights[r], heights[i]);
            int area1 = (r- i) * minHeight;
            if(heights[i]>heights[r]){
                r--;
                i--;
            }
            area = Math.max(area, area1);

        }

        return area;
    }
}
