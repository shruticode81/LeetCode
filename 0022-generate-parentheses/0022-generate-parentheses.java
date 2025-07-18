class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int open=n;
        int close=n;
        String opt="";
        solveRecursiveParenthesis(open, close, opt, result);
        return result;
    }

    void solveRecursiveParenthesis(int open, int close, String opt, List<String> result){
        // base case
        if(open == 0 && close == 0){
            result.add(opt);
            return;
        }

        if(open != 0){
            String op1 = opt;
            op1=op1+"(";
            solveRecursiveParenthesis(open-1, close, op1, result);
        }

        if(close>open){
            String op2 = opt;
            op2=op2+")";
            solveRecursiveParenthesis(open, close-1, op2, result);
        }

        return;
    }
}