class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        boolean canAttend = true;
        int i;
        int n = intervals.length;
        for(i=1;i<n;i++) {
            if(intervals[i][0] < intervals[i-1][1]) {
                canAttend = false;
            }
        }

        return canAttend;
    }
}