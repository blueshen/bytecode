package com.lianjia.shenyanchao;

/**
 * @author shenyanchao
 * @since 2017-05-17 12:08
 */
public class HelloWorld {

    private String defaultName = "bytecode";

    public String hello() {
        return "hello, bytecode";
    }

    public String hello(String name) {
        return "hello, " + name;
    }

    public String helloWithBuffer(String name) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append(",").append(name);
        return sb.toString();
    }
}
