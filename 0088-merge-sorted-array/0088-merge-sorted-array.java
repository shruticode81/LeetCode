class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] merge = new int[m+n];
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                merge[index] = nums1[left];
                left++;
                index++;
            }else if (nums1[left]>nums2[right]){
                merge[index] = nums2[right];
                right++;
                index++;
            }
        }
        while(left<m){
            merge[index] = nums1[left];
            index++;
            left++;
        }
         while(right<n){
            merge[index] = nums2[right];
            index++;
            right++;
        }

        for(int i=0;i<m+n;i++){
            nums1[i]=merge[i];
        }
     
     
      }
    }
