class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        // solvePermulatesUsingFreqArray(nums, ds, freq, ans);
        solvePermulatesUsingSwap(0, nums, ans);
        return ans;
        
    }

    private void solvePermulatesUsingSwap(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            //copy nums array elements into ds
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
        }

        for(int i=index; i<nums.length; i++){
            swap(i, index, nums);
            solvePermulatesUsingSwap(index+1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    // private void solvePermulatesUsingFreqArray(int[] nums, List<Integer> ds, boolean[] freq, List<List<Integer>> ans){
    //     if(ds.size() == nums.length){
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //     }

    //     for(int i=0;i<nums.length;i++){
    //         if(!freq[i]){
    //             ds.add(nums[i]);
    //             freq[i] =true;
    //             solvePermulatesUsingFreqArray(nums, ds,freq,ans);
    //             ds.remove(ds.size()-1);
    //             freq[i]=false;
    //         }
    //     }
    // }
}