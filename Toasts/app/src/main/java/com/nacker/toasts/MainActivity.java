package com.nacker.toasts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 绑定布局文件
        setContentView(R.layout.activity_main);
    }


    /**
     * 按钮的单击事件方法
     * 写法:public void 方法名 (View v){}
     * @param v
     */
    public void viewText (View v){
        // getApplicationContext() 应用程序上下文,作用域为整个程序
        // this:当前对象 (当前界面的上下文)
        Toast.makeText(getApplicationContext(), "今天的饭很好吃",Toast.LENGTH_LONG).show();

    }


    /**
     * 显示文本
     * @param v
     */
    public void viewImage(View v){
        Toast t = new Toast(this);
        // 用于显示图片的组件
        ImageView imageView = new ImageView(this);
        // 设置图片
        imageView.setImageResource(R.drawable.coinpin);

        t.setView(imageView);
        t.setDuration(Toast.LENGTH_LONG);
        // 设置现实的位置
        t.setGravity(Gravity.TOP,0,0);
        t.show();
    }


    /**
     * @param v
     */
    public void viewImageText(View v){
        Toast t = new Toast(this);
        TextView textView = new TextView(this);
        textView.setText("我喜欢妹子");
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.coinpin);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.addView(imageView);
        layout.addView(textView);

        t.setView(layout);
        t.setGravity(Gravity.CENTER,0,0);
        t.setDuration(Toast.LENGTH_LONG);

        t.show();
    }
}
