import java.util.*;
class Solution {
    // public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     int n = nums.length;
    //     int i=0;
    //     int j=i+1;
    //     int k=n-1;
    //     Arrays.sort(nums);

    //     while(j<k){
    //         if(nums[i]+nums[j]+nums[k] == 0) {
    //             List<Integer> tripletPair = new ArrayList<>();
    //             tripletPair.add(nums[i]);
    //             tripletPair.add(nums[j]);
    //             tripletPair.add(nums[k]);
    //             for(List<Integer> sublist :result){
    //                 if(sublist.containsAll(tripletPair)){
    //                     j++;
    //                     i++;
    //                     continue;
    //                 }
    //             }
    //             result.add(tripletPair);
    //             j++;
    //             i++;
    //         }else if(nums[i]+nums[j]+nums[k] < 0) {
    //             j++;
    //             i++;
    //         }else{
    //             k--;
    //         }
    //     }
    //     return result;
    // }



     public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1; j<n;j++){
                int complement = -nums[i]-nums[j];
                if(seen.contains(complement)){
                    List<Integer> triplets = Arrays.asList(nums[i],nums[j],complement);
                    Collections.sort(triplets);
                    result.add(triplets);
                }

                seen.add(nums[j]);
            }
        }


        return new ArrayList<>(result);
    }
}