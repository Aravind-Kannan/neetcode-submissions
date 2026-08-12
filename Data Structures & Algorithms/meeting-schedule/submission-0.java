/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt((Interval x) -> x.start).thenComparingInt(x -> x.end));

        for(int i = 0; i < intervals.size(); i++)
        {
            for(int j = i + 1; j < intervals.size(); j++)
            {
                if(intervals.get(i).end > intervals.get(j).start)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
