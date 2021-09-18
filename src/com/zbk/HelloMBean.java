package com.zbk;

/**
 * @Author: 张博康
 * @Description: 接口后缀必须为MBean，实现类名必须是去掉MBean前的字符串
 * @Date: 2021/9/18 9:04
 * @Version: 1.0.0
 */
public interface HelloMBean {

    public void sayHello();
    public int add(int x, int y);

    public String getName();

    public int getCacheSize();
    public void setCacheSize(int size);

}
