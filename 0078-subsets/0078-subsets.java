class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultSubsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        solveSubset(nums,0, subset, resultSubsets);
        return resultSubsets;
        
    }
    void solveSubset(int[] nums, int i, List<Integer> subset, List<List<Integer>> resultSubsets){
        if(i == nums.length){
            resultSubsets.add(new ArrayList<>(subset));
            return ;
        }
        //add the element in subset for i
        subset.add(nums[i]);
        solveSubset(nums, i+1, subset, resultSubsets);
        subset.remove(subset.size()-1);
        solveSubset(nums, i+1, subset, resultSubsets);
    }
}