package com.engineer4myanmar.embeddedmap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		showMap2("My House","Pyin Oo Lwin","22.055673","96.510153");
	}

	public void showMap2(String name, String address, String lat, String lng)
    {    	
        String url ="http://mmgreenhackers.com/esdb/map2.php?name="
+name+"&address="+address+"&lat="+lat+"&lng="+lng;
        
          WebView wv1=(WebView)findViewById(R.id.webView1);
          wv1.setWebViewClient(new MyBrowser());    
          wv1.getSettings().setLoadsImagesAutomatically(true);
          wv1.getSettings().setJavaScriptEnabled(true);
          wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
          wv1.loadUrl(url);
    }
	 private class MyBrowser extends WebViewClient {
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	           view.loadUrl(url);
	           return true;
	        }
	    }
}
