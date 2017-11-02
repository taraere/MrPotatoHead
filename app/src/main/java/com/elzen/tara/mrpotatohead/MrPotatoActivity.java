package com.elzen.tara.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potato);
    }

    public void eyesClicked(View view) {

    }

    public void checkboxClicked(View view) {
        // is view checked?
        boolean checked = ((CheckBox) view).isChecked();

        ImageView bodyPart;

        // which checkbox?
        switch(view.getId()) {
//            bodyPart = findViewById(R.id)
//            if (checked) {
//
//            }

            case R.id.checkboxArms:
                bodyPart = findViewById(R.id.arms);
                if (checked) {
                    //make arms visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else
                    //make arms invisible
                    bodyPart.setVisibility(View.INVISIBLE);
            break;
            case R.id.checkboxEars:
                bodyPart = findViewById(R.id.ears);
                if(checked) {
                    //make body visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make body invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxEyes:
                bodyPart = findViewById(R.id.eyes);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxEyebrows:
                bodyPart = findViewById(R.id.eyebrows);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxGlasses:
                bodyPart = findViewById(R.id.glasses);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxHat:
                bodyPart = findViewById(R.id.hat);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxMouth:
                bodyPart = findViewById(R.id.mouth);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxMustache:
                bodyPart = findViewById(R.id.mustache);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxNose:
                bodyPart = findViewById(R.id.nose);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkboxShoes:
                bodyPart = findViewById(R.id.shoes);
                if(checked) {
                    //make eyes visible
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else {
                    //make eyes invisible
                    bodyPart.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
