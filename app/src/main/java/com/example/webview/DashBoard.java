package com.example.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class DashBoard extends AppCompatActivity {
    TextView receiver_msg;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        class JsObject {
            @JavascriptInterface
            public String toString() { return "injectedObject"; }
        }     setContentView(R.layout.activity_dash_board);
         webview = (WebView) findViewById(R.id.web);

        //receiver_msg = (TextView)findViewById(R.id.received_value_id);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());
        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("extra");
        Log.d(str,"cool");
        webview.loadData(str,"text/html","UTF-8");
        //String var1 = str.replaceAll("\\<[^>]*>","");

        //webview.loadData(str, "text/html", null);
        //webview.loadUrl("javascript:alert(injectedObject.toString())");

        //String url="https://negativewives.blogspot.com";

        //webview.loadUrl("http://hellobbc.com");

        //webview.loadUrl(url);

        // display the string into textView
        //receiver_msg.setText(str);
    }
}
