package com.josephvanderzwart.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //declarations

    String test = "hi";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //methods


    public void go(View view){
        //button actions
        Intent intent = new Intent(this, GoActivity.class);
        intent.putExtra(test,test);  //include state information for current state of app?
        startActivity(intent);
    }

    public void plan(View view){
        //button actions
        Intent intent = new Intent(this, PlanActivity.class);
        intent.putExtra(test,test);  //include state information for current state of app?
        startActivity(intent);
    }
    public void progress(View view){
        //button actions
        Intent intent = new Intent(this, ProgressActivity.class);
        intent.putExtra(test,test);  //include state information for current state of app?
        startActivity(intent);
    }
    public void about(View view){
        //button actions
        Intent intent = new Intent(this, AboutActivity.class);
        intent.putExtra(test,test);  //include state information for current state of app?
        startActivity(intent);
    }


}
