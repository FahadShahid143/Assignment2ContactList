package com.example.fahadshahid.assignment2contactlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fahadshahid.assignment2contactlist.adapters.ContactAdapter;
import com.example.fahadshahid.assignment2contactlist.models.Contact;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ArrayList<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;
    Gson gson;
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*recyclerView = (RecyclerView) findViewById(R.id.list1);

        contactAdapter = new ContactAdapter(this,contactList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(contactAdapter);

        *//*recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Contact contact = contactList.get(position);
                gson = new Gson();
                String str =gson.toJson(contact);

                Intent intent = new Intent(MainActivity.this,ContactDetails.class);
                intent.putExtra("MyObjectString",str);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), movie.getName().toString() + movie.getId().toString()+ " is selected!", Toast.LENGTH_SHORT).show();



        })); }




        prepareContactData();



    }

    private void prepareContactData() {

        for (int i = 0; i < 1000; i++) {
            contactList.add(new Contact(i + 1, "Fahad"+i, "1234" + i, "Male"));

            contactAdapter.notifyDataSetChanged();
        }
*/    }

}
