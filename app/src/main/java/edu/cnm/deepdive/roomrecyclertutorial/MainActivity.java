package edu.cnm.deepdive.roomrecyclertutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  public static final String TAG = "MainActivity";


  RecyclerView recyclerView;
  RecyclerView.Adapter adapter;
  FloatingActionButton fab;
  ArrayList<String> users;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    recyclerView = findViewById(R.id.recycler_view);

    users = new ArrayList<>();

    for (int i = 0; i< 100; i++){
      users.add("Dan #" + i);
    }


    recyclerView.setLayoutManager(new LinearLayoutManager(this));
     adapter = new UserAdapter;
     recyclerView.setAdapter(adapter);

    fab = findViewById(R.id.fab);
    fab.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, CreateUser.class));

      }
    });
  }
}