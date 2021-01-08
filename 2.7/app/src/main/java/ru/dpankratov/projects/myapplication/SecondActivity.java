package ru.dpankratov.projects.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

    public static final String SECOND_ACTIVITY_RESULT = "second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String user_name=getIntent().getExtras().getString(MainActivity.USER_NAME);
        String user_second_name = getIntent().getExtras().getString(MainActivity.USER_SECOND_NAME);

        TextView infoTextView = (TextView) findViewById(R.id.textView4);
        infoTextView.setText(user_name + " " + user_second_name);
    }

    public void onClick(View view) {
        Intent answer = new Intent();
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        answer.putExtra(SECOND_ACTIVITY_RESULT, editTextTextPersonName.getText().toString());
        setResult(RESULT_OK, answer);
        finish();
    }
}