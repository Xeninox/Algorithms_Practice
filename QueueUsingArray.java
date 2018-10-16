/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;

/**
 *
 * @author Constant Likudie
 */
public class QueueUsingArray {

    private final ArrayList<Integer> queue;

    public QueueUsingArray() {
        queue = new ArrayList<>();
    }

    public boolean enqueue(int num) {
        this.queue.add(num);
        return true;
    }

    public Integer dequeue() {
        int number = this.queue.get(0);
        this.queue.remove(0);
        return number;
    }

}
