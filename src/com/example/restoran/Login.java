package com.example.restoran;

import com.example.restoran.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Login extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        final EditText txtUserName = (EditText)this.findViewById(R.id.username);
        EditText txtPassword = (EditText)this.findViewById(R.id.password);
        Button btnLogin = (Button)this.findViewById(R.id.order);
        btnLogin=(Button)this.findViewById(R.id.order);
        btnLogin.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub

if((txtUserName.getText().toString()).equals("meja1")){
        Toast.makeText(Login.this, "Login Successful",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(v.getContext(),Main.class);
		startActivityForResult(intent,0);
       } else{
        Toast.makeText(Login.this, "Invalid Login",Toast.LENGTH_LONG).show();
       }

}
});    
        
        
        
        
        
        
        
       
		    }
}