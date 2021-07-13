package com.wh.a1_zhujiechuliqi;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
//注解处理程序 处理注解
//1.创建java Library
//2.创建固定resources目录的固定文件
//3.在Processor文件中声明注解处理器的全类名
//4.app引用该处理程序库 annotationProcessor project(':1_zhujiechuliqi')
@SupportedAnnotationTypes("com.wh.a1_zhujie_fanshe.zhujie.Wuhao")//指定需要处理的注解：注解全类名
public class MyClass extends AbstractProcessor {

    //发生的调用时机：javac在编译java代码之前会采集所有注解信息
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        //打印log
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE,"----------打印----------");
        //处理xx
        return false;
    }
}

