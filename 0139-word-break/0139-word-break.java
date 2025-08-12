class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return solveWordBreakDp(0, s, wordDict, dp);
        // return solveWordBreak(0, s, wordDict);
        
    }

    // give TLE for "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
    // boolean solveWordBreak(int index, String s, List<String> wordDict){
    //     //base cond
    //     if(index == s.length()){
    //         return true;
    //     }

    //     for(int i=index;i<s.length();i++){
    //         if(wordDict.contains(s.substring(index, i+1))){
    //             if(solveWordBreak(i+1, s, wordDict)){
    //                return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    boolean solveWordBreakDp(int index, String s, List<String> wordDict, Boolean[] dp){
        //base cond
        if(index == s.length()){
            return true;
        }

        if(dp[index]!=null) return dp[index];

        for(int i=index;i<s.length();i++){
            if(wordDict.contains(s.substring(index, i+1))){
                if(solveWordBreakDp(i+1, s, wordDict, dp)){
                   return dp[index]=true;
                }
            }
        }
        return dp[index] = false;
    }
}