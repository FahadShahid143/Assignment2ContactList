package com.example.fahadshahid.assignment2contactlist.adapters;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fahadshahid.assignment2contactlist.ContactDetails;
import com.example.fahadshahid.assignment2contactlist.R;
import com.example.fahadshahid.assignment2contactlist.models.Contact;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fahad Shahid on 10/15/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {

    private ArrayList<Contact> contactlist;
    //ImageButton btn;
    RecyclerView recyclerView;
    Activity context;
    Gson gson;
    ImageView img;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        public ImageButton btn;


        public MyViewHolder(View view) {
        super(view);
        tvName = (TextView) view.findViewById(R.id.tvName);
        btn = (ImageButton) view.findViewById(R.id.ibDelete);
        img = (ImageView) view.findViewById(R.id.image);


        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactlist.remove(getAdapterPosition());
                Toast.makeText(view.getContext(), "Contact is deleted", Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();
            }
        });*/
        /*recyclerView = (RecyclerView) context.findViewById(R.id.list1);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(context, recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Contact movie = contactlist.get(position);
                gson = new Gson();
                String str =gson.toJson(movie);

                Intent intent = new Intent(context,ContactDetails.class);
                intent.putExtra("MyObjectString",str);
                context.startActivity(intent);
                //Toast.makeText(getApplicationContext(), movie.getName().toString() + movie.getId().toString()+ " is selected!", Toast.LENGTH_SHORT).show();
            }
        }));*/
    }
}

    public ContactAdapter(Activity context,ArrayList<Contact> contactlist) {
        this.context=context;
        this.contactlist = contactlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item_list,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Contact contact = contactlist.get(position);
        holder.tvName.setText(contact.getName());
        //Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").resize(70,70).into(img);
        Picasso.with(context).load("http://dynamicinfluence.com/wp-content/uploads/2014/06/Robert-Circle-Profile-Pic.png").placeholder(R.drawable.contacticon).into(img);




        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*contactlist.remove(position);
                Toast.makeText(view.getContext(), "Contact is deleted", Toast.LENGTH_SHORT).show();
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, contactlist.size());
                holder.itemView.setVisibility(View.GONE);
                notifyDataSetChanged();*/
                contactlist.remove(position);
                Toast.makeText(view.getContext(), "Contact is deleted", Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();

            }
        });



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gson = new Gson();
                String str = gson.toJson(contactlist.get(position));
                Intent intent = new Intent(context,ContactDetails.class);
                intent.putExtra("Details",str);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactlist.size();
    }

}