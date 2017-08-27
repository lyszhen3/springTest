package com.test.beanTest;

/**
 * Created by lys on 2017-08-20.
 *测试factory-method属性
 * @author lys
 * @version 3.0.0-SNAPSHOT
 * @description
 * @since 3.0.0-SNAPSHOT
 */
public class FactoryTest {
    private Integer id;
    private Son son;
    private Son sonSecond;
    private FactoryTest(){

    }
    private FactoryTest(Integer id){
        this.id = id;
    }



    private static class SingleHolder{
        final static FactoryTest factoryTest = new FactoryTest();
    }
    public static FactoryTest getInstance(Integer id,Son son){
        SingleHolder.factoryTest.setSon(son);
        SingleHolder.factoryTest.setId(id);
        return SingleHolder.factoryTest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    public Son getSonSecond() {
        return sonSecond;
    }

    public void setSonSecond(Son sonSecond) {
        this.sonSecond = sonSecond;
    }
}
