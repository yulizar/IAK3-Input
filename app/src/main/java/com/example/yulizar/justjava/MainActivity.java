package com.example.yulizar.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void Increment(View view){
        quantity = getQuantity(view);
        quantity++;
        display(quantity);
//        displayPrice(quantity);
    }

    public void Decrement(View view){
        quantity = getQuantity(view);
        quantity--;
        display(quantity);
//        displayPrice(quantity);
    }

    public void submitOrder(View view){
        String priceMessage = "Total = "+quantity*5+"";
        displayMessage(priceMessage);
//        displayPrice(quantity*5);
    }

    /*

    *This Method return number of quantity
     */

    public int getQuantity(View view){
        TextView valueTextView = (TextView) findViewById(R.id.value);

        return (Integer) Integer.parseInt(valueTextView.getText().toString());
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number) {
        TextView valueTextView = (TextView) findViewById(R.id.value);

//        int number = (Integer) Integer.parseInt(valueTextView.getText().toString());
//        number++;
        valueTextView.setText("" + number);
    }

    private void displayPrice(int quantity){
        TextView priceValueTextView = (TextView) findViewById(R.id.price_value);
        priceValueTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_value);
        priceTextView.setText(message);
    }
}
