package edu.cnm.deepdive.roomrecyclertutorial;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {

  EditText firstName;
  EditText lastName;
  EditText email;
  Button button;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.create_user);

    firstName = findViewById(R.id.first_name);
    lastName = findViewById(R.id.last_name);
    email = findViewById(R.id.email);
    button = findViewById(R.id.button);

    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {

        Log.d(MainActivity.TAG, "onClick: firstName: "+ firstName.getText().toString());
      }
    });

    }

  }
