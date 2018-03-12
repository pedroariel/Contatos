package agenda.devmob.ftce.usjt.br.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheContatoActivity extends Activity {
    TextView txtNome = (TextView) findViewById(R.id.contato_nome);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.R.attr R;
        setContentView(R.layout.activity_detalhe_contato);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListarContatosActivity.CONTATO);
        txtNome.setText(nome);
    }
}
