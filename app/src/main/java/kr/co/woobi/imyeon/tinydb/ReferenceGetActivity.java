package kr.co.woobi.imyeon.tinydb;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReferenceGetActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewResult,textViewResult2,textViewResult3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_get);

        SharedPreferences sharedPreferences=
                getSharedPreferences("newxmlfile", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name", null);
        String pass=sharedPreferences.getString("pass", null);
        String email=sharedPreferences.getString("email", null);
        textViewResult=(TextView)findViewById(R.id.textViewResult);
        textViewResult2=(TextView)findViewById(R.id.textViewResult2);
        textViewResult3=(TextView)findViewById(R.id.textViewResult3);
        textViewResult.setText(name);
        textViewResult2.setText(pass);
        textViewResult3.setText(email);
        Button buttonGoToMain=(Button)findViewById(R.id.buttonGoToMain);
        buttonGoToMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
