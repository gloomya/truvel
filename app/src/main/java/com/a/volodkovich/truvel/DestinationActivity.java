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
import android.view.View;
import android.widget.TextView;

public class DestinationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //        setup the color of action bar to match the page's background
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#845ee8")));

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
    public void africa(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Africa");
        startActivity(countryPage);
    }
    public void asia(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Asia");
        startActivity(countryPage);
    }
    public void australia(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Australia");
        startActivity(countryPage);
    }
    public void caribbean(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Caribbean");
        startActivity(countryPage);
    }
    public void central(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Central America");
        startActivity(countryPage);
    }
    public void europe(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Europe");
        startActivity(countryPage);
    }
    public void east(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "Middle East");
        startActivity(countryPage);
    }
    public void north(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "North America");
        startActivity(countryPage);
    }
    public void south(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "South America");
        startActivity(countryPage);
    }
    public void uk(View v) {
        Intent countryPage = new Intent(getApplicationContext(), CountryActivity.class);
        countryPage.putExtra("keyCountry", "United Kingdom");
        startActivity(countryPage);
    }
}
