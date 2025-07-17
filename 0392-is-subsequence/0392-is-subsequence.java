class Solution {
    public boolean isSubsequence(String s, String t) {
        // char[] str = s.toCharArray();
        int count=0;
        int i=0;
        int j=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i) == s.charAt(j)){
                count++;
                i++;
                j++;
            }else{
                i++;
            }
        }

        if(count == s.length()){
            return true;
        }
        return false;
    }
}