package agenda.devmob.ftce.usjt.br.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String Fila = "br.uajt.deswebmob.agenda.fila";
    private EditText txtfila;
    private Intent ListarContatosActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtfila = (EditText) findViewById(R.id.buscar_fila);
    }
    public void buscarContatos(View view) {
        String fila = txtfila.getText().toString();
        Intent intent = new Intent(this.ListarContatosActivity.class);
        intent.putExtra(Fila, fila);
        startActivity(intent);
    }
}
