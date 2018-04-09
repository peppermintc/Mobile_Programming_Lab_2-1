package org.androidtown.lab2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent passedIntent = getIntent();  //인텐트 선언 연결됨
        if(passedIntent!=null) {    //인텐트로 받은 값이 없는것이 아니라면 스트링 전달,저장
            String loginName = passedIntent.getStringExtra("loginName");
            String loginAge = passedIntent.getStringExtra("loginAge");

            Toast.makeText(NewActivity.this, "Student info : "+loginName+", "+loginAge,
                    Toast.LENGTH_LONG).show();  //토스트메시지 출력
        }

        Button button0 = findViewById(R.id.cancel_btn); //레퍼런스

        button0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {    //버튼클릭동장 액티비티 끝내기

                finish();
            }
        });
    }
}
