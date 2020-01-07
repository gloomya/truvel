package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choice(View v) {
        Intent choice = new Intent(getApplicationContext(), ChoiceActivity.class);
        startActivity(choice);
    }
    public void destination(View v) {
        Intent destination = new Intent(getApplicationContext(), DestinationActivity.class);
        startActivity(destination);
    }
    public void vactype(View v) {
        Intent type = new Intent(getApplicationContext(), TypeActivity.class);
        startActivity(type);
    }
    public void calendar(View v) {
        Intent calendar = new Intent(getApplicationContext(), CalendarActivity.class);
        startActivity(calendar);
    }
    public void dates(View v) {
        Intent dates = new Intent(getApplicationContext(), DateActivity.class);
        startActivity(dates);
    }
    public void country(View v) {
        Intent country = new Intent(getApplicationContext(), CountryActivity.class);
        startActivity(country);
    }
    public void vacation(View v) {
        Intent vacation = new Intent(getApplicationContext(), VacationActivity.class);
        startActivity(vacation);
    }
    public void contact(View v) {
        Intent contact = new Intent(getApplicationContext(), ContactActivity.class);
        startActivity(contact);
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
}
