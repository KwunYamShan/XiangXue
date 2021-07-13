package com.wh.a1_zhujie_fanshe;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.wh.a1_zhujie_fanshe.fanshe.InjectUtils;
import com.wh.a1_zhujie_fanshe.fanshe.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.tv)
    TextView tv;
    int num;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InjectUtils.injectView(this);
        tv.setText("反射findviewbyid");
    }
    public static void setDrawable(@DrawableRes int id){

    }
}