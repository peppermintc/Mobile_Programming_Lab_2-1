package org.androidtown.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name;  //edittext와 button 선언
    EditText Age;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.editText1);    //레퍼런스
        Age = findViewById(R.id.editText2);
        button1 = findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {    //버튼 온클릭 동작 이름과 나이를 받아 string에 저장
                String name_toast = Name.getText().toString();
                String age_toast = Age.getText().toString();

                Intent intent=new Intent(MainActivity.this,NewActivity.class);  //인텐트 선언 String들을 send
                intent.putExtra("loginName", name_toast);
                intent.putExtra("loginAge", age_toast);
                startActivity(intent);  //NewActivity start
            }
        });

    }

}
