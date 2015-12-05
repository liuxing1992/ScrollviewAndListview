package com.ly.liu_yao.scrollviewandlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by liu_yao on 15/8/27.
 */
public class NoScrollViewList extends ListView {


    public NoScrollViewList(Context context) {
        super(context);
    }

    public NoScrollViewList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollViewList(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
