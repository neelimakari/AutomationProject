package com.automation.seleniumCorePrograms;

import java.util.PriorityQueue;

public class QueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue queue=new PriorityQueue();
        queue.add("hello");
        queue.add("neelima");
        queue.add("iT JOB");
        queue.add("fAMILY");
        queue.add("hOUSE");
        //queue.add(null);
        System.out.println(queue);
    }
}
