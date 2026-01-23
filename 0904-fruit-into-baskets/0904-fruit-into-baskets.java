class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left=0;
        int right = 0;
        int maxLen = 0;
        while(right<fruits.length){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){
                // trim down from left
                int count = map.get(fruits[left]);
                count--;
                map.put(fruits[left], count);
                if(count == 0){
                    map.remove(fruits[left]);
                }
                left++;

            }else{
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}