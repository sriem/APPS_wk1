package de.riemann.week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button onoff1Btn;
    private Button onoff2Btn;
    private Button onoff3Btn;

    private int[] pictures = {  R.drawable.a1, R.drawable.a2,R.drawable.a3,R.drawable.a4,
                                R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,
                                R.drawable.a9,R.drawable.a10};

    private Random rnd = new Random();


    private Button change1Btn;
    private Button change2Btn;
    private Button change3Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView picture1ImageView = (ImageView) findViewById(R.id.picture1ImageView);
        picture1ImageView.setImageResource(pictures[rnd.nextInt(pictures.length)]);
        final ImageView picture2ImageView = (ImageView) findViewById(R.id.picture2ImageView);
        picture2ImageView.setImageResource(pictures[rnd.nextInt(pictures.length)]);
        final ImageView picture3ImageView = (ImageView) findViewById(R.id.picture3ImageView);
        picture3ImageView.setImageResource(pictures[rnd.nextInt(pictures.length)]);

        /**
         * First Row
         */
        onoff1Btn = (Button) findViewById(R.id.onoff1Btn);
        onoff1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePictureState(picture1ImageView);

            }
        });

        change1Btn = (Button) findViewById(R.id.change1Btn);
        change1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture1ImageView.setImageResource(getRndPicture());
            }
        });


        /**
         * Second Row
         */
        onoff2Btn = (Button) findViewById(R.id.onoff2Btn);
        onoff2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePictureState(picture2ImageView);

            }
        });
        change2Btn = (Button) findViewById(R.id.change2Btn);
        change2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture2ImageView.setImageResource(getRndPicture());
            }
        });

        /**
         * Third Row
         */
        onoff3Btn = (Button) findViewById(R.id.onoff3Btn);
        onoff3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePictureState(picture3ImageView);

            }
        });


        change3Btn = (Button) findViewById(R.id.change3Btn);
        change3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture3ImageView.setImageResource(getRndPicture());
            }
        });









    }

    private int getRndPicture(){

        return pictures[rnd.nextInt(pictures.length)];
    }


    private void changePictureState (View v){
        if(v.getVisibility() != v.VISIBLE){
            v.setVisibility(v.VISIBLE);
        } else {
            v.setEnabled(false);
            v.setVisibility(v.INVISIBLE);
        }

    }
}
