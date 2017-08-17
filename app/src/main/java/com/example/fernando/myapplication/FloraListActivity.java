package com.example.fernando.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FloraListActivity extends AppCompatActivity {

    LinearLayout planta1Layout;
    LinearLayout planta2Layout;
    LinearLayout planta3Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora_list);

        planta1Layout = (LinearLayout) findViewById(R.id.planta1Layout);
        planta2Layout = (LinearLayout) findViewById(R.id.planta2Layout);
        planta3Layout = (LinearLayout) findViewById(R.id.planta3Layout);

        planta1Layout.setOnClickListener( planta1LayoutOnClickListener );
        planta2Layout.setOnClickListener( planta2LayoutOnClickListener );
        planta3Layout.setOnClickListener( planta3LayoutOnClickListener );

    }


    View.OnClickListener planta1LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent planta1Intent = new Intent(FloraListActivity.this, FloraDetalheActivity.class);

            planta1Intent.putExtra( "tela", 1 );

            startActivity(planta1Intent);

        }

    };

    View.OnClickListener planta2LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent planta2Intent = new Intent(FloraListActivity.this, FloraDetalheActivity.class);

            planta2Intent.putExtra( "tela", 2 );

            startActivity(planta2Intent);

        }

    };

    View.OnClickListener planta3LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent planta3Intent = new Intent(FloraListActivity.this, FloraDetalheActivity.class);

            planta3Intent.putExtra( "tela", 3 );

            startActivity(planta3Intent);

        }

    };

}
