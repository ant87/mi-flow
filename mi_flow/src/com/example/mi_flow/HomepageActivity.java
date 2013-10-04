package com.example.mi_flow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class HomepageActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		
		View hist =  findViewById(R.id.imageView1);
		hist.setClickable(true);
		View hist1 =  findViewById(R.id.textView2);
		View hist2 =  findViewById(R.id.button_history);
		hist1.setClickable(true);
		hist2.setClickable(true);
		hist.setOnClickListener(this);
		
		
		
		hist1.setOnClickListener(this);
		hist2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homepage, menu);
		return true;
	}

	
	
	@Override
	public void onClick(View v) 
	{
		
		startActivity(new Intent(this,HistoryActivity.class));// TODO Auto-generated method stub
		
	}

}
