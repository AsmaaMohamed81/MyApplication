package com.masader.masader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        WebView webview = (WebView)findViewById(R.id.webview1);

        webview.loadUrl("file:///android_asset/7/1.html");
    }
}
