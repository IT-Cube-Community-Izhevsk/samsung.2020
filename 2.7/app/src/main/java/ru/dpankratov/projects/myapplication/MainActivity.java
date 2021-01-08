package ru.dpankratov.projects.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public final static String USER_NAME = "ru.dpankratov.projects.myapplication.MainActivity.USER_NAME";
    public final static String USER_SECOND_NAME = "ru.dpankratov.projects.myapplication.MainActivity.USER_SECOND_NAME";

    private final static int RESULT_FROM_SECOND_ACTIVITY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        //Получить данные с текущей активнсти
        EditText userNameEditText = (EditText) findViewById(R.id.editText);
        EditText userSecondEditText = (EditText) findViewById(R.id.editText2);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(USER_NAME, userNameEditText.getText().toString());
        intent.putExtra(USER_SECOND_NAME, userSecondEditText.getText().toString());
        startActivityForResult(intent, RESULT_FROM_SECOND_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_FROM_SECOND_ACTIVITY){
            TextView textView2 = (TextView) findViewById(R.id.textView2);
            if (resultCode == RESULT_OK) {
                String personNameFromSecondActivity = data.getStringExtra(SecondActivity.SECOND_ACTIVITY_RESULT);
                textView2.setText(personNameFromSecondActivity);
            }else{
                textView2.setText("");
            }
        }
    }
}