package com.example.ad37_nguyenngocdung_day4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContactHistory;
    List<ContactHistory> contactHistory;
    AdapterContact adapterContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Contact Histories");

        lvContactHistory = findViewById(R.id.lvContactHistory);
        contactHistory = new ArrayList<>();

        contactHistory.add(new ContactHistory("0904149378","Viet Nam","21/9/2019","incomingCall",""));
        contactHistory.add(new ContactHistory("0979756897","Viet Nam","21/9/2019","outgoingCall","Sister"));
        contactHistory.add(new ContactHistory("0987654311","Viet Nam","20/9/2019","incomingCall","Dad"));
        contactHistory.add(new ContactHistory("0127889150","Viet Nam","19/9/2019","incomingCall",""));
        contactHistory.add(new ContactHistory("0123456789","Viet Nam","19/9/2019","missedCall","Mommy"));
        contactHistory.add(new ContactHistory("0912123768","Viet Nam","18/9/2019","outgoingCall",""));

        AdapterContact adapterContact = new AdapterContact(contactHistory);
        lvContactHistory.setAdapter(adapterContact);

        lvContactHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getBaseContext(),"Phone number: " + contactHistory.get(i).getNumber(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(), InfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
