package com.lianjia.shenyanchao.bytebuddy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author shenyanchao
 * @since 2018-11-14 11:48
 */
public class ByteBuddyExampleTest {

    ByteBuddyExample byteBuddyExample = new ByteBuddyExample();

    @Test
    public void createClass() throws Exception {
        Class type = byteBuddyExample.createClass();

        Method m = type.getDeclaredMethod("custom", null);
        assertEquals(m.invoke(type.newInstance()), Bar.sayHelloBar());
        assertNotNull(type.getDeclaredField("x"));
    }

    @Test
    public void hellWorld() throws Exception {
        Class type = byteBuddyExample.helloWorld();

        assertEquals("Hello World ByteBuddy!", type.newInstance().toString());
    }

}