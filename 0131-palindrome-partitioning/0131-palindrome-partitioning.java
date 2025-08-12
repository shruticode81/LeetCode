class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        solvePartition(s, 0, ans, res);
        return res;
    }

    void solvePartition(String s, int index, List<String> ans, List<List<String>> res){
        // base cond
        if(index == s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s, index, i)) {
                ans.add(s.substring(index, i+1));
                solvePartition(s, i+1, ans, res);
                ans.remove(ans.size()-1);
            }
        }
    } 

    boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}