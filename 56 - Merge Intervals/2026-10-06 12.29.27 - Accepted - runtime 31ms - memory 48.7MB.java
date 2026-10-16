class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int place = 0;
        int[][] result = new int[intervals.length][2];
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
         
            if (result[place][1] >= intervals[i][0]){
                System.out.println("entered");
                result[place][0] = result[place][0];
            
                result[place][1] = Math.max(result[place][1], intervals[i][1]);
               
            } else{
                place ++;
                result[place][0] = intervals[i][0];
                result[place][1] = intervals[i][1];
            }   

          
            
        }
        return Arrays.copyOf(result, place + 1);
    }
}