package com.example.datebetter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        //set bio_val edittext to allow for done button
        EditText bio_val= (EditText) findViewById(R.id.bio_val);
//        bio_val.setLines(3);
//        bio_val.setHorizontallyScrolling(false);

       // bio_val.setSingleLine(true);
        bio_val.setLines(4);
        bio_val.setHorizontallyScrolling(false);
        bio_val.setImeActionLabel(getString(R.string.bio_done), 0);

    }

    protected void handle_save(View v) {
        startActivity(new Intent(EditProfile.this, Profile.class));
    }


    /*Name: populate
     * action:
     *  queries database for all profile information for user
     *  sets the values of each trait spinner to those values, or "none" if not completed yet
     *
     *
     **/

    protected void populate(){


    }
}
