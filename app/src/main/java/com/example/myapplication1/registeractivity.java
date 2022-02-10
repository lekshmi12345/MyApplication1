package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registeractivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1;
    String getname,getaddress,getphno,getmail,getuser,getpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);
       ed1=(EditText) findViewById(R.id.name);
       ed2=(EditText) findViewById(R.id.address);
       ed3=(EditText) findViewById(R.id.phno);
       ed4=(EditText) findViewById(R.id.email);
       ed5=(EditText) findViewById(R.id.username);
       ed6=(EditText) findViewById(R.id.password);
       b1=(AppCompatButton) findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),getname, Toast.LENGTH_SHORT).show();
        getname=ed1.getText().toString();
        Toast.makeText(getApplicationContext(),getaddress, Toast.LENGTH_SHORT).show();
        getaddress=ed2.getText().toString();
        Toast.makeText(getApplicationContext(),getphno , Toast.LENGTH_SHORT).show();
        getphno=ed3.getText().toString();
        Toast.makeText(getApplicationContext(),getmail,Toast.LENGTH_SHORT).show();
        getmail=ed4.getText().toString();
        Toast.makeText(getApplicationContext(),getuser,Toast.LENGTH_SHORT).show();
        getuser=ed5.getText().toString();
        Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_SHORT).show();
        getpass=ed6.getText().toString();

    }
});
    }
}