package com.example.mi_flow;


import android.app.Activity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class HistoryActivity extends Activity
{
	
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
		
		//listView = (ListView) findViewById(R.id.sportsList);
		String[] strs = this.getResources().getStringArray(R.array.sports_array);
		
		LinearLayout listLayout = (LinearLayout)findViewById(R.id.list_layout);
		
		
	
		
		for(String str : strs)
		{
			ListItem li = new ListItem(this);
			li.setText(str);
			
			listLayout.addView(li);
		}
		
		
		
		//listView.setAdapter(new ArrayAdapter<String>(this,R.layout.new_list_item,str));
       
    }
 
    /*
     * Parameters:
        adapter - The AdapterView where the click happened.
        view - The view within the AdapterView that was clicked
        position - The position of the view in the adapter.
        id - The row id of the item that was clicked.
     */
   

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homepage, menu);
		return true;
	}

}
