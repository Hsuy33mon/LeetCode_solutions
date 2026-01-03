package Leetcode.FindMediumFromDataStream;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left = new PriorityQueue<>((a,b) -> b-a);
        right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        left.offer(num);
        right.offer(left.poll());
        if(right.size() > left.size()){
            left.offer(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size()){
            return (double)left.peek();
        }
        return (double)(left.peek() + right.peek())/2;
    }
}
