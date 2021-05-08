package com.example.webviews;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient()); //saying android that we wants the web to open on app

        webView.loadUrl("https://mbesednik.github.io/Izrada-eCommerce-website/index.html"); //check my friends github profile for more:https://github.com/MBesednik

        // webView.loadData("<html><body><h2>Ja sam Marko</h2></body></htmlY", "text/html", "UTF-8");

    }
}