package com.agrisave.agrim8iot;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;


public class MoistureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisture);
        WebView mywebview = (WebView) findViewById(R.id.webView);
        mywebview.loadUrl("https://app.ubidots.com/ubi/getchart/CIoRzQgcwV1jAn6MFzuLhW_UtR8");

        /*String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */

        //mywebview.loadUrl("file:///android_asset/myresource.html");
    }
}


