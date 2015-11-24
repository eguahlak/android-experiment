package dk.cphbusiness.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import dk.cphbusiness.exampleapp.widgets.ItemSlider;

/**
 * Created by AKA on 24/11/15.
 */
public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        }


    public void savePerson(View view) {
        Toast.makeText(this, "Person info saved ...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, ItemSlider.class));
        }

    }
