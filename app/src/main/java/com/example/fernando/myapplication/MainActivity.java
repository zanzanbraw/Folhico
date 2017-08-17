package com.example.fernando.myapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    LinearLayout faunaLayout;
    LinearLayout floraLayout;
    LinearLayout qrcodeLayout;
    final int BARCODE_READER_REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faunaLayout = (LinearLayout) findViewById(R.id.faunaLayout);
        floraLayout = (LinearLayout) findViewById(R.id.floraLayout);
        qrcodeLayout = (LinearLayout) findViewById(R.id.qrcodeLayout);

        faunaLayout.setOnClickListener( faunaLayoutOnClickListener );
        floraLayout.setOnClickListener( floraLayoutOnClickListener );
        qrcodeLayout.setOnClickListener( qrcodeLayoutOnClickListener );

    }

    View.OnClickListener faunaLayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent faunaIntent = new Intent(MainActivity.this, FaunaListActivity.class);

            startActivity(faunaIntent);

        }

    };

    View.OnClickListener floraLayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent floraIntent = new Intent(MainActivity.this, FloraListActivity.class);

            startActivity(floraIntent);

        }

    };

    View.OnClickListener qrcodeLayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            try {

                Intent intent = new Intent("com.google.zxing.client.android.SCAN");

                intent.putExtra("SCAN_MODE", "QR_CODE_MODE");

                startActivityForResult(intent, 0);

            } catch (ActivityNotFoundException anfe) {

            }

        }

    };

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {

        if (requestCode == 0) {

            if (resultCode == RESULT_OK) {

                Toast toast = Toast.makeText(this, "QR Code capturado com sucesso", Toast.LENGTH_LONG);

                toast.show();

                String contents = intent.getStringExtra("SCAN_RESULT");

                Intent planta3Intent = new Intent(MainActivity.this, FloraDetalheActivity.class);

                planta3Intent.putExtra( "tela", Integer.parseInt(contents) );

                startActivity(planta3Intent);

            }

        }

    }




}