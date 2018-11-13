package com.lianjia.shenyanchao.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.Modifier;

/**
 * 使用javassist修改字节码样例
 *
 * @author shenyanchao
 * @since 2017-05-17 17:19
 */
public class ModifyPoint {

    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("com.lianjia.shenyanchao.Point");

        CtField xField = cc.getDeclaredField("x");
        xField.setModifiers(Modifier.PRIVATE);

        CtMethod method = cc.getDeclaredMethod("move");
        // 修改方法名
        method.setName("moveTo");
        // 插入一段代码
        method.insertBefore("{ System.out.println($1); System.out.println($2); }");
        cc.writeFile("generate/javassist");
    }
}
