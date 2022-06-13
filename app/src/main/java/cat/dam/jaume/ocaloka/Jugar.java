package cat.dam.jaume.ocaloka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Jugar extends AppCompatActivity {

    Button taulell;
    private EditText et_jugador1,et_jugador2,et_jugador3,et_jugador4,et_jugador5;
    private ImageView iv_afegirJugador1, iv_afegirJugador2, iv_afegirJugador3, iv_afegirJugador4;
    private LinearLayout ll_jugador1, ll_jugador2, ll_jugador3, ll_jugador4, ll_jugador5;
    private LinearLayout ll_botoafegir1, ll_botoafegir2, ll_botoafegir3, ll_botoafegir4, ll_botoafegir5;
    private ImageView iv_restarJugador2, iv_restarJugador3, iv_restarJugador4, iv_restarJugador5;
    public static int countJugadores=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jugar);
        //Objectes creats
        et_jugador1 = (EditText) findViewById(R.id.et_jugador1);
        et_jugador2 = (EditText) findViewById(R.id.et_jugador2);
        et_jugador3 = (EditText) findViewById(R.id.et_jugador3);
        et_jugador4 = (EditText) findViewById(R.id.et_jugador4);
        et_jugador5 = (EditText) findViewById(R.id.et_jugador5);

        //botons per afegir/restar
        //afegir
        iv_afegirJugador1 = (ImageView) findViewById(R.id.iv_afegirJugador1);
        iv_afegirJugador2 = (ImageView) findViewById(R.id.iv_afegirJugador2);
        iv_afegirJugador3 = (ImageView) findViewById(R.id.iv_afegirJugador3);
        iv_afegirJugador4 = (ImageView) findViewById(R.id.iv_afegirJugador4);

        //restar
        iv_restarJugador2 = (ImageView) findViewById(R.id.iv_restarJugador2);
        iv_restarJugador3 = (ImageView) findViewById(R.id.iv_restarJugador3);
        iv_restarJugador4 = (ImageView) findViewById(R.id.iv_restarJugador4);
        iv_restarJugador5 = (ImageView) findViewById(R.id.iv_restarJugador5);


        //Layouts amb els edittext i spinner
        ll_jugador1 = (LinearLayout) findViewById(R.id.ll_jugador1);
        ll_jugador2 = (LinearLayout) findViewById(R.id.ll_jugador2);
        ll_jugador3 = (LinearLayout) findViewById(R.id.ll_jugador3);
        ll_jugador4 = (LinearLayout) findViewById(R.id.ll_jugador4);
        ll_jugador5 = (LinearLayout) findViewById(R.id.ll_jugador5);

        //Layouts de afegir/restar
        ll_botoafegir1 = (LinearLayout) findViewById(R.id.ll_botoafegir1);
        ll_botoafegir2 = (LinearLayout) findViewById(R.id.ll_botoafegir2);
        ll_botoafegir3 = (LinearLayout) findViewById(R.id.ll_botoafegir3);
        ll_botoafegir4 = (LinearLayout) findViewById(R.id.ll_botoafegir4);
        ll_botoafegir5 = (LinearLayout) findViewById(R.id.ll_botoafegir5);

        clicarAfegirJugadorsU();
        clicarAfegirJugadorsDos();
        clicarAfegirJugadorsTres();
        clicarAfegirJugadorsQuatre();

        clicarRestarJugadorsDos();
        clicarRestarJugadorsTres();
        clicarRestarJugadorsQuatre();
        clicarRestarJugadorsCinc();
        taulell = (Button) findViewById(R.id.taulell);
        taulell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jugar = new Intent(Jugar.this, Taulell.class);


                jugar.putExtra("nom1", et_jugador1.getText().toString());
                jugar.putExtra("nom2", et_jugador2.getText().toString());
                jugar.putExtra("nom3", et_jugador3.getText().toString());
                jugar.putExtra("nom4", et_jugador4.getText().toString());
                jugar.putExtra("nom5", et_jugador5.getText().toString());
                startActivity(jugar);

            }

        });
    }

    boolean isClicked = false;




    public void clicarAfegirJugadorsU() {
        iv_afegirJugador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isClicked = true;

                if (isClicked == true) {
                    ll_jugador2.setVisibility(View.VISIBLE);//afegir segunet vista
                    ll_botoafegir1.setVisibility(View.GONE);//eliminar afegir jugador
                    countJugadores++;
                }
            }
        });
    }
    public void clicarAfegirJugadorsDos() {
        iv_afegirJugador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador3.setVisibility(View.VISIBLE);//afegir segunet vista
                    ll_botoafegir2.setVisibility(View.GONE);//eliminar afegir jugador
                    countJugadores++;
                }
            }
        });

    }
    public void clicarAfegirJugadorsTres() {
        iv_afegirJugador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador4.setVisibility(View.VISIBLE);//afegir segunet vista
                    ll_botoafegir3.setVisibility(View.GONE);//eliminar afegir jugador
                    countJugadores++;
                }
            }
        });
    }
    public void clicarAfegirJugadorsQuatre() {
        iv_afegirJugador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador5.setVisibility(View.VISIBLE);//afegir segunet vista
                    ll_botoafegir4.setVisibility(View.GONE);//eliminar afegir jugador
                    countJugadores++;
                }
            }
        });
    }

    public void clicarRestarJugadorsDos() {
        iv_restarJugador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador2.setVisibility(View.GONE);//borrar buto elminar
                    ll_botoafegir1.setVisibility(View.VISIBLE);//afegir jugador 4
                    countJugadores--;
                }
            }
        });
    }
    public void clicarRestarJugadorsTres() {
        iv_restarJugador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador3.setVisibility(View.GONE);//borrar buto elminar
                    ll_botoafegir2.setVisibility(View.VISIBLE);//afegir jugador 4
                    countJugadores--;
                }
            }
        });
    }
    public void clicarRestarJugadorsQuatre() {
        iv_restarJugador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador4.setVisibility(View.GONE);//borrar buto elminar
                    ll_botoafegir3.setVisibility(View.VISIBLE);//afegir jugador 4
                    countJugadores--;
                }
            }
        });
    }
    public void clicarRestarJugadorsCinc() {
        iv_restarJugador5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isClicked == true) {
                    ll_jugador5.setVisibility(View.GONE);//borrar buto elminar
                    ll_botoafegir4.setVisibility(View.VISIBLE);//afegir jugador 4
                    countJugadores--;
                }
            }
        });
    }

}