package com.example.khadijahsalim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view)
    {
        number = number + 1;
        display(number);
    }

    public void decrement(View view)
    {
        number = number - 1;
        display(number);
    }

    public void submitOrder(View view)
    {
        displayPrice(number);
    }

    private void display(int num)
    {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" +   num);
    }


    private void displayPrice(int num)
    {
        TextView priceTextView = (TextView) findViewById(
                R.id.price_text_view);
        priceTextView.setText("Total is: " +   num * 5);
    }

}

