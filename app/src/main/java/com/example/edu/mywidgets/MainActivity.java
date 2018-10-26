package com.example.edu.mywidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit_name, edit_age;
    Button btn_name, btn_age, btn_rs;
    TextView text_rs;
    RadioGroup radiogroup_gener, radiogroup_job;
    RadioButton selectedButton_jender;
    RadioButton selectedButton_job;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_name = (EditText)findViewById(R.id.edit_name);
        edit_age = (EditText)findViewById(R.id.edit_age);

        btn_name = (Button)findViewById(R.id.btn_name);
        btn_name.setOnClickListener(this);

        btn_age = (Button)findViewById(R.id.btn_age);
        btn_age.setOnClickListener(this);

        btn_rs = (Button)findViewById(R.id.btn_rs);
        btn_rs.setOnClickListener(this);

        text_rs = (TextView) findViewById(R.id.text_rs);

        radiogroup_gener = (RadioGroup)findViewById(R.id.radiogroup_gener) ;
        radiogroup_job = (RadioGroup)findViewById(R.id.radiogroup_job) ;

        selectedButton_jender = (RadioButton)findViewById(radiogroup_gener.getCheckedRadioButtonId());
        selectedButton_job = (RadioButton)findViewById(radiogroup_job.getCheckedRadioButtonId());
    }

    @Override
    public void onClick(View v) {


        String gender = selectedButton_jender.getText().toString();
        String job = selectedButton_job.getText().toString();

        String name = edit_name.getText().toString();
        String age = edit_age.getText().toString();

//        String txt_name = ((EditText)v).getText().toString();
//        만약 btn_name 이면 edit_name의((EditText)v).getText().toString(); 을 가지고 와서 text_rs의 text_rs.setText(text);
//        만약 btn_age 이면 edit_age의((EditText)v).getText().toString(); 을 가지고 와서 text_rs의 text_rs.setText(text);
        if(v.getId() == R.id.btn_name){
//            Toast.makeText(v.getContext(),text_name, Toast.LENGTH_SHORT).show();
            text_rs.setText(name);
        }
        if(v.getId() == R.id.btn_age){
//            Toast.makeText(v.getContext(),text_name, Toast.LENGTH_SHORT).show();
            text_rs.setText(age);
        }
        if(v.getId() == R.id.btn_rs){
//            Toast.makeText(v.getContext(),text_name, Toast.LENGTH_SHORT).show();
            text_rs.setText("이름 :"+name+"   나이 :"+age + "  성별:" + gender+ "  직업:"+job);
        }





//        만약 btn_rs 이면
//          edit_name의((Button)v).getText().toString();  edit_age의((EditText)v).getText().toString();
//          그리고 radiogroup_gener의 checked 되어 있는 radioButton의 checked true인 radioButton의 text를 가지고 와서 text_rs의 text_rs.setText(text);
//          그리고 radiogroup_job의 checked 되어 있는 radioButton의 checked true인 radioButton의 text를 가지고 와서 text_rs의 text_rs.setText(text);
    }
}
