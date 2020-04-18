package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText password=null;
    private CheckBox check=null;
    private Button button=null;
    private EditText account=null;
    private EditText confirmPassword=null;
    /*
    private int countViews(ViewGroup root){
        int viewCount=0;
        if(null==root){
            return 0;
        }
        if(root instanceof ViewGroup){
            //viewCount++;
            for(int i=0;i<((ViewGroup)root).getChildCount();i++){
                View childView=((ViewGroup)root).getChildAt(i);
                if(childView instanceof ViewGroup){
                    viewCount+=countViews((ViewGroup) childView);
                }
                else{
                    viewCount++;
                }
            }
        }
        return viewCount;
    }
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.password=findViewById(R.id.password);
        this.confirmPassword=findViewById(R.id.confirmPassword);
        this.account=findViewById(R.id.account);
        this.check=findViewById(R.id.showPassword);

        this.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.isChecked()){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    confirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    confirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        this.button=findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check input null
                RadioGroup radioGroup=(RadioGroup)findViewById(R.id.gender);
                RadioButton radioButton=(RadioButton)findViewById((radioGroup.getCheckedRadioButtonId()));
                //String genderInfo=radioButton.getText().toString();
                if(radioButton==null|TextUtils.isEmpty(account.getText())|TextUtils.isEmpty(password.getText())|TextUtils.isEmpty(confirmPassword.getText())){
                    Toast.makeText(MainActivity.this,"未填写完表单内容,请检查",Toast.LENGTH_SHORT).show();
                    return;
                }
                //check password equality
                if(!password.getText().toString().equals(confirmPassword.getText().toString())){
                    Toast.makeText(MainActivity.this,"两次密码不一致,请检查",Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        Log.d("LifeCircle","--onCreate--");
        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_SHORT).show();

        /*ViewGroup Root=findViewById(R.id.RootView);
        int viewCount=countViews(Root);
        Log.d("ViewCount", String.valueOf(viewCount));*/
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCircle","--onStop--");
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCircle","--onDestroy--");
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LifeCircle","--onPause--");
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCircle","--onResume--");
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCircle","--onStart--");
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCircle","--onRestart--");
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d("LifeCircle","--onSaveInstanceState--");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("LifeCircle","--onRestoreInstanceState--");
}

}
