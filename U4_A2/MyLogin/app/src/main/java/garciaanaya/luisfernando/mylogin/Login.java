package garciaanaya.luisfernando.mylogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    Button btnLog;
    EditText txtUsu,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLog = findViewById(R.id.btnLogin);
        txtPass = findViewById(R.id.txtPassword);
        txtUsu = findViewById(R.id.txtUsuario);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent respuesta = new Intent();
                respuesta.putExtra("Usuario", txtUsu.getText().toString());
                respuesta.putExtra("Password", txtPass.getText().toString());
                setResult(MainActivity.LOGIN_INTENT_CODE,respuesta);
                finish();
            }
        });
    }
}
