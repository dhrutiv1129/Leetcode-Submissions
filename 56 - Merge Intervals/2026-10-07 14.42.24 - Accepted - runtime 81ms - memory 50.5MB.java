class Solution {
    public int[][] merge(int[][] intervals) {
     
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // how do we instantiate the size?
        int[][] res = new int[intervals.length][2];        
        res[0][0] = intervals[0][0];
        res[0][1] = intervals[0][1];
      
        int place = 0;
        for(int i = 1; i < intervals.length; i++){
            int last = res[place][1];
            System.out.println(last);
            int first = intervals[i][0];
            System.out.println(first);

            if(last >= first){
                res[place][0] = Math.min(intervals[i][0], res[place][0]);
                res[place][1] = Math.max(intervals[i][1], res[place][1]);
              

            }

            else{
                place += 1;
                res[place][0] = intervals[i][0];
                res[place][1] = intervals[i][1];
                

            }
            



        }

        return Arrays.copyOf(res, place + 1);


        

    }
        
}