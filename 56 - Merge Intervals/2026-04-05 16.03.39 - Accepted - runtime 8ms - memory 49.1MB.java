class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for(int i = 0; i < intervals.length - 1; i++){
            int[]last = merged.get(merged.size() - 1);
            int[] current = intervals[i + 1];

            if(current[0] <= last[1]){
                last[1] = Math.max(current[1], last[1]);

            } else{
                merged.add(current);
            }
            
}
return merged.toArray(new int[merged.size()][]);
        }
}
        

