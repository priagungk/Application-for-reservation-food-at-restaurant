package com.example.restoran;

import com.example.restoran.R;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;



public class Profile extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
        Button regBtn = (Button) findViewById(R.id.save) ;
		regBtn.setOnClickListener(new View.OnClickListener() 
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