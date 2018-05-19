package com.example.lubuntupc.recipefinderapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_show_link.*

class ShowLinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_link)

        var extras = intent.extras

        if (extras != null) {
            var link = extras.get("link")
            //aby webview otwieral link w webview a nie zewn przegladarce
            webViewId.setWebViewClient(WebViewClient())
            //url
            webViewId.loadUrl(link.toString())
        }
    }
}
