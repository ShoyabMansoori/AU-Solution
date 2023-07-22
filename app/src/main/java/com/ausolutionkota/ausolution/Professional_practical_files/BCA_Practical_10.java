package com.ausolutionkota.ausolution.Professional_practical_files;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class BCA_Practical_10 extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // visual programming(projrct file)
        setContentView(R.layout.practicalfile_all_in_one);
        //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webview=findViewById(R.id.webview);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.getSettings().setSupportZoom(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setDisplayZoomControls(false);

        webview.setWebViewClient(new BCA_Practical_10.callback());
        webview.loadUrl("https://files4ausolution.blogspot.com/p/bca-1st-year-c-language.html");
    }
    private class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
  }
}