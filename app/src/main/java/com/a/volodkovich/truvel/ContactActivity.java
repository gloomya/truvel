package com.a.volodkovich.truvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {
    EditText usrName, usrEmail, usrMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        usrName = findViewById(R.id.inputName);
        usrEmail = findViewById(R.id.inputEmail);
        usrMsg = findViewById(R.id.inputMsg);

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
    public void send(View v) {
        String username = String.valueOf(usrName.getText());
        String usermail = String.valueOf(usrEmail.getText());
        String usermessage = String.valueOf(usrMsg.getText());

        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("message/rfc822");

        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"support@truvel.com"});
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Message from " + username);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "\nThey say: " + usermessage + "\nTheir email address: " + usermail);

        try{
            startActivity(Intent.createChooser(sendIntent, "Send email..."));
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this,"Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }

    public void call(View v) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:16479375557"));
        startActivity(callIntent);
    }
    public void map(View v) {
        Uri gmmIntentUri = Uri.parse("geo:43.6721,-79.3762");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if(mapIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(mapIntent);
        }
    }
}
