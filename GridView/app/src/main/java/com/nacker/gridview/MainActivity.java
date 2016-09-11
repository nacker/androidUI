package com.nacker.gridview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private String[] names = {"QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
            "QQ","微信",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new MyAdapter(this));

        // 增加点击事件
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,names[position],Toast.LENGTH_SHORT).show();
            }
        }) ;
    }

    private class MyAdapter extends BaseAdapter{

        private int[] images = {R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
        };

        private Context context;
        public MyAdapter (Context context){
            this.context = context;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
//            ImageView iv = new ImageView(context);
//            iv.setImageResource(images[position]);
//            return iv;

            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.itemview,null);
            ImageView iv = (ImageView) view.findViewById(R.id.imageView);
            TextView tv = (TextView) view.findViewById(R.id.textView);

            iv.setImageResource(images[position]);
            tv.setText(names[position]);
            return view;
        }
    }
}
