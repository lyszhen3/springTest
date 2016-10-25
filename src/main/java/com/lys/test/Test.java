package com.lys.test;

import com.lys.test.bean.Car;
import com.lys.test.bean.Value;
import com.lys.test.impl.TestInImpl;
import com.lys.test.interfacexx.TestIn;
import com.lys.test.interfacexx.TestInFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import static org.apache.coyote.http11.Constants.a;

/**
 * Created by pc on 2016-10-25.
 *
 * @author pc
 * @version 3.0.0-SNAPSHOT
 * @since 3.0.0-SNAPSHOT
 */
public class Test {

    public Test (){

    }

    public static void main(String[] args) throws NoSuchMethodException {
//        List<Car> llist=new ArrayList();
//       Car a=new Car();
//        Car b=new Car();
//        a.name="宝马";
//        a.speed="350";
//        b.name="奔驰";
//        b.name="200";
//        llist.add(a);
//        llist.add(b);
//
//
//
//        llist.forEach(e->{e.name="劳斯莱斯";
//            System.out.println(e.name);});
//
//
//        TestIn tt= TestInFactory.create(TestInImpl::new);

//        final Value< Integer > value = new Value<>();
//        System.out.println(value.getOrDefault(null, 1));
        String[] xx={"1"};

        Method method = Test.class.getMethod( "main",String[].class);
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }

    }
}
