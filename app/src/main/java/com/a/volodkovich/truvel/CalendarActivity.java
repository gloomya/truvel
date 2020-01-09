package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
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
                Intent destinaionPage = new Intent(getApplicationContext(), DestinationActivity.class);
                startActivity(destinaionPage);
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
    public void january(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "January");
        startActivity(datesPage);
    }
    public void february(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "February");
        startActivity(datesPage);
    }
    public void march(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "March");
        startActivity(datesPage);
    }
    public void april(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "April");
        startActivity(datesPage);
    }
    public void may(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "May");
        startActivity(datesPage);
    }
    public void june(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "June");
        startActivity(datesPage);
    }
    public void july(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "July");
        startActivity(datesPage);
    }
    public void august(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "August");
        startActivity(datesPage);
    }
    public void september(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "September");
        startActivity(datesPage);
    }
    public void october(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "October");
        startActivity(datesPage);
    }
    public void november(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "November");
        startActivity(datesPage);
    }
    public void december(View v) {
        Intent datesPage = new Intent(getApplicationContext(), DateActivity.class);
        datesPage.putExtra("keyMonth", "December");
        startActivity(datesPage);
    }
}
