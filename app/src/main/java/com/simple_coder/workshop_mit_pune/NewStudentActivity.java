package com.simple_coder.workshop_mit_pune;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.simple_coder.workshop_mit_pune.databinding.ActivityNewStudentBinding;

public class NewStudentActivity extends AppCompatActivity // we can also extend as Activity
{
    ActivityNewStudentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_new_student);

//        EditText edtAge=findViewById(R.id.edtAge);
//        binding.edtAge
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG" ,"OnClick: ");


            }
        });


    }
}
