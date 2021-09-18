package com.zbk;

import java.util.Date;
import java.util.Queue;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/9/18 10:25
 * @Version: 1.0.0
 */
public class QueueSamplerImpl implements QueueSampler {

    private Queue<String> queue;

    public  QueueSamplerImpl (Queue<String> queue) {
        this.queue = queue;
    }

    public QueueSample getQueueSample() {
        synchronized (queue) {
            return new QueueSample(new Date(),
                    queue.size(), queue.peek());
        }
    }

    public void clearQueue() {
        synchronized (queue) {
            System.out.println(queue.size());
            queue.clear();
            System.out.println(queue.size());
        }
    }
}
