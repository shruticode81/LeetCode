class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> resultPermulation = new ArrayList<String>();
        solveLetterCasePermutation(s, 0, "",resultPermulation);
        return resultPermulation;
        
    }
    void solveLetterCasePermutation(String s, int i, String opt, List<String> resultP){
        //base condition
        if(i == s.length()){
            resultP.add(opt);
            return;
        }

        int j=i;
        while(j!=s.length() && Character.isDigit(s.charAt(j))){
            opt=opt+Character.toString(s.charAt(j));
            j++;
        }
    
        if(j==s.length()){
           resultP.add(opt);
           return;
        }
       String opt1 = opt+Character.toString(Character.toLowerCase(s.charAt(j)));
       String opt2 = opt+Character.toString(Character.toUpperCase(s.charAt(j)));
        solveLetterCasePermutation(s, j+1, opt1, resultP);
        solveLetterCasePermutation(s, j+1, opt2, resultP);

    }
}