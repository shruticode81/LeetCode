class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        
        //sort the 2d array
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int[] previous = intervals[0];
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= previous[1]) {
                //merge 
                previous[1] = Math.max(intervals[i][1], previous[1]);
            }else {
                // save the intervals
                result.add(previous);
                previous = intervals[i];
            }
        }
        // add last interval
        result.add(previous);
        return result.toArray(new int[result.size()][]);
        
    }
}