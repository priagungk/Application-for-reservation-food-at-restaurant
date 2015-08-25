package com.example.restoran;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Finish extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finish);
		
ImageButton logoutbtn = (ImageButton) findViewById(R.id.home) ;
    	   	
    	
    	logoutbtn.setOnClickListener(new View.OnClickListener() 
    	{
    		
    		@Override
    		public void onClick(View v) 
    		{
    		
    		Intent intent = new Intent(v.getContext(),Main.class);
    		startActivityForResult(intent,0);

     
    		}
    	});
	}
}
