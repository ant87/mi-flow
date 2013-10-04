package com.example.mi_flow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;


public class ButtonLayout extends LinearLayout
{
	public ButtonLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

public ButtonLayout(Context context, AttributeSet attrs) {
	super(context, attrs);
	// TODO Auto-generated constructor stub
}

public ButtonLayout(Context context) {
	super(context);
	// TODO Auto-generated constructor stub
}



    public boolean onInterceptTouchEvent(MotionEvent ev) {
    	// TODO Auto-generated method stub
    	return true;
    }
}
