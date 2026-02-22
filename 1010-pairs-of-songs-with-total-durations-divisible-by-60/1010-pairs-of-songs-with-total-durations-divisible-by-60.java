class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] freq = new int[60];
        for(int i=0;i<time.length;i++){
            int reminder = time[i]%60;
            int complement = (60 - reminder)%60;
            count = count+freq[complement];
            freq[reminder]++;

        }
        return count;
    }
}