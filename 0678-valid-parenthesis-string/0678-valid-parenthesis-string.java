class Solution {

      public boolean checkValidString(String s) {
        // T.C = O(N)
        // S.C = o(1)
        int n = s.length();
        int min=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                min = min+1;
                max = max+1;
            } else if(s.charAt(i) == ')'){
                min = min-1;
                max=max-1;
            }else{
                min = min-1;
                max = max+1;
            }
            if(min<0) min = 0;
            if(max<0) return false;
        }
        return min == 0;
    }

    // public boolean checkValidString(String s) {
    //     int n = s.length();
    //     return solveCheckValidString(s, 0, 0, n);
    // }
    // optimize using dp (recursion+memorization)
    // boolean solveCheckValidString(String s, int index, int count, int n){
    //     // T.C (3^n)
    //     // S.C (O(N))
    //     // base cond
    //     if(count<0) return false;
    //     if(index == n){
    //         return count == 0;
    //     }

    //     if(s.charAt(index) == '('){
    //         return solveCheckValidString(s, index+1, count+1, n);
    //     }else if(s.charAt(index) == ')'){
    //         return solveCheckValidString(s, index+1, count-1, n);
    //     }else{
    //         return (solveCheckValidString(s, index+1, count+1, n)|
    //                 solveCheckValidString(s, index+1, count, n)|
    //                 solveCheckValidString(s, index+1, count-1, n));
    //     }
    // }
}