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

        textViewDescricacaoParque.setText( "Criado em 1977 como a primeira Unidade de Conservação do Rio Grande do Norte, o Parque Estadual Dunas do Natal ”Jornalista Luiz Maria Alves\" está localizado em Natal e possui uma área de 1.172 hectares. Reconhecido pela UNESCO (Organização das Nações Unidas para a Educação, a Ciência e a Cultura) como parte integrante da Reserva da Biosfera da Mata Atlântica Brasileira, o Parque das Dunas é considerado o maior parque urbano sobre dunas do Brasil, exercendo fundamental importância para a qualidade de vida da população natalense, contribuindo tanto na recarga do lençol freático da cidade, quanto na purificação do ar. Seu ecossistema de dunas é rico e diversificado, abrigando uma fauna e flora de grande valor bioecológico, que inclui diversas espécies em processo de extinção.\n" +
                "\n" +
                "O Parque das Dunas tem por objetivo garantir a preservação e conservação dos ecossistemas naturais englobados; proteger os recursos genéticos; possibilitar a realização de estudos, pesquisas e trabalhos de interesse científico; preservar sítios de valor histórico, arqueológico e geomorfológico; além de oferecer condições para o lazer, o ecoturimo e a realização de atividades educativas e de conscientização ecológica.\n" +
                "\n" +
                "A cobertura vegetal do Parque das Dunas é representada, em sua maior parte, pela mata de duna litorânea, caracterizada por espécies herbáceas, arbustivas e arbóreas, registrando ainda a ocorrência de praias e sopés de dunas, e formação vegetal tabuleiro litorâneo. Nela predominam espécies peculiares da mata atlântica, além de algumas espécies de caatinga e tabuleiro, com destaque para a amescla-de-cheiro, antúrio selvagem e pau-brasil, as quais conferem ao ambiente grande diversidade e exuberância. A flora reúne mais de 270 espécies arbóreas distintas e 78 famílias, representada por mais de 350 espécies nativas.\n" +
                "\n" +
                "A fauna nativa do Parque é típica do ecossistema costeiro terrestre formado pela Mata Atlântica. De acordo com levantamento preliminar, a fauna do Parque está representada por cerca de 180 espécies dentre mamíferos, répteis, aves, e invertebrados, como borboletas, aranhas e escorpiões.\n" +
                "\n" +
                "O setor de uso público, entrada para o Parque das Dunas, é o “Bosque dos Namorados”, ocupando uma área aproximada de sete hectares, com mais de mil e trezentas árvores nativas da Mata Atlântica. No Bosque dos Namorados localizam-se a sede administrativa do Parque das Dunas, centro de visitantes, biblioteca, centro de pesquisas, viveiro, unidade de mostra de vegetação, anfiteatro pau-brasil, folha das artes, lago artificial, posto de comando ambiental, parque infantil e anel viário para atividades físicas e caminhadas. No centro de visitantes tem uma sala com uma exposição permanente denominada: \"Parque das Dunas: um encontro com sua natureza\".\n" +
                "\n" +
                "No viveiro são cultivadas as mudas de espécies vegetais nativas do Parque das Dunas, utilizadas na recuperação e reflorestamento de áreas de Mata Atlântica.\n" +
                "\n" +
                "Do Bosque dos Namorados partem as trilhas interpretativas, ao longo das quais os visitantes conhecem aspectos e elementos do ecossistema dunar. Ao todo, são seis km e meio de caminhada, distribuídos entre as trilhas Ubaia Doce, Peroba e Perobinha.\n" +
                "\n" +
                "O Parque das Dunas é gerido pelo IDEMA e recebe uma média anual de 150.000 visitantes, mantendo ainda um cadastro com cerca de 10.000 coopistas - que utilizam o espaço para a prática de atividades físicas. Durante o ano inteiro, o Parque oferece diversas atividades educativas, recreativas, físicas e culturais, com shows, peças, palestras, exposições e oficinas que garantem a diversão e o lazer dos seus visitantes." );

    }
}
