package com.zbk;

import javax.management.MXBean;

/**
 * @Author: 张博康
 * @Description: 利用@MXBean声明明接口，可以带MXBean后缀
 * @Date: 2021/9/18 10:16
 * @Version: 1.0.0
 */
@MXBean
public interface QueueSampler {

    public QueueSample getQueueSample();
    public void clearQueue();

}
