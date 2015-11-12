package com.example.millionersquotes;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yodgorbek on 07.11.15.
 */
public class Quotes extends Activity {
    TextView textQuotes;
    ImageView image;
    private Object FileNotFoundException;
    private Object IOException;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quotes);
        String getQuote;
        textQuotes = (TextView) findViewById(R.id.tvQuotes);
        image = (ImageView) findViewById(R.id.imageBackground);
        Bundle extras = getIntent().getExtras();
        Bitmap bmp = (Bitmap) extras.getParcelable("imageurl");
        getQuote = extras.getString("parseBillGates");
        Log.e("Extra", getQuote);
        // Toast.makeText(getApplicationContext(), getQuote, Toast.LENGTH_LONG).show();
        textQuotes.setText(getQuote);
        image.setImageBitmap(bmp);

    }
}


