package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView ListaFilmes;

    String titulo[] = {"SPIDER-MAN NO WAY HOME",""};
    String descicao[] = {"Peter Parker tem a sua identidade secreta revelada e pede ajuda ao Doutor Estranho. Quando um feitiço para reverter o evento não sai como o esperado, o Homem-Aranha e seu companheiro dos Vingadores precisam enfrentar inimigos de todo o multiverso."};
    String acesso[] = {};
    int filmes [] = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaFilmes = findViewById(R.id.idListaFilmes);

    MyAdapter adapter = new MyAdapter();


        //preparar para instanciar o adaptador
        ListaFilmes.setAdapter(Adaptador);
    }
    //criando uma inner class MyAdapter

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //adaptador ligando ao modelo

            View v = getLayoutInflater().inflate(R.layout.modelo_filmes,null);

            //Apresentar as variaveis do Java para o modelo xml

            imagemFilme = v.findViewById(R.id.imgFilmes);
            tituloFilme = v.findViewById(R.id.idTituloFilmes);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilmes);
            acessoFilme = v.findViewById(R.id.idAcessoFilmes);


            //inserindo os valores nas variaveis do java

            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(descicao[i]);
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);

            return v;
        }
    }
}