class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
         solveSubsetsWithDup(0, nums,res, ans);
         return res;

        
    }

   void solveSubsetsWithDup(int index, int[] nums, List<List<Integer>> res, List<Integer> ans){
        // base cond
        res.add(new ArrayList<>(ans));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            solveSubsetsWithDup(i+1,nums,res,ans);
            ans.remove(ans.size()-1);
        }
    }
}