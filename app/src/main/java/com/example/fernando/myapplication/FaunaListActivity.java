package com.example.fernando.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FaunaListActivity extends AppCompatActivity {

    LinearLayout animal1Layout;
    LinearLayout animal2Layout;
    LinearLayout animal3Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna_list);

        animal1Layout = (LinearLayout) findViewById(R.id.animal1Layout);
        animal2Layout = (LinearLayout) findViewById(R.id.animal2Layout);
        animal3Layout = (LinearLayout) findViewById(R.id.animal3Layout);

        animal1Layout.setOnClickListener( animal1LayoutOnClickListener );
        animal2Layout.setOnClickListener( animal2LayoutOnClickListener );
        animal3Layout.setOnClickListener( animal3LayoutOnClickListener );
    }

    View.OnClickListener animal1LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent animal1Intent = new Intent(FaunaListActivity.this, FaunaDetalheActivity.class);

            animal1Intent.putExtra( "tela", 1 );

            startActivity(animal1Intent);

        }

    };

    View.OnClickListener animal2LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent animal2Intent = new Intent(FaunaListActivity.this, FaunaDetalheActivity.class);

            animal2Intent.putExtra( "tela", 2 );

            startActivity(animal2Intent);

        }

    };

    View.OnClickListener animal3LayoutOnClickListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent animal3Intent = new Intent(FaunaListActivity.this, FaunaDetalheActivity.class);

            animal3Intent.putExtra( "tela", 3 );

            startActivity(animal3Intent);

        }

    };
}
