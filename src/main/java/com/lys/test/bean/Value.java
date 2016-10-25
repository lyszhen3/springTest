package com.lys.test.bean;

/**
 * Created by pc on 2016-10-25.
 *
 * @author pc
 * @version 3.0.0-SNAPSHOT
 * @since 3.0.0-SNAPSHOT
 */
public class Value<T> {
//    public static<T> T defaultValue(){
//        return null;
//    }
    public T getOrDefault(T value,T defaultValue){


        return value!=null?value:defaultValue;
    }
}
