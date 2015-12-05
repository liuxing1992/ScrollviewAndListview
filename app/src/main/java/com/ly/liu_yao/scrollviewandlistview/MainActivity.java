package com.ly.liu_yao.scrollviewandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ScrollView mScrollView;

    private NoScrollViewList listview;

    private List<String> list;

    private String[] s={
            "哈防晒撒很多话很多束缚华盛顿哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑警方很快ID合适大家粉红色雕塑",
            "哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑"
            ,"哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑"
            ,"哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑","" +
            "哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑哈防晒撒很多话很多束缚华盛顿警方很快ID合适大家粉红色雕塑"};

    private  Myadapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= Arrays.asList(s);

        listview= (NoScrollViewList) this.findViewById(R.id.list);

        myadapter=new Myadapter();
        listview.setAdapter(myadapter);
    }


    private  class  Myadapter extends BaseAdapter{


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            ViewHolder holder=null;
            if (view==null){
                holder=new ViewHolder();
                view= LayoutInflater.from(MainActivity.this).inflate(R.layout.layout,viewGroup,false);

                holder.mTextView= (TextView) view.findViewById(R.id.text);
                view.setTag(holder);

            }else {
                holder= (ViewHolder) view.getTag();

            }


            holder.mTextView.setText(list.get(i));
            return view;
        }

        class  ViewHolder {

            private TextView mTextView;
        }
    }

}
