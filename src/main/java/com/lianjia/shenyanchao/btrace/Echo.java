package com.lianjia.shenyanchao.btrace;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author shenyanchao
 * @since 2017-05-18 19:51
 */
public class Echo {

    private Random random = new Random();

    public int randomValue(){
        return random.nextInt(100);
    }

    public static void main(String[] args) throws Exception {
        Echo echo = new Echo();
        for (int i = 0; i < 1000; i ++){
            int value = echo.randomValue();
            TimeUnit.SECONDS.sleep(1);
            System.out.println(value);

        }
    }
}
