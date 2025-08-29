class Solution {
    public int candy(int[] ratings) {
        // T.C => o(n) s.c=> o(1)
        int i=1;
        int sum=1;
        int n = ratings.length;
        while(i<n){
            if(ratings[i] == ratings[i-1]){
                sum = sum+1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak = peak+1;
                i++;
                sum+=peak;
            }
            int down = 1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum=sum+down;
                i++;
                down++;
            }
            if(down>peak){
                sum = sum+(down-peak);
            }
        }
        return sum;
    }
}