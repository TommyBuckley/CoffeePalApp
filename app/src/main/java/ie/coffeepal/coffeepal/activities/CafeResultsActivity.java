package ie.coffeepal.coffeepal.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import ie.coffeepal.coffeepal.R;

/**
 * Created by Tommy on 13/04/2017.
 */

public class CafeResultsActivity extends AppCompatActivity implements View.OnClickListener{
    private AppCompatButton adButton;
    private AppCompatButton BrickLaneButton;
    private AppCompatButton CostaCoffeeButton;
    private AppCompatButton Street14Button;
    private AppCompatButton WhiteElephantButton;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caferesults);
        getSupportActionBar().hide();

        initViews();
        initListeners();
    }
    ////
    private void initViews() {


        adButton = (AppCompatButton) findViewById(R.id.adButton);
        BrickLaneButton = (AppCompatButton) findViewById(R.id.BrickLaneButton);
        CostaCoffeeButton= (AppCompatButton) findViewById(R.id.CostaCoffeeButton);
        Street14Button = (AppCompatButton) findViewById(R.id.Street14Button);
        WhiteElephantButton = (AppCompatButton) findViewById(R.id.WhiteElephantButton);




    }
    private void initListeners() {
        adButton.setOnClickListener(this);
        BrickLaneButton.setOnClickListener(this);
        CostaCoffeeButton.setOnClickListener(this);
        Street14Button.setOnClickListener(this);
        WhiteElephantButton.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BrickLaneButton:
                // Navigate to RegisterActivity
                Intent intentBrickLane = new Intent(getApplicationContext(), BrickLaneActivity.class);
                startActivity(intentBrickLane);
                break;
            case R.id.CostaCoffeeButton:
                Intent intentCosta = new Intent(getApplicationContext(),CostaCoffeeActivity.class);
                startActivity(intentCosta);
                break;
            case R.id.Street14Button:
                Intent intentStreet14 = new Intent(getApplicationContext(), CostaCoffeeActivity.class);
                startActivity(intentStreet14);
                break;
            case R.id.WhiteElephantButton:
                Intent intentWhiteElephant = new Intent(getApplicationContext(),WhiteElephantActivity.class);
                startActivity(intentWhiteElephant);
        }
    }
}
