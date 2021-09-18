package com.zbk;

import javax.management.MXBean;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/9/18 10:16
 * @Version: 1.0.0
 */
@MXBean
public interface QueueSampler {

    public QueueSample getQueueSample();
    public void clearQueue();

}
