package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

public class TypeActivity extends AppCompatActivity {

    WebView tours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        //        setup the color of action bar to match the page's background
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#845ee8")));
        tours = findViewById(R.id.toursType);
        tours.setBackgroundColor(Color.TRANSPARENT);
        tours.loadUrl("https://www.responsibletravel.com/types/");

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
