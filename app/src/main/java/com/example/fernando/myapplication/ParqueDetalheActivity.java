package com.example.fernando.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ParqueDetalheActivity extends AppCompatActivity {

    ImageView imageParqueDetalhe;

    TextView textViewDescricacaoParque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_detalhe);

        imageParqueDetalhe = (ImageView) findViewById(R.id.imageParqueDetalhe);

        textViewDescricacaoParque = (TextView) findViewById(R.id.textViewDescricacaoParque);

        setTitle( "Parque das Dunas" );

        imageParqueDetalhe.setImageResource( R.drawable.imgparque );

        textViewDescricacaoParque.setText( "Criado em 1977 como a primeira Unidade de Conservação do Rio Grande do Norte, o Parque Estadual Dunas do Natal ”Jornalista Luiz Maria Alves\" está localizado em Natal e possui uma área de 1.172 hectares. Reconhecido pela UNESCO (Organização das Nações Unidas para a Educação, a Ciência e a Cultura) como parte integrante da Reserva da Biosfera da Mata Atlântica Brasileira, o Parque das Dunas é considerado o maior parque urbano sobre dunas do Brasil, exercendo fundamental importância para a qualidade de vida da população natalense, contribuindo tanto na recarga do lençol freático da cidade, quanto na purificação do ar. Seu ecossistema de dunas é rico e diversificado, abrigando uma fauna e flora de grande valor bioecológico, que inclui diversas espécies em processo de extinção." );

    }
}
