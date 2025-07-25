import java.util.*;
class Solution {
    //  public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i = m - 1, j = n - 1, k = m + n - 1;
    //     while (j >= 0) {
    //         if (i >= 0 && nums1[i] > nums2[j]) {
    //             nums1[k--] = nums1[i--];
    //         } else {
    //             nums1[k--] = nums2[j--];
    //         }
    //     }
    // }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // using shell sort method
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        int len = m+n;
        int gap = (len/2)+(len%2);
       
        while(gap>0){
            int i=0;
            int j=gap;
            while(j<len){
                if(nums1[i]>nums1[j]){
                    //swap
                    int temp = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
                i++;
                j++;
            }
            if(gap == 1) break;
            gap = (gap/2)+(gap%2);
        }
    }

// below is the code to sort the both the given array (nums1 and num2), then we can merge them
    //    int len = m+n;
    //    int gap = (len/2)+(len%2);
    //    while(gap>0){
    //     int left = 0;
    //     int right = gap+left;
    //     while(right < len) {
    //         if(left<m && right>=m){
    //             swapIfGreater(nums1, nums2, left, right-m);
    //         }else if(left>=m){
    //             swapIfGreater(nums1, nums2, left-m, right-m);

    //         }else{
    //             swapIfGreater(nums1, nums2, left, right);

    //         }
    //         left++;
    //         right++;
    //     }
    //     if(gap == 1) break;
    //     gap = (gap/2)+(gap%2);
    //    } 
               
    // }
 
    // void swapIfGreater(int[] arr1, int[] arr2, int index1, int index2){
    //     if(arr1[index1]> arr2[index2]){
    //         int temp = arr1[index1];
    //         arr1[index1]=arr2[index2];
    //         arr2[index2]=temp;
    //     }
    // }
  
}