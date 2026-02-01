class Solution {
    public List<String> commonChars(String[] words) {
        
       int[] last = countFreq(words[0]);
       for(int i=1;i<words.length;i++){
         last = intersectionMin(last, countFreq(words[i]));
       }
       List<String> res = new ArrayList<>();
       for(int i=0;i<26;i++){
        
        if(last[i]!=0){
            // char c =;
            String s = String.valueOf( (char) ('a'+i));
            while(last[i]>0){
                res.add(s);
                last[i]--;
            }
        }
       }
       return res;
    }
    int[] intersectionMin(int[] arr1, int[] arr2){
        int[] t = new int[26];
        for(int i=0;i<26;i++){
            t[i] = Math.min(arr1[i], arr2[i]);
        }
        return t;
    }

    int[] countFreq(String word){
        int[] freq = new int[26];
        // for(int i=0;i<word.length();i++){
        //     freq['a'-word.charAt(i)]++;
        // }
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
}