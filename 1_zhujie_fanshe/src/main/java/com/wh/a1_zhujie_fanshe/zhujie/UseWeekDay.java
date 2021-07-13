package com.wh.a1_zhujie_fanshe.zhujie;

import androidx.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class UseWeekDay {


    static final int SUNDAY = 1;
    static final int MONDAY = 0;

    @IntDef({SUNDAY, MONDAY})
    @Target({ElementType.PARAMETER, ElementType.FIELD})//参数、常量
    @Retention(RetentionPolicy.SOURCE)
    @interface WeekDay {

    }

    @WeekDay
    private static int mCurrentDay;

    public static void setCurrentDay(@WeekDay int currentDay) {
        mCurrentDay = currentDay;
    }

    public static void main(String[] args) {
        setCurrentDay(UseWeekDay.MONDAY);
        //setCurrentDay(111);报错
    }
}
