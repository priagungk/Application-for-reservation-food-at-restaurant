package com.example.restoran;

import com.example.restoran.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class Register extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        
        Button regBtn = (Button) findViewById(R.id.save) ;
		regBtn.setOnClickListener(new View.OnClickListener() 
    	{
			
    		@Override
			public void onClick(View v) 
			{
    			  Intent intent = new Intent(v.getContext(),Login.class);
    				startActivityForResult(intent,0);
			}

			
    	});
		    }
}