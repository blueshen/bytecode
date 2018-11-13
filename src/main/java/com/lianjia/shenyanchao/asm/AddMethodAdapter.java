package com.lianjia.shenyanchao.asm;

import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author shenyanchao
 * @since 2017-05-17 18:56
 */
public class AddMethodAdapter extends MethodAdapter {
    public AddMethodAdapter(MethodVisitor methodVisitor) {
        super(methodVisitor);
    }

    public void visitCode() {
        // 在"operation"方法首部插入对 System.out.println("Hello World!");
        visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        visitLdcInsn("Hello World!");
        visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
                "(Ljava/lang/String;)V");
        // 增加return;
        // visitInsn(Opcodes.RETURN);
    }

}
