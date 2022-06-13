package cat.dam.jaume.ocaloka;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class Login extends AppCompatActivity {

    EditText et1,et2;

    private Cursor fila;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1= (EditText) findViewById(R.id.etusuario);
        et2= (EditText) findViewById(R.id.edtclave);
    }

    public void Login(View v){
        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=et1.getText().toString();
        String contrasena=et2.getText().toString();
        fila=db.rawQuery("select username,clave_user from userstable where username='"+
                usuario+"' and clave_user='"+contrasena+"'",null);
        try {
            if(fila.moveToFirst()){
                String usua=fila.getString(0);
                String pass=fila.getString(1);
                if (usuario.equals(usua)&&contrasena.equals(pass)){
                    Intent ven=new Intent(this, MainActivity.class);
                    startActivity(ven);
                    et1.setText("");
                    et2.setText("");
                }
            }
            else {
                Toast toast=Toast.makeText(this,"Dades incorrectes",Toast.LENGTH_LONG);
                toast.show();
            }

        } catch (Exception e) {
            Toast toast=Toast.makeText(this,"Error" + e.getMessage(),Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Registra(View v){
        Intent rdata=new Intent(this, Registra.class);
        startActivity(rdata);
    }
    public void Sortir(View v){

            finish();


        }
}