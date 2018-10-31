package kr.co.woobi.imyeon.tinydb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReferenceInputActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName, editTextPass, editTextEmail;
    Button buttonSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_input);
        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextPass=(EditText)findViewById(R.id.editTextPass);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);

        SharedPreferences sharedPreferences=
                getSharedPreferences("newxmlfile", Context.MODE_PRIVATE);
            String name=sharedPreferences.getString("name", null);
            String pass=sharedPreferences.getString("pass", null);

            String email=sharedPreferences.getString("email", null);
            editTextName.setText(name);
            editTextPass.setText(pass);
            editTextEmail.setText(email);


        buttonSave=(Button)findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name, pass, email;
        name=editTextName.getText().toString();
        pass=editTextPass.getText().toString();
        email=editTextEmail.getText().toString();

        SharedPreferences.Editor editor=
                getSharedPreferences("newxmlfile", Context.MODE_PRIVATE).edit();
        editor.putString("name",name );
        editor.putString("pass",pass );
        editor.putString("email",email );
        editor.commit();

        super.finish();
    }
}
