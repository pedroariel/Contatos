package agenda.devmob.ftce.usjt.br.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarContatosActivity extends Activity {
    public static final String CONTATO = "br.usjt.deswebmob.agenda";
    ArrayList<String> chamados;
    ListView listView;
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_contatos);
        Intent intent = getIntent();
        String nomeFila = intent.getStringExtra(MainActivity.Fila);
        ArrayList<String> contatos = buscarContatos(nomeFila);
        listView = (ListView) findViewById(R.id.Listar_contatos);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.r.layout.simple_list_item_1, chamados);
        listView.setAdapter(adapter);
        contexto = this;

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String contato = contatos.get(position);
                        Intent intent1 = new Intent(contexto, DetalheContatoActivity.class);
                        intent1.putExtra(CONTATO, contato);
                        startActivity(intent1);
                    }
                }
        );
    }

    private ArrayList<String> buscarContatos(String chave) {
        ArrayList<String> lista = geraListaContatos();
        if (chave == null || chave.length()== 0) {
            return lista;
        }
        ArrayList<String> resultado = new ArrayList<>();
        {
            for (String contato : lista) {
                if (contato.toUpperCase().contains(chave.toUpperCase())) {
                    resultado.add(contato);
                }
            }
        }
        return lista;
    }

    private ArrayList<String> geraListaContatos() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Beatriz");
        lista.add("Bruno");
        lista.add("Caique");
        lista.add("Carlos");
        lista.add("Carolina");
        lista.add("Debora");
        lista.add("Douglas");
        lista.add("Fernanda");
        lista.add("Fernando");
        lista.add("Gabriel");
        lista.add("Gustavo");
        lista.add("Lara");
        lista.add("Leandro");
        lista.add("Luana");
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Raissa");
        lista.add("Rebecca");
        lista.add("Roberta");
        lista.add("Vanessa");
        return lista;
    }
}



