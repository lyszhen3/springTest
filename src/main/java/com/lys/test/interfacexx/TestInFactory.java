package com.lys.test.interfacexx;

import java.util.function.Supplier;

/**
 * Created by pc on 2016-10-25.
 *
 * @author pc
 * @version 3.0.0-SNAPSHOT
 * @since 3.0.0-SNAPSHOT
 */
public interface TestInFactory {

    static TestIn create(Supplier<TestIn> supplier){

        return supplier.get();
    }

}
