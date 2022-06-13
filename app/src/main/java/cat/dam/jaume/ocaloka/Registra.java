package cat.dam.jaume.ocaloka;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.PasswordTransformationMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registra extends AppCompatActivity {
    EditText Etusurname,EtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra);
        Etusurname = (EditText) findViewById(R.id.editTextTextuser);
        EtPass=(EditText) findViewById(R.id.editTextTextPassword);
    }

    public void Registra(View v){
        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String UserName=Etusurname.getText().toString();
        String PassUser=EtPass.getText().toString();
        ContentValues values = new ContentValues();
        values.put("username",UserName);
        values.put("clave_user",PassUser);
        db.insert("userstable",null,values);
        db.close();
        Toast ToastMens= Toast.makeText(this,"Usuario registrado",Toast.LENGTH_SHORT);
        ToastMens.show();
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent); }
    public void Login(View v){

        Intent rdata=new Intent(this, Login.class);
        startActivity(rdata);


    }
}