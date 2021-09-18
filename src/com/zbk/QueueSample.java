package com.zbk;

import java.beans.ConstructorProperties;
import java.util.Date;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/9/18 10:26
 * @Version: 1.0.0
 */
public class QueueSample {
    private final Date date;
    private final int size;
    private final String head;

    @ConstructorProperties({"date", "size", "head"})
    public QueueSample(Date date, int size,
                       String head) {
        this.date = date;
        this.size = size;
        this.head = head;
    }

    public Date getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getHead() {
        return head;
    }
}
