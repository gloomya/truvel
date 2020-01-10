package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {

    TextView listTitle;
    ImageView image;
    WebView tours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        //        setup the color of action bar to match the page's background
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#845ee8")));
        listTitle = findViewById(R.id.listName);
        image = findViewById(R.id.countryImg);
        tours = findViewById(R.id.toursList);
        tours.setBackgroundColor(Color.TRANSPARENT);


        String country = getIntent().getExtras().getString("keyCountry");

        switch(country) {
            case "Africa":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.africa);
                tours.loadUrl("https://www.responsibletravel.com/holidays/africa-middle-east-holidays");
                break;
            case "Asia":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.asia);
                tours.loadUrl("https://www.responsibletravel.com/holidays/asia-holidays");
                break;
            case "Australia":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.australia);
                tours.loadUrl("https://www.responsibletravel.com/holidays/australia");
                break;
            case "Caribbean":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.carribian);
                tours.loadUrl("https://www.responsibletravel.com/holidays/caribbean-holidays");
                break;
            case "Central America":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.central_america);
                tours.loadUrl("https://www.responsibletravel.com/holidays/central-america-holidays");
                break;
            case "Europe":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.europe);
                tours.loadUrl("https://www.responsibletravel.com/holidays/europe-holidays");
                break;
            case "Middle East":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.middle_east);
                tours.loadUrl("https://www.responsibletravel.com/holidays/middle-east-holidays");
                break;
            case "North America":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.north_america);
                tours.loadUrl("https://www.responsibletravel.com/holidays/north-america-holidays");
                break;
            case "South America":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.south_america);
                tours.loadUrl("https://www.responsibletravel.com/holidays/south-america-holidays");
                break;
            case "United Kingdom":
                listTitle.setText("All destinations in " + country);
                image.setImageResource(R.drawable.uk);
                tours.loadUrl("https://www.responsibletravel.com/holidays/uk-holidays");
                break;
        }

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
