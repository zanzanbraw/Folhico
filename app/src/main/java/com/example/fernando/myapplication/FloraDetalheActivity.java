package com.example.fernando.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FloraDetalheActivity extends AppCompatActivity {

    ImageView imageFloraDetalhe;

    TextView textViewDescricacaoFlora, textViewHistoricoFlora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora_detalhe);

        imageFloraDetalhe = (ImageView) findViewById(R.id.imageFloraDetalhe);

        textViewDescricacaoFlora = (TextView) findViewById(R.id.textViewDescricacaoFlora);
        textViewHistoricoFlora = (TextView) findViewById(R.id.textViewHistoricoFlora);

        Bundle extras = getIntent().getExtras();

        int tela = extras.getInt("tela");

        if (tela == 1) {

            setTitle( "Flor de Pau Brasil" );

            imageFloraDetalhe.setImageResource( R.drawable.florbrasil );

            textViewDescricacaoFlora.setText( "O pau-brasil (Paubrasilia echinata), é uma árvore de grande porte, que pode chegar a 15 m de altura. Floração de cor amarela, é símbolo do país. Os frutos são vagens cobertas por longos e afiados espinhos, que devem protegê-los de pássaros indesejáveis, pois estes comeriam os frutos." );
            textViewHistoricoFlora.setText( "Era muito abundante na mata atlântica, no entanto foi bastante explorada comercialmente pelos portugueses, no período do descobrimento do país, devido a coloração avermelhada que é extraída do seu tronco, para a coloração de tecidos. Está na lista de espécies ameaçadas de extinção." );


        } else if (tela == 2) {

            setTitle( "Orquídea Catléia" );

            imageFloraDetalhe.setImageResource( R.drawable.orquidea );

            textViewDescricacaoFlora.setText( "Orquídea nativa da mata atlântica, de porte médio/grande, podendo chegar a mais de 50cm de altura. Sua distribuição se estende nos estados do Rio Grande do Norte, Paraíba, Pernambuco, Alagoas e o estado da Bahia." );
            textViewHistoricoFlora.setText( "De beleza exuberante, está na lista de espécies ameaçadas de extinção devido principalmente ao crime ambiental de sua extração, principalmente para fins comerciais." );

        } else if (tela == 3) {

            setTitle( "Xinxozinho" );

            imageFloraDetalhe.setImageResource( R.drawable.xinxozinho );

            textViewDescricacaoFlora.setText( "O xinxozinho (Cryptanthus zonatus) é uma bromélia terrestre e geralmente é encontrada escondida entre o folhiço, curtindo a sombra da mata.\n" +
                    "Trata-se de uma espécie endêmica da Mata Atlântica, ou seja, ela só existe nas matas do Nordeste do Brasil e em nenhum outro lugar do mundo. Essa exclusividade se deve a sua distribuição restrita: ela ocorre apenas no RN, PB e PE.\n" +
                    "Sua floração acontece entre os meses de março e abril, presenteando-nos com uma flor alva bem pequena.\n" );
            textViewHistoricoFlora.setText( "O xinxozinho encontra-se na lista de espécies ameaçadas de extinção." );

        } else if (tela == 4) {

            setTitle( "XXXXXX" );

            imageFloraDetalhe.setImageResource( R.drawable.xinxozinho );

            textViewDescricacaoFlora.setText( "O xinxozinho (Cryptanthus zonatus) é uma bromélia terrestre e geralmente é encontrada escondida entre o folhiço, curtindo a sombra da mata.\n" +
                    "Trata-se de uma espécie endêmica da Mata Atlântica, ou seja, ela só existe nas matas do Nordeste do Brasil e em nenhum outro lugar do mundo. Essa exclusividade se deve a sua distribuição restrita: ela ocorre apenas no RN, PB e PE.\n" +
                    "Sua floração acontece entre os meses de março e abril, presenteando-nos com uma flor alva bem pequena.\n" );
            textViewHistoricoFlora.setText( "O xinxozinho encontra-se na lista de espécies ameaçadas de extinção." );

        } else if (tela == 5) {

            setTitle( "yyyyyyy" );

            imageFloraDetalhe.setImageResource( R.drawable.xinxozinho );

            textViewDescricacaoFlora.setText( "O xinxozinho (Cryptanthus zonatus) é uma bromélia terrestre e geralmente é encontrada escondida entre o folhiço, curtindo a sombra da mata.\n" +
                    "Trata-se de uma espécie endêmica da Mata Atlântica, ou seja, ela só existe nas matas do Nordeste do Brasil e em nenhum outro lugar do mundo. Essa exclusividade se deve a sua distribuição restrita: ela ocorre apenas no RN, PB e PE.\n" +
                    "Sua floração acontece entre os meses de março e abril, presenteando-nos com uma flor alva bem pequena.\n" );
            textViewHistoricoFlora.setText( "O xinxozinho encontra-se na lista de espécies ameaçadas de extinção." );

        }


    }

}