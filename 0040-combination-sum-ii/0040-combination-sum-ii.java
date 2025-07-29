class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // HashSet<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        // findCombinationSum(0,candidates, target, ds, ans);
        // return new ArrayList<>(ans);
        solveCombinationSumUsingLoop(0, candidates, target, ds, ans);
        return ans;
    }
    private void solveCombinationSumUsingLoop(int index, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            solveCombinationSumUsingLoop(i+1, arr, target-arr[i], ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    // private void findCombinationSum(int index, int[] candidates, int target, List<Integer> ds, HashSet<List<Integer>> ans) {
    //     if(index == candidates.length){
    //         if(target == 0) {
    //             ans.add(new ArrayList<>(ds));
    //         }
    //         return;
    //     }

    //     if(candidates[index]<=target){
    //         ds.add(candidates[index]);
    //         findCombinationSum(index+1, candidates, target-candidates[index], ds, ans);
    //         ds.remove(ds.size()-1);

    //     }
    //     findCombinationSum(index+1, candidates, target, ds, ans);
    // }
    }
