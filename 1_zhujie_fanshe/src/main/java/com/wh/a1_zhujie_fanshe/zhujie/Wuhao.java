package com.wh.a1_zhujie_fanshe.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//元注解 注解上的注解
////1.用 @interface 声明注解
////2.Target 可以做限定 TYPE：只能声明在类上  METHOD：只能声明在方法上 PARAMETER：参数 FIELD：常量
////3.Retention 保留级别
//    //RetentionPolicy.SOURCE 标记的注解仅保留在源级别中，并被编译器忽略   （编码期间使用）
//    //RetentionPolicy.CLASS  标记的注解在编译时由编译器保留，但jvm会忽略  （编译期使用）
//    //RetentionPolicy.RUNTIME 标记的注解由jvm保留，因此运行时环境可以使用它（运行时可用）
//@Target({ElementType.TYPE, ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
//public @interface Wuhao {
//    String value();//当只有value 没有其他元素时 使用时可以省略声明 直接赋值 "xxx"
//    String name();// 使用时需要声明 name = "xxx"
//}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Wuhao {
//    String value() default "123";
    String value();
}

//作用 应用场景
//1.SOURCE级别：生成辅助类 arouter betneff   自定义注解处理器  javac在处理.java文件时手机到注解信息 处理注解程序  语法检查 @IntDef @DrawableRes  IDE实现 IDE插件实现
//2.CLASS：字节码插桩技术 、热修复
//3.RUNTIME: 反射