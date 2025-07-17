import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultSubsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        solveUniqueSubsets(0,subset,nums, resultSubsets);
        return resultSubsets;
    }
    void solveUniqueSubsets(int i, List<Integer> subset,int[] nums, List<List<Integer>> resultSubsets){
        if(nums.length == i){
            resultSubsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        solveUniqueSubsets(i+1, subset, nums, resultSubsets);
        subset.remove(subset.size()-1);
        //remove duplicates
        int ni = i+1;
        while(ni<nums.length && nums[ni] == nums[i]){
            ni++;
        }
        solveUniqueSubsets(ni, subset, nums, resultSubsets);
    }

    // void solveUniqueSubsets(int i, List<Integer> subset,int[] nums, List<List<Integer>> resultSubsets){
    //     if(nums.length == i){
    //         if(!duplicatePresent(resultSubsets, subset)){
    //             resultSubsets.add(new ArrayList<>(subset));
    //         }
    //         return;
    //     }

    //     subset.add(nums[i]);
    //     solveUniqueSubsets(i+1, subset, nums, resultSubsets);
    //     subset.remove(subset.size()-1);
    //     solveUniqueSubsets(i+1, subset, nums, resultSubsets);
    // }

    // boolean duplicatePresent(List<List<Integer>> subsets, List<Integer> subset) {
    //     for(List<Integer> x : subsets){
    //         if(x.equals(subset)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}