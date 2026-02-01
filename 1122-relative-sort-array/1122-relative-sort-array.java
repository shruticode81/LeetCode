class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i:arr1){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i: arr2){
            if(map.containsKey(i)){
                int freq = map.get(i);
                while(freq>0){
                    res.add(i);
                    freq--;
                }
                map.remove(i);
            }
        }
        if(map.size()>0){
            List<Integer> list = map.keySet().stream().collect(Collectors.toList());
            list.sort(Comparator.naturalOrder());
            for(Integer key: list){
                int freq = map.get(key);
                while(freq>0){
                    res.add(key);
                    freq--;
                }
            }
        }
        int[] ans = new int[arr1.length];
        for(int i=0;i<res.size();i++){
            ans[i]= res.get(i);
        }
        return ans;
    }
}