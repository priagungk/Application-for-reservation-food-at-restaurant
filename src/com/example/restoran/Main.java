package com.example.restoran;

import com.example.restoran.R;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.widget.ToggleButton;

public class Main extends TabActivity  {

    private static final Context Restaurant = null;
	Button doSomething;
    TabHost tabHost;
    ViewFlipper vf;
    ViewFlipper vf2;
    float oldTouchValue;
    ToggleButton bp, oc, ro,bm,ppy,mix,honey;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);
        
        Button buybtn = (Button) findViewById(R.id.buyBtn) ;
    	   	
    	
    	buybtn.setOnClickListener(new View.OnClickListener() 
    	{
    		
    		@Override
    		public void onClick(View v) 
    		{
    		
    		Intent intent = new Intent(v.getContext(),Buy.class);
    		startActivityForResult(intent,0);

     
    		}
    	});
ImageButton logoutbtn = (ImageButton) findViewById(R.id.logout) ;
    	   	
    	
    	logoutbtn.setOnClickListener(new View.OnClickListener() 
    	{
    		
    		@Override
    		public void onClick(View v) 
    		{
    		
    			yakin();

     
    		}
    	});
        bp = (ToggleButton) findViewById(R.id.blackpapper);
        bp.setOnClickListener(new View.OnClickListener() {
                    
                     @Override
                     public void onClick(View arg0) {
                    	 if (bp.isChecked()) {
                    		 AlertDialog.Builder alert = new AlertDialog.Builder(context);
                         alert.setTitle("Order"); //Set Alert dialog title here
                         alert.setMessage("Enter Number of Orders : "); //Message here
              
                         // Set an EditText view to get user input
                         final EditText input = new EditText(context);
                         alert.setView(input);
              
                         alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int whichButton) {
                          //You will get as string input data in this variable.
                          // here we convert the input to a string and show in a toast.
                          String srt = input.getEditableText().toString();
                          Toast.makeText(context,srt,Toast.LENGTH_LONG).show();                
                         } // End of onClick(DialogInterface dialog, int whichButton)
                     }); //End of alert.setPositiveButton
                         alert.show();
                    	 } else {
                             tampilpesan("Anda batal memesan Black Papper");
                      }
                     }
              });
        
        oc = (ToggleButton) findViewById(R.id.orientalchicken);
        oc.setOnClickListener(new View.OnClickListener() {
                    
                     @Override
                     public void onClick(View arg0) {
                           // TODO Auto-generated method stub
                    	 if (oc.isChecked()) {AlertDialog.Builder alert = new AlertDialog.Builder(context);
                         alert.setTitle("Order"); //Set Alert dialog title here
                         alert.setMessage("Enter Number of Orders : "); //Message here
              
                         // Set an EditText view to get user input
                         final EditText input = new EditText(context);
                         alert.setView(input);
              
                         alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int whichButton) {
                          //You will get as string input data in this variable.
                          // here we convert the input to a string and show in a toast.
                          String srt = input.getEditableText().toString();
                          Toast.makeText(context,srt,Toast.LENGTH_LONG).show();                
                         } // End of onClick(DialogInterface dialog, int whichButton)
                     }); //End of alert.setPositiveButton
                         alert.show();
                    	 } else {
                             tampilpesan("Anda batal memesan Oriental Chicken");
                      }
                          
                     }
              });
        ppy = (ToggleButton) findViewById(R.id.papayajuice);
        ppy.setOnClickListener(new View.OnClickListener() {
                    
                     @Override
                     public void onClick(View arg0) {
                           // TODO Auto-generated method stub
                    	 if (ppy.isChecked()) {AlertDialog.Builder alert = new AlertDialog.Builder(context);
                         alert.setTitle("Order"); //Set Alert dialog title here
                         alert.setMessage("Enter Number of Orders : "); //Message here
              
                         // Set an EditText view to get user input
                         final EditText input = new EditText(context);
                         alert.setView(input);
              
                         alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int whichButton) {
                          //You will get as string input data in this variable.
                          // here we convert the input to a string and show in a toast.
                          String srt = input.getEditableText().toString();
                          Toast.makeText(context,srt,Toast.LENGTH_LONG).show();                
                         } // End of onClick(DialogInterface dialog, int whichButton)
                     }); //End of alert.setPositiveButton
                         alert.show();
                    	 } else {
                             tampilpesan("Anda batal memesan Papaya Juice");
                      }
                          
                     }
              });
        mix = (ToggleButton) findViewById(R.id.mixberry);
        mix.setOnClickListener(new View.OnClickListener() {
                    
                     @Override
                     public void onClick(View arg0) {
                           // TODO Auto-generated method stub
                    	 if (mix.isChecked()) {AlertDialog.Builder alert = new AlertDialog.Builder(context);
                         alert.setTitle("Order"); //Set Alert dialog title here
                         alert.setMessage("Enter Number of Orders : "); //Message here
              
                         // Set an EditText view to get user input
                         final EditText input = new EditText(context);
                         alert.setView(input);
              
                         alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int whichButton) {
                          //You will get as string input data in this variable.
                          // here we convert the input to a string and show in a toast.
                          String srt = input.getEditableText().toString();
                          Toast.makeText(context,srt,Toast.LENGTH_LONG).show();                
                         } // End of onClick(DialogInterface dialog, int whichButton)
                     }); //End of alert.setPositiveButton
                         
                         
                         alert.show();
                    	 } else {
                             tampilpesan("Anda batal memesan Mix Berry");
                      }
                          
                     }
              });
    
        
        vf = (ViewFlipper) findViewById(R.id.viewFlipper1);
        vf2 = (ViewFlipper) findViewById(R.id.viewFlipper2);
        tabHost = getTabHost();
        tabHost.addTab(tabHost
        		.newTabSpec("tab1")
        		.setIndicator("Food")
        		.setContent(R.id.viewFlipper1));
        tabHost.addTab(tabHost
        		.newTabSpec("tab2")
        		.setIndicator("Drink & Dessert")
        		.setContent(R.id.viewFlipper2));

        tabHost.setCurrentTab(0);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
     
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Restaurant:
            	
    			Intent intent = new Intent(this,Restaurant.class);
                		startActivity(intent);
				
                                
                return true;
            case R.id.History:
          
            	
    			Intent intent1 = new Intent(this,History.class);
                		startActivity(intent1);
				
                return true;
             
            default:
            	
    			Intent intent11 = new Intent(this,Profile.class);
                		startActivity(intent11);
				
                return super.onOptionsItemSelected(item);
        }
    }
	@Override
	public boolean onTouchEvent(MotionEvent touchevent) {
		switch (touchevent.getAction()) {
		case MotionEvent.ACTION_DOWN: {
			oldTouchValue = touchevent.getX();
			break;
		}
		case MotionEvent.ACTION_UP: {
			// if(this.searchOk==false) return false;
			float currentX = touchevent.getX();
			if (oldTouchValue < currentX) {
				vf.setInAnimation(inFromLeftAnimation());
				vf.setOutAnimation(outToRightAnimation());
				vf.showNext();
				
				vf2.setInAnimation(inFromLeftAnimation());
				vf2.setOutAnimation(outToRightAnimation());
				vf2.showNext();
			}
			if (oldTouchValue > currentX) {
				vf.setInAnimation(inFromRightAnimation());
				vf.setOutAnimation(outToLeftAnimation());
				vf.showPrevious();
				
				vf2.setInAnimation(inFromRightAnimation());
				vf2.setOutAnimation(outToLeftAnimation());
				vf2.showPrevious();
			}
			break;
		
		}
		}
		return false;
	}
	
	// for the previous movement
	public static Animation inFromRightAnimation() {

		Animation inFromRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromRight.setDuration(350);
		inFromRight.setInterpolator(new AccelerateInterpolator());
		return inFromRight;
	}

	public static Animation outToLeftAnimation() {
		Animation outtoLeft = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoLeft.setDuration(350);
		outtoLeft.setInterpolator(new AccelerateInterpolator());
		return outtoLeft;
	}

	// for the next movement
	public static Animation inFromLeftAnimation() {
		Animation inFromLeft = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromLeft.setDuration(350);
		inFromLeft.setInterpolator(new AccelerateInterpolator());
		return inFromLeft;
	}

	public static Animation outToRightAnimation() {
		Animation outtoRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoRight.setDuration(350);
		outtoRight.setInterpolator(new AccelerateInterpolator());
		return outtoRight;
	}
	public void tampilpesan (String isipesan){ Toast.makeText(getBaseContext(), isipesan, Toast.LENGTH_SHORT).show();
	   
    }
	private void yakin() {
		// TODO Auto-generated method stub
		AlertDialog.Builder bebek = new AlertDialog.Builder(this);
		bebek.setMessage("Are You Sure Want To Logout?")
			.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					Intent intent = new Intent(Main.this, Login.class);
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


