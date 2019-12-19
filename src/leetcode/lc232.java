package leetcode;

import java.util.Stack;

public class lc232 {

    public static void main(String[] args) {
        lc232 queue = new lc232();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.empty()); // 返回 false
    }

    private Stack<Integer> in = new Stack<>();

    private Stack<Integer> out = new Stack<>();

    /** Initialize your data structure here. */
    public lc232() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        in2out();
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        in2out();;
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(in.isEmpty() && out.isEmpty())
            return true;
        return false;
    }

    private void in2out(){
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
