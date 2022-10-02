package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
https://www.geeksforgeeks.org/design-a-hit-counter/
 */
public class HitCounter {
    // Normal Approach
//    Queue<Integer> pq = new LinkedList<>();
//    public int get(int timeStamp){
//            int temp = timeStamp - 300;
//            while(!pq.isEmpty() && pq.peek() <= temp){
//                pq.poll();
//            }
//        return pq.size();
//    }
//
//    public void hit(int a){
//        pq.add(a);
//    }

    //best Approach
    int hits[] = new int[300];
    int time[] = new int[300];

    public void hit(int timeStamp){
        int ind = timeStamp % 300;
        if(time[ind] != timeStamp){
            hits[ind] = 1;
            time[ind] = timeStamp;
        }

        else{
            hits[ind]++;
        }
    }

    public int get(int timeStamp){
        int count = 0;
        for(int i = 0; i < 300; i++){
            if(timeStamp - time[i] < 300 ){
                count+= hits[i];
            }
        }
        return count;
    }


    public static void main(String[] args) {
        HitCounter obj = new HitCounter();
        obj.hit(1);
        obj.hit(2);
        obj.hit(3);
        int hits  = obj.get(4);
        System.out.println(hits);
        obj.hit(300);
        hits = obj.get(300);
        System.out.println(hits);
        hits = obj.get(301);
        System.out.println(hits);

        obj.hit(500);
        obj.hit(600);
        hits = obj.get(700);
        System.out.println(hits);
    }
}
