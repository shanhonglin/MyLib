package com.example.mylibrary.common;

import android.os.CountDownTimer;
import android.widget.Button;

public class MyCountDownTimer extends CountDownTimer {

    private Button button;
    private int i;
    private int i2;

    public MyCountDownTimer(Button button, long millisInFuture, long countDownInterval,int i,int i2) {
        super(millisInFuture, countDownInterval);
        this.button = button;
        this.i = i;
        this.i2 = i2;
    }

    //计时过程
    @Override
    public void onTick(long l) { //防止计时过程中重复点击
        button.setClickable(false);
        button.setBackgroundResource(i);
        button.setText(l / 1000 + "秒");
    }

    //计时完毕的方法
    @Override
    public void onFinish() {
        //重新给Button设置文字
        button.setText("重新获取");
        //设置可点击
        button.setClickable(true);
        button.setBackgroundResource(i2);
    }
}
