class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> lis = new ArrayList<>();
        for (int num : nums) {
            lis.add(num);
        }

        Optional<Integer> first =
                lis
                .stream()
                .filter(x -> !set.add(x))
                .findFirst();


        return !first.isEmpty();
 
    }
}
