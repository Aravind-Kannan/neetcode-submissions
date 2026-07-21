class DataPoint {
        int x;
        int y;
        double dist;

        DataPoint(int x, int y, double dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<DataPoint> minHeap = new PriorityQueue<>(
            (a, b) -> Double.compare(a.dist, b.dist)
        );

        for(int i = 0; i < points.length; i++)
        {
            int x = points[i][0], y = points[i][1];
            double dist = Math.sqrt(x * x + y * y);
            minHeap.offer(new DataPoint(x, y, dist));
        }

        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            DataPoint top = minHeap.poll();
            result[i][0] = top.x;
            result[i][1] = top.y;
        }

        return result;
    }
}
