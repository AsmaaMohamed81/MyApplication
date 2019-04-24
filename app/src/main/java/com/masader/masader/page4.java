package com.masader.masader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        WebView webview = (WebView)findViewById(R.id.webview2);
        webview.loadUrl("file:///android_asset/7/2.html");
    }
}
