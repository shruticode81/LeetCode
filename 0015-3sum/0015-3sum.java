import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0) {
                    List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(triplets);
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                    
                }else if(sum < 0) {
                    j++;
                }else{
                    k--;
                }
             }

        }

      
        return result;
    }



    //  public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> result = new HashSet<>();
    //     int n = nums.length;
    //     for(int i=0;i<n-1;i++){
    //         HashSet<Integer> seen = new HashSet<>();
    //         for(int j=i+1; j<n;j++){
    //             int complement = -nums[i]-nums[j];
    //             if(seen.contains(complement)){
    //                 List<Integer> triplets = Arrays.asList(nums[i],nums[j],complement);
    //                 Collections.sort(triplets);
    //                 result.add(triplets);
    //             }

    //             seen.add(nums[j]);
    //         }
    //     }


    //     return new ArrayList<>(result);
    // }
}