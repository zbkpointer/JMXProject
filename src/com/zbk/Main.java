package com.zbk;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

//    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
//
//        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
//        ObjectName name = new ObjectName("com.zbk:type=Hello");
//        Hello mbean = new Hello();
//        mbs.registerMBean(mbean, name);
//
//        System.out.println("Waiting forever...");
//        Thread.sleep(Long.MAX_VALUE);
//
//    }

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.zbk:type=QueueSamplerImpl");

        Queue<String> queue = new ArrayBlockingQueue<String>(10);
        queue.add("Request-1");
        queue.add("Request-2");
        queue.add("Request-3");

        QueueSamplerImpl mbean = new QueueSamplerImpl(queue);
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);

    }
}
