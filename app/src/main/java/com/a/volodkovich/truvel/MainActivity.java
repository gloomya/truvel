package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation fadeanim, slideleft, slideright;
    ImageView logo;
    TextView name, desc, motto;
    View divider;
    ImageButton go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        name = findViewById(R.id.appName);
        desc = findViewById(R.id.appDesc);
        motto = findViewById(R.id.appMotto);
        divider = findViewById(R.id.divider);

        logo = findViewById(R.id.logoImg);
        go = findViewById(R.id.goBtn);


        slideleft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        slideleft.reset();
        logo.clearAnimation();
        logo.startAnimation(slideleft);
        name.clearAnimation();
        name.startAnimation(slideleft);
        desc.clearAnimation();
        desc.startAnimation(slideleft);

        slideright = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        slideright.reset();
        motto.clearAnimation();
        motto.startAnimation(slideright);
        divider.clearAnimation();
        divider.startAnimation(slideright);

        fadeanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        fadeanim.reset();
        go.clearAnimation();
        go.startAnimation(fadeanim);

    }

    public void choice(View v) {
        Intent choice = new Intent(getApplicationContext(), ChoiceActivity.class);
        startActivity(choice);
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
