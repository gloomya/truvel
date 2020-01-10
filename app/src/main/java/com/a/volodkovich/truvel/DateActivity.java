package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

public class DateActivity extends AppCompatActivity {

    TextView monthName;
    WebView whereText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        String month = getIntent().getExtras().getString("keyMonth");

        monthName = findViewById(R.id.monthTitle);
        whereText = findViewById(R.id.whereText);
        whereText.setBackgroundColor(Color.TRANSPARENT);
        monthName.setText("Where to go on holiday in " + month);

        switch(month) {
            case "January":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-january");
                break;
            case "February":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-february");
                break;
            case "March":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-march");
                break;
            case "April":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-april");
                break;
            case "May":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-may");
                break;
            case "June":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-june");
                break;
            case "July":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-july");
                break;
            case "August":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-august");
                break;
            case "September":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-september");
                break;
            case "October":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-october");
                break;
            case "November":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-november");
                break;
            case "December":
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-in-december");
                break;
            default:
                whereText.loadUrl("https://www.responsibletravel.com/copy/where-to-go-on-holiday-month-by-month");
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
