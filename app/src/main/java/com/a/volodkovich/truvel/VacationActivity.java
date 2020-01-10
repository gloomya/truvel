package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VacationActivity extends AppCompatActivity {

    WebView tours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacation);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //        setup the color of action bar to match the page's background
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e8526c")));
//        String type = getIntent().getExtras().getString("keyType");
        tours = findViewById(R.id.toursType);
        tours.setBackgroundColor(Color.TRANSPARENT);

        //hide navbar on webpage

        tours.getSettings().setJavaScriptEnabled(true);

        tours.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                // hide element by class name
                tours.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('navbar').style.display='none'; })()");
//                hide element by id
//                tours.loadUrl("javascript:(function() { " +
//                        "document.getElementById('your_id').style.display='none';})()");

            }
        });

        tours.loadUrl("https://www.responsibletravel.com/types/");
//        switch(type) {
//            case "January":
//                tours.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-january");
//                break;
//        }

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.choice:
                Intent choicePage = new Intent(getApplicationContext(), ChoiceActivity.class);
                startActivity(choicePage);
                break;
            case R.id.dates:
                Intent datesPage = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(datesPage);
                break;
            case R.id.destination:
                Intent destinationPage = new Intent(getApplicationContext(), DestinationActivity.class);
                startActivity(destinationPage);
                break;
            case R.id.type:
                Intent typePage = new Intent(getApplicationContext(), TypeActivity.class);
                startActivity(typePage);
                break;
            case R.id.contact:
                Intent contactPage = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(contactPage);
                break;
        }
        return true;
    }
}
