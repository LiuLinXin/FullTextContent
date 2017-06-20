package com.philer.demo.imgintext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.philer.demo.textimg.ImgInText;

public class MainActivity extends Activity {

    private TextView tvText1, tvText2, tvText3, tvText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText1 = (TextView) findViewById(R.id.tvText1);
        tvText2 = (TextView) findViewById(R.id.tvText2);
        tvText3 = (TextView) findViewById(R.id.tvText3);
        tvText4 = (TextView) findViewById(R.id.tvText4);

        ImgInText.setText(tvText1, "aslkdfa${}asdfj${}${}",true, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        ImgInText.setText(tvText2, "时间${}正在流失", R.mipmap.horloge);
        ImgInText.setText(tvText3, "社会文明${}与科技发展${}是可以兼顾的", true, R.mipmap.robot, R.mipmap.arbre);
        ImgInText.setText(tvText4, "社会文明${}与科技发展${}是可以兼顾的", R.mipmap.robot, R.mipmap.arbre);
    }
}
