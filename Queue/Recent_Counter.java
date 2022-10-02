/*
Problem- Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, 
and returns the number of requests that has happened in the past 3000 milliseconds (including the new request).
Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]


done


 */
package Queue;
import java.util.*;

public class Recent_Counter {
    static Queue<Integer> queue;
 
     public static void main(String[] args) {
        String input[] = {"ping", "ping", "ping", "ping"};
        int time[] = {1, 100, 3001, 3002, 6002};
           queue = new LinkedList<>();
        for(int i = 0;i<time.length;i++)
        {
            System.out.println(ping(time[i]));
        }
    }

    public static int ping(int t) {
        while( !queue.isEmpty() && t-queue.peek() > 3000)
        {
            queue.poll();
        }
        queue.add(t);
        return queue.size();
    }   
}
