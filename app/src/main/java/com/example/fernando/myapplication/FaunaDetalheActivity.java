package com.example.fernando.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FaunaDetalheActivity extends AppCompatActivity {

    ImageView imageFaunaDetalhe;

    TextView textViewDescricacaoFauna, textViewHistoricoFauna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna_detalhe);

        imageFaunaDetalhe = (ImageView) findViewById(R.id.imageFaunaDetalhe);

        textViewDescricacaoFauna = (TextView) findViewById(R.id.textViewDescricacaoFauna);
        textViewHistoricoFauna = (TextView) findViewById(R.id.textViewHistoricoFauna);

        Bundle extras = getIntent().getExtras();

        int tela = extras.getInt("tela");

        if (tela == 1) {

            setTitle( "Sagui de Tufos Brancos" );

            imageFaunaDetalhe.setImageResource( R.drawable.sagui );

            textViewDescricacaoFauna.setText( "O sagui-de-tufos-brancos (Callithrix jacchus), também conhecido como Mico, é um primata comumente encontrado em meio  urbano, que vive em grupos que variam de 03 a 15 indivíduos. São animais territorialistas e de hábitos diurnos. A sua alimentação é baseada em frutas, néctar, goma, pequenos vertebrados e invertebrados." );
            textViewHistoricoFauna.setText( "A espécie apresenta parto de gêmeos e os indivíduos podem ser monogâmicos." );


        } else if (tela == 2) {

            setTitle( "Tamanduá Mirim" );

            imageFaunaDetalhe.setImageResource( R.drawable.tamandua );

            textViewDescricacaoFauna.setText( "O Tamanduá mirim (Tamandua tetradactyla) é um animal da ordem pilosa, que ocorre em todos os biomas do Brasil, incluindo a mata atlântica do nordeste brasileiro. Possui atividade noturna, de hábito solitário, essa espécie alimenta-se de principalmente formigas e cupins. Não possui dentes, a sua cauda é preênsil. " );
            textViewHistoricoFauna.setText( "Possui hábito solitário, com exceção da época de acasalamento e da mãe com seu filhote. É escansorial, ou seja, vive tanto em árvores quanto no solo." );

        } else if (tela == 3) {

            setTitle( "Cachorro do Mato" );

            imageFaunaDetalhe.setImageResource( R.drawable.cachorro );

            textViewDescricacaoFauna.setText( "O cachorro do mato (Cerdocyon thous), também conhecido como raposa, é um canídeo de hábito crepuscular e noturno. Considerado de médio porte, esse animal possui focinho curto, orelhas pequenas, cauda longa e peluda. Quanto à reprodução, são monogâmicos e o acasalamento pode ocorrer em qualquer época do ano, gerando uma ninhada de 3 a 6 filhotes. A espécie possui dieta oportunista e generalista, podendo alimentar-se de pequenos mamíferos, anfíbios, insetos e até carniça. " );
            textViewHistoricoFauna.setText( "A expectativa de vida desses animais giram em torno dos 10 anos. Entretanto, principalmente por conta da caça, elas acabam vivendo apenas 2 ou 3 anos nos lugares mais afetados pela ação humana. " );

        }

    }
}
