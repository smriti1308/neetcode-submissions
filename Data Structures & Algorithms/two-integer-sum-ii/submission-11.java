class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = numbers[0];
        int j = 0, k = numbers.length - 1;
        int right = 0;

        for (int i = numbers.length - 1; i > 0; i--) {
            right = numbers[k];
            if (j >= k) {
                break;
            } else if ((left + right) > target) {
                right = numbers[--k];

            } else if ((left + right) < target) {
                left = numbers[++j];
            }
            if (left + right == target) {
                break;
            }
        }

        int arr[] = new int[2];
        arr[0] = j + 1;
        arr[1] = k + 1;

        return arr;

        

        
    }
}
