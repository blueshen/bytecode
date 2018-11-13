package com.lianjia.shenyanchao;

/**
 * @author shenyanchao
 * @since 2017-08-23 14:44
 */
public class Bootstrap {

    public static void main(String[] args) {
        String name = "shenyanchao";
        greeting(name);
    }

    public static void greeting(String name) {
        System.out.println("Hello," + name);
    }

}