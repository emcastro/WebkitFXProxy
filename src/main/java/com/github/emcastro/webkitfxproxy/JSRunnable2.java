package com.github.emcastro.webkitfxproxy;

/**
 * Created by ecastro on 05/12/16.
 */
@JSInterface
public interface JSRunnable2<A, B, R> extends JSFunction {

    R call(A a, B b);

    @Override
    default Object invoke(Object[] arguments) {
        checkArity(arguments, 1);
        return call((A) arguments[0], (B) arguments[1]);
    }
}