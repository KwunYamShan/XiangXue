package com.wh.a1_zhujie_fanshe.fanshe;

import android.app.Activity;
import android.view.View;

import com.wh.a1_zhujie_fanshe.R;

import java.lang.reflect.Field;

//getFiled:
//获得自己+父类的成员（不包括private，只能是public）
//获得自己的成员（不包括父类成员， 但是是包括所有作用域）
//如果需要获得私有的父类中的成员 class.getSuperclass()
public class InjectUtils {

    public static void injectView(Activity activity) {
        Class<? extends Activity> cls = activity.getClass();
        //cls.getSuperclass().getDeclaredField("xxx");
        Field[] declaredFields = cls.getDeclaredFields();//获得此类所有的成员
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(InjectView.class)) {//判断包含InjectView注解的属性
                InjectView annotation = field.getAnnotation(InjectView.class);//获得注解
                int        id         = annotation.value();//获得注解设置的id
                View       viewById   = activity.findViewById(id);

                field.setAccessible(true);//设置访问权限，允许操作private的属性
                try {
                    field.set(activity,viewById); //反射设置属性的值
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
