package com.example.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_text = (EditText)findViewById(R.id.text1);


    }
    public void web(View view)
    {   String str = send_text.getText().toString();
        Intent myIntent = new Intent( this, DashBoard.class);
        myIntent.putExtra("extra", str);

        // start the Intent
        startActivity(myIntent);



    }

}

