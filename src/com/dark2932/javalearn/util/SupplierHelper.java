package com.dark2932.javalearn.util;

import java.util.function.Supplier;

/**
 * @author Dark2932
 * @date 2025/11/28
 */
public class SupplierHelper<T> implements Supplier<T> {

    private final T target;

    public SupplierHelper(T t) {
        this.target = t;
    }

    public Supplier<T> getLambda(T t) {
        return () -> t;
    }

    @Override
    public T get() {
        return target;
    }

}
