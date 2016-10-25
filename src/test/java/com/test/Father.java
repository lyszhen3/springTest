package com.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by pc on 2016-08-18.
 */
public class Father<T> {

    private T per;
    public Father(T t){
        this.per=t;
    }

    public Father(){

    }

    private String xx;


    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public static void main(String[] args) {
       List<Integer> intl=new ArrayList<Integer>();
        intl.add(1);
    }

    @Test
    public void testx(){
        System.out.println(new StringBuilder().toString());

        LinkedBlockingQueue linkqueue=new LinkedBlockingQueue(3);
    }


}
