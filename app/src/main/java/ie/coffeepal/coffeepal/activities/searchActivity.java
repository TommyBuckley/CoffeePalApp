package ie.coffeepal.coffeepal.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import ie.coffeepal.coffeepal.R;


/**
 * Created by Tommy on 13/04/2017.
 */


public class searchActivity extends AppCompatActivity implements View.OnClickListener{
    private AppCompatButton searchButton;
    private AppCompatButton nearMeButton;
    private AppCompatButton topRatedButton;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();

        initViews();
        initListeners();
    }

    private void initViews() {


        searchButton = (AppCompatButton) findViewById(R.id.searchButton);
        nearMeButton= (AppCompatButton) findViewById(R.id.nearMeButton);
        topRatedButton= (AppCompatButton) findViewById(R.id.topRatedButton);



    }
    private void initListeners() {
        searchButton.setOnClickListener(this);
        nearMeButton.setOnClickListener(this);
        topRatedButton.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.searchButton:
                // Navigate to RegisterActivity
                Intent intentSearch = new Intent(getApplicationContext(), CafeResultsActivity.class);
                startActivity(intentSearch);
                break;
            case R.id.nearMeButton:
                Intent intentNear = new Intent(getApplicationContext()CafeResultsActivity.class);
                        startActivity(intentNear);
                break;
            case R.id.topRatedButton:
                Intent intentTop = new Intent(getApplicationContext()CafeResultsActivity.class);
                startActivity(intentTop);
        }
    }

}
