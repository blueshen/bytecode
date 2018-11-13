package com.lianjia.shenyanchao.aspectj;

/**
 * ASPECTJ切面
 *
 * @author shenyanchao
 *
 */

public aspect AspectHelloWord {

    pointcut HelloWorldPointCut() : execution(* com.lianjia.shenyanchao.HelloWorld.hello(..));

    before() : HelloWorldPointCut(){
        System.out.println("aspectj invoke before hello() ");
    }
}