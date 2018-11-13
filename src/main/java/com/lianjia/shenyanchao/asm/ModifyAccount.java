package com.lianjia.shenyanchao.asm;

import java.io.File;
import java.io.FileOutputStream;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/**
 * 使用ASM修改Account字节码
 *
 * @author shenyanchao
 * @since 2017-05-17 18:57
 */
public class ModifyAccount {

    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("com.lianjia.shenyanchao.Account");
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassAdapter classAdapter = new AddClassAdapter(cw);
        cr.accept(classAdapter, ClassReader.SKIP_DEBUG);
        byte[] data = cw.toByteArray();
        File file = new File("/Users/shenyanchao/IdeaProjects/bytecode/generate/asm/Account.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }
}
