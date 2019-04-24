package com.masaderk.masader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        WebView webview = (WebView)findViewById(R.id.webview);
        Intent reciever =getIntent();
        int i= reciever.getIntExtra("position1",3);
        int n= reciever.getIntExtra("position2",3);

        webview.loadUrl("file:///android_asset/"+i+"/"+n+".html");

    }
}
