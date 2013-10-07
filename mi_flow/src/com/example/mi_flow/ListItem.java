package com.example.mi_flow;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListItem extends TextView
{

	public ListItem(Context context) {
		super(context);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT, 1);
		params.setMargins(context.getResources().getDimensionPixelOffset(R.dimen.activity_horizontal_margin), context.getResources().getDimensionPixelOffset(R.dimen.activity_vertical_margin), context.getResources().getDimensionPixelOffset(R.dimen.activity_horizontal_margin), context.getResources().getDimensionPixelOffset(R.dimen.activity_vertical_margin));
		
		setLayoutParams(params);
				setTextColor(context.getResources().getColor(R.color.title_colour));
				setTextSize(20);
	}
	

}
