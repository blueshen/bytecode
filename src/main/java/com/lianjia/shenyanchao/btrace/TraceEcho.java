package com.lianjia.shenyanchao.btrace;

import static com.sun.btrace.BTraceUtils.jstack;
import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.strcat;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;

/**
 * @author shenyanchao
 * @since 2017-05-18 19:58
 */

@BTrace
public class TraceEcho {
    @OnMethod(
            clazz = "/com\\.lianjia\\.shenyanchao\\.btrace\\.Echo/",
            method = "randomValue",
            location = @Location(Kind.RETURN))

    public static void funcTrace(@Return int result) {
        println("trace: =======================");
        jstack();
        println(strcat("result:", str(result)));
    }
}
