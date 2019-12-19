package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class NewalbumActivity extends AppCompatActivity {


    private ProgressBar progressBar;
    private WebView webview;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newalbum);


    }
}
