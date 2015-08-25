package com.example.restoran;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buy extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		Button orderBtn = (Button) findViewById(R.id.order) ;
		orderBtn.setOnClickListener(new View.OnClickListener() 
    	{
			
    		@Override
			public void onClick(View v) 
			{
			
			yakin();
			}

			
    	});
		
	}
	private void yakin() {
		// TODO Auto-generated method stub
		AlertDialog.Builder bebek = new AlertDialog.Builder(this);
		bebek.setMessage("Are You Sure Want To Order?")
			.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					Intent intent = new Intent(Buy.this, Finish.class);
            		startActivity(intent);
				}
			})
			.setNegativeButton("No",new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int arg1) {
							dialog.cancel();
						}
			}).show();
	}
}
