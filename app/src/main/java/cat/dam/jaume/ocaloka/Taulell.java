package cat.dam.jaume.ocaloka;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Taulell extends AppCompatActivity {

    private TextView tv1, tv_dau,prova1,provaex1;
    private ImageView iv_close, iv_dau,iv_prova,iv_pantalla;
    private int numeroDadoAc=0;
    private int jugador = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taulell);
        tv1 = (TextView) findViewById(R.id.tv1);
        iv_close = (ImageView) findViewById(R.id.iv_close);
        iv_dau = (ImageView) findViewById(R.id.iv_dau);
        iv_prova = (ImageView) findViewById(R.id.iv_prova);
        iv_pantalla = (ImageView) findViewById(R.id.iv_pantalla);
        tv_dau = (TextView) findViewById(R.id.tv_dau);
        prova1 = (TextView) findViewById(R.id.prova1);
        provaex1 = (TextView) findViewById(R.id.provaex1);

        ArrayList<ImageView> lila;
        lila = new ArrayList<ImageView>();
        lila.add((ImageView) findViewById(R.id.lila1));
        lila.add((ImageView) findViewById(R.id.lila2));
        lila.add((ImageView) findViewById(R.id.lila3));
        lila.add((ImageView) findViewById(R.id.lila4));
        lila.add((ImageView) findViewById(R.id.lila5));
        lila.add((ImageView) findViewById(R.id.lila6));
        lila.add((ImageView) findViewById(R.id.lila7));
        lila.add((ImageView) findViewById(R.id.lila8));
        lila.add((ImageView) findViewById(R.id.lila9));
        lila.add((ImageView) findViewById(R.id.lila10));
        lila.add((ImageView) findViewById(R.id.lila11));
        lila.add((ImageView) findViewById(R.id.lila12));
        lila.add((ImageView) findViewById(R.id.lila13));
        lila.add((ImageView) findViewById(R.id.lila14));
        lila.add((ImageView) findViewById(R.id.lila15));
        lila.add((ImageView) findViewById(R.id.lila16));
        lila.add((ImageView) findViewById(R.id.lila17));
        lila.add((ImageView) findViewById(R.id.lila18));
        lila.add((ImageView) findViewById(R.id.lila19));
        lila.add((ImageView) findViewById(R.id.lila20));
        lila.add((ImageView) findViewById(R.id.lila21));
        lila.add((ImageView) findViewById(R.id.lila22));
        lila.add((ImageView) findViewById(R.id.lila23));
        lila.add((ImageView) findViewById(R.id.lila24));
        lila.add((ImageView) findViewById(R.id.lila25));

        ArrayList<ImageView> verd;
        verd = new ArrayList<ImageView>();
        verd.add((ImageView) findViewById(R.id.verd1));
        verd.add((ImageView) findViewById(R.id.verd2));
        verd.add((ImageView) findViewById(R.id.verd3));
        verd.add((ImageView) findViewById(R.id.verd4));
        verd.add((ImageView) findViewById(R.id.verd5));
        verd.add((ImageView) findViewById(R.id.verd6));
        verd.add((ImageView) findViewById(R.id.verd7));
        verd.add((ImageView) findViewById(R.id.verd8));
        verd.add((ImageView) findViewById(R.id.verd9));
        verd.add((ImageView) findViewById(R.id.verd10));
        verd.add((ImageView) findViewById(R.id.verd11));
        verd.add((ImageView) findViewById(R.id.verd12));
        verd.add((ImageView) findViewById(R.id.verd13));
        verd.add((ImageView) findViewById(R.id.verd14));
        verd.add((ImageView) findViewById(R.id.verd15));
        verd.add((ImageView) findViewById(R.id.verd16));
        verd.add((ImageView) findViewById(R.id.verd17));
        verd.add((ImageView) findViewById(R.id.verd18));
        verd.add((ImageView) findViewById(R.id.verd19));
        verd.add((ImageView) findViewById(R.id.verd20));
        verd.add((ImageView) findViewById(R.id.verd21));
        verd.add((ImageView) findViewById(R.id.verd22));
        verd.add((ImageView) findViewById(R.id.verd23));
        verd.add((ImageView) findViewById(R.id.verd24));
        verd.add((ImageView) findViewById(R.id.verd25));

        ArrayList<ImageView> groc;
        groc = new ArrayList<ImageView>();
        groc.add((ImageView) findViewById(R.id.groc1));
        groc.add((ImageView) findViewById(R.id.groc2));
        groc.add((ImageView) findViewById(R.id.groc3));
        groc.add((ImageView) findViewById(R.id.groc4));
        groc.add((ImageView) findViewById(R.id.groc5));
        groc.add((ImageView) findViewById(R.id.groc6));
        groc.add((ImageView) findViewById(R.id.groc7));
        groc.add((ImageView) findViewById(R.id.groc8));
        groc.add((ImageView) findViewById(R.id.groc9));
        groc.add((ImageView) findViewById(R.id.groc10));
        groc.add((ImageView) findViewById(R.id.groc11));
        groc.add((ImageView) findViewById(R.id.groc12));
        groc.add((ImageView) findViewById(R.id.groc13));
        groc.add((ImageView) findViewById(R.id.groc14));
        groc.add((ImageView) findViewById(R.id.groc15));
        groc.add((ImageView) findViewById(R.id.groc16));
        groc.add((ImageView) findViewById(R.id.groc17));
        groc.add((ImageView) findViewById(R.id.groc18));
        groc.add((ImageView) findViewById(R.id.groc19));
        groc.add((ImageView) findViewById(R.id.groc20));
        groc.add((ImageView) findViewById(R.id.groc21));
        groc.add((ImageView) findViewById(R.id.groc22));
        groc.add((ImageView) findViewById(R.id.groc23));
        groc.add((ImageView) findViewById(R.id.groc24));
        groc.add((ImageView) findViewById(R.id.groc25));

        ArrayList<ImageView> blau;
        blau = new ArrayList<ImageView>();
        blau.add((ImageView) findViewById(R.id.blau1));
        blau.add((ImageView) findViewById(R.id.blau2));
        blau.add((ImageView) findViewById(R.id.blau3));
        blau.add((ImageView) findViewById(R.id.blau4));
        blau.add((ImageView) findViewById(R.id.blau5));
        blau.add((ImageView) findViewById(R.id.blau6));
        blau.add((ImageView) findViewById(R.id.blau7));
        blau.add((ImageView) findViewById(R.id.blau8));
        blau.add((ImageView) findViewById(R.id.blau9));
        blau.add((ImageView) findViewById(R.id.blau10));
        blau.add((ImageView) findViewById(R.id.blau11));
        blau.add((ImageView) findViewById(R.id.blau12));
        blau.add((ImageView) findViewById(R.id.blau13));
        blau.add((ImageView) findViewById(R.id.blau14));
        blau.add((ImageView) findViewById(R.id.blau15));
        blau.add((ImageView) findViewById(R.id.blau16));
        blau.add((ImageView) findViewById(R.id.blau17));
        blau.add((ImageView) findViewById(R.id.blau18));
        blau.add((ImageView) findViewById(R.id.blau19));
        blau.add((ImageView) findViewById(R.id.blau20));
        blau.add((ImageView) findViewById(R.id.blau21));
        blau.add((ImageView) findViewById(R.id.blau22));
        blau.add((ImageView) findViewById(R.id.blau23));
        blau.add((ImageView) findViewById(R.id.blau24));
        blau.add((ImageView) findViewById(R.id.blau25));

        ArrayList<ImageView> varmell;
        varmell = new ArrayList<ImageView>();
        varmell.add((ImageView) findViewById(R.id.varmell1));
        varmell.add((ImageView) findViewById(R.id.varmell2));
        varmell.add((ImageView) findViewById(R.id.varmell3));
        varmell.add((ImageView) findViewById(R.id.varmell4));
        varmell.add((ImageView) findViewById(R.id.varmell5));
        varmell.add((ImageView) findViewById(R.id.varmell6));
        varmell.add((ImageView) findViewById(R.id.varmell7));
        varmell.add((ImageView) findViewById(R.id.varmell8));
        varmell.add((ImageView) findViewById(R.id.varmell9));
        varmell.add((ImageView) findViewById(R.id.varmell10));
        varmell.add((ImageView) findViewById(R.id.varmell11));
        varmell.add((ImageView) findViewById(R.id.varmell12));
        varmell.add((ImageView) findViewById(R.id.varmell13));
        varmell.add((ImageView) findViewById(R.id.varmell14));
        varmell.add((ImageView) findViewById(R.id.varmell15));
        varmell.add((ImageView) findViewById(R.id.varmell16));
        varmell.add((ImageView) findViewById(R.id.varmell17));
        varmell.add((ImageView) findViewById(R.id.varmell18));
        varmell.add((ImageView) findViewById(R.id.varmell19));
        varmell.add((ImageView) findViewById(R.id.varmell20));
        varmell.add((ImageView) findViewById(R.id.varmell21));
        varmell.add((ImageView) findViewById(R.id.varmell22));
        varmell.add((ImageView) findViewById(R.id.varmell23));
        varmell.add((ImageView) findViewById(R.id.varmell24));
        varmell.add((ImageView) findViewById(R.id.varmell25));

        int[] images = {R.drawable.dau1, R.drawable.dau2, R.drawable.dau3, R.drawable.dau4, R.drawable.dau5, R.drawable.dau6};



        ArrayList<TextView> prova;
        prova = new ArrayList<TextView>();
        prova.add((TextView) findViewById(R.id.prova2));
        prova.add((TextView) findViewById(R.id.prova3));
        prova.add((TextView) findViewById(R.id.prova4));
        prova.add((TextView) findViewById(R.id.prova5));
        prova.add((TextView) findViewById(R.id.prova6));
        prova.add((TextView) findViewById(R.id.prova7));
        prova.add((TextView) findViewById(R.id.prova8));
        prova.add((TextView) findViewById(R.id.prova9));
        prova.add((TextView) findViewById(R.id.prova10));
        prova.add((TextView) findViewById(R.id.prova11));
        prova.add((TextView) findViewById(R.id.prova12));
        prova.add((TextView) findViewById(R.id.prova13));
        prova.add((TextView) findViewById(R.id.prova14));
        prova.add((TextView) findViewById(R.id.prova15));
        prova.add((TextView) findViewById(R.id.prova16));
        prova.add((TextView) findViewById(R.id.prova17));
        prova.add((TextView) findViewById(R.id.prova18));
        prova.add((TextView) findViewById(R.id.prova19));
        prova.add((TextView) findViewById(R.id.prova20));
        prova.add((TextView) findViewById(R.id.prova21));
        prova.add((TextView) findViewById(R.id.prova22));
        prova.add((TextView) findViewById(R.id.prova23));
        prova.add((TextView) findViewById(R.id.prova24));
        prova.add((TextView) findViewById(R.id.prova25));


        ArrayList<TextView> provaex;
        provaex = new ArrayList<TextView>();
        provaex.add((TextView) findViewById(R.id.provaex2));
        provaex.add((TextView) findViewById(R.id.provaex3));
        provaex.add((TextView) findViewById(R.id.provaex4));
        provaex.add((TextView) findViewById(R.id.provaex5));
        provaex.add((TextView) findViewById(R.id.provaex6));
        provaex.add((TextView) findViewById(R.id.provaex7));
        provaex.add((TextView) findViewById(R.id.provaex8));
        provaex.add((TextView) findViewById(R.id.provaex9));
        provaex.add((TextView) findViewById(R.id.provaex10));
        provaex.add((TextView) findViewById(R.id.provaex11));
        provaex.add((TextView) findViewById(R.id.provaex12));
        provaex.add((TextView) findViewById(R.id.provaex13));
        provaex.add((TextView) findViewById(R.id.provaex14));
        provaex.add((TextView) findViewById(R.id.provaex15));
        provaex.add((TextView) findViewById(R.id.provaex16));
        provaex.add((TextView) findViewById(R.id.provaex17));
        provaex.add((TextView) findViewById(R.id.provaex18));
        provaex.add((TextView) findViewById(R.id.provaex19));
        provaex.add((TextView) findViewById(R.id.provaex20));
        provaex.add((TextView) findViewById(R.id.provaex21));
        provaex.add((TextView) findViewById(R.id.provaex22));
        provaex.add((TextView) findViewById(R.id.provaex23));
        provaex.add((TextView) findViewById(R.id.provaex24));
        provaex.add((TextView) findViewById(R.id.provaex25));

        Fitxa[] fitxes = new Fitxa[Jugar.countJugadores];
        switch (Jugar.countJugadores){

            case 1:
                String nom1 = getIntent().getStringExtra("nom1");
                fitxes[0] = new Fitxa(1, nom1,"lila");
                break;

            case 2:
                nom1 = getIntent().getStringExtra("nom1");
                fitxes[0] = new Fitxa(1, nom1,"lila");
                String nom2 = getIntent().getStringExtra("nom2");
                fitxes[1] = new Fitxa(1, nom2,"verd");
                break;

            case 3:
                nom1 = getIntent().getStringExtra("nom1");
                fitxes[0] = new Fitxa(1, nom1,"lila");
                nom2 = getIntent().getStringExtra("nom2");
                fitxes[1] = new Fitxa(1, nom2,"verd");
                String nom3 = getIntent().getStringExtra("nom3");
                fitxes[2] = new Fitxa(1, nom3,"blau");
                break;

            case 4:
                nom1 = getIntent().getStringExtra("nom1");
                fitxes[0] = new Fitxa(1, nom1,"lila");
                nom2 = getIntent().getStringExtra("nom2");
                fitxes[1] = new Fitxa(1, nom2,"verd");
                nom3 = getIntent().getStringExtra("nom3");
                fitxes[2] = new Fitxa(1, nom3,"blau");
                String nom4 = getIntent().getStringExtra("nom4");
                fitxes[3] = new Fitxa(1, nom4,"varmell");
                break;
            case 5:
                nom1 = getIntent().getStringExtra("nom1");
                fitxes[0] = new Fitxa(1, nom1,"lila");
                nom2 = getIntent().getStringExtra("nom2");
                fitxes[1] = new Fitxa(1, nom2,"verd");
                nom3 = getIntent().getStringExtra("nom3");
                fitxes[2] = new Fitxa(1, nom3,"blau");
                nom4 = getIntent().getStringExtra("nom4");
                fitxes[3] = new Fitxa(1, nom4,"varmell");
                String nom5 = getIntent().getStringExtra("nom5");
                fitxes[4] = new Fitxa(1, nom5,"groc");
                break;
        }


        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(fitxes[jugador].getNum_casella()==25)
                {
                    Intent jugar = new Intent(Taulell.this, MainActivity.class);
                    startActivity(jugar);
                }

                    if(jugador==5)
                    {
                        jugador=0;
                    }

                    if(fitxes[jugador].getNum_casella()==22)
                    {
                        if(jugador==0){
                            lila.get(21).setVisibility(View.INVISIBLE);
                            lila.get(0).setVisibility(View.VISIBLE);
                            fitxes[jugador].setNum_casella(1);
                        }
                        if(jugador==1){
                            verd.get(21).setVisibility(View.INVISIBLE);
                            verd.get(0).setVisibility(View.VISIBLE);
                            fitxes[jugador].setNum_casella(1);
                        }
                        if(jugador==2){
                            blau.get(21).setVisibility(View.INVISIBLE);
                            blau.get(0).setVisibility(View.VISIBLE);
                            fitxes[jugador].setNum_casella(1);
                        }
                        if(jugador==3){
                            varmell.get(21).setVisibility(View.INVISIBLE);
                            varmell.get(0).setVisibility(View.VISIBLE);
                            fitxes[jugador].setNum_casella(1);
                        }
                        if(jugador==4){
                            groc.get(21).setVisibility(View.INVISIBLE);
                            groc.get(0).setVisibility(View.VISIBLE);
                            fitxes[jugador].setNum_casella(1);
                        }
                    }
                    if(fitxes[jugador].getNum_casella()==13||fitxes[jugador].getNum_casella()==19)
                    {
                        // fitxes[countant].setNum_casella(fitxes[countant].getNum_casella()-3);
                        if(jugador==0){
                            int num = fitxes[jugador].getNum_casella()-1;
                            lila.get(num).setVisibility(View.INVISIBLE);
                            lila.get(num-3).setVisibility(View.VISIBLE);
                            fitxes[0].setNum_casella(num-2);
                        }
                        if(jugador==1){
                            int num = fitxes[jugador].getNum_casella()-1;
                            verd.get(num).setVisibility(View.INVISIBLE);
                            verd.get(num-3).setVisibility(View.VISIBLE);
                            fitxes[1].setNum_casella(num-2);
                        }
                        if(jugador==2){
                            int num = fitxes[jugador].getNum_casella()-1;
                            blau.get(num).setVisibility(View.INVISIBLE);
                            blau.get(num-3).setVisibility(View.VISIBLE);
                            fitxes[2].setNum_casella(num-2);
                        }
                        if(jugador==3){
                            int num = fitxes[jugador].getNum_casella()-1;
                            varmell.get(num).setVisibility(View.INVISIBLE);
                            varmell.get(num-3).setVisibility(View.VISIBLE);
                            fitxes[3].setNum_casella(num-2);
                        }
                        if(jugador==4){
                            int num = fitxes[jugador].getNum_casella()-1;
                            groc.get(num).setVisibility(View.INVISIBLE);
                            groc.get(num-3).setVisibility(View.VISIBLE);
                            fitxes[4].setNum_casella(num-2);
                        }



                    }


                for(int i=0; i < 24; i++){
                    prova.get(i).setVisibility(View.GONE);
                    provaex.get(i).setVisibility(View.GONE);
                    iv_close.setVisibility(View.GONE);
                }

                    prova1.setVisibility(View.GONE);
                    provaex1.setVisibility(View.GONE);
                    // SystemClock.sleep(2000);
                    MostraJugador(fitxes[jugador]);
                    iv_dau.setVisibility(view.VISIBLE);
                    tv_dau.setVisibility(view.VISIBLE);
                    iv_pantalla.setVisibility(view.VISIBLE);

                    AnimationDrawable dauAni;
                    dauAni = new AnimationDrawable();
                    iv_dau.setBackgroundResource(R.drawable.dau);
                    dauAni = (AnimationDrawable) iv_dau.getBackground();
                    dauAni.start();

                }


        });
        iv_pantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroDadoAc = TiraDau();
                iv_dau.setBackgroundResource(images[numeroDadoAc-1]);
                iv_pantalla.setVisibility(view.GONE);

            }


        });



        iv_dau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    int num = fitxes[jugador].getNum_casella()-1;
                    if(jugador==0){
                        lila.get(num).setVisibility(View.INVISIBLE);
                    }
                    if(jugador==1){
                        verd.get(num).setVisibility(View.INVISIBLE);
                    }
                    if(jugador==2){
                        blau.get(num).setVisibility(View.INVISIBLE);
                    }
                    if(jugador==3){
                        varmell.get(num).setVisibility(View.INVISIBLE);
                    }
                    if(jugador==4){
                        groc.get(num).setVisibility(View.INVISIBLE);
                    }


                    MoureJugador(fitxes[jugador], numeroDadoAc);


                    if(jugador==0){
                         num = fitxes[jugador].getNum_casella()-1;
                        lila.get(num).setVisibility(View.VISIBLE);
                    }
                    if(jugador==1){
                         num = fitxes[jugador].getNum_casella()-1;
                        verd.get(num).setVisibility(View.VISIBLE);
                    }
                    if(jugador==2){
                         num = fitxes[jugador].getNum_casella()-1;
                        blau.get(num).setVisibility(View.VISIBLE);
                    }
                    if(jugador==3){
                         num = fitxes[jugador].getNum_casella()-1;
                        varmell.get(num).setVisibility(View.VISIBLE);
                    }
                    if(jugador==4){
                         num = fitxes[jugador].getNum_casella()-1;
                        groc.get(num).setVisibility(View.VISIBLE);
                    }
                    //sleep

                    iv_close.setVisibility(View.GONE);
                    // esperar();
                    iv_dau.setVisibility(view.GONE);
                    tv_dau.setVisibility(view.GONE);

                    // esperar();
                    //prova1.setVisibility(View.VISIBLE);
                    // iv_close.setVisibility(View.VISIBLE);

                }

        });

        iv_prova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    int num = fitxes[jugador].getNum_casella()-2;
                    prova.get(num).setVisibility(View.VISIBLE);
                    provaex.get(num).setVisibility(View.VISIBLE);
                    iv_close.setVisibility(View.VISIBLE);

                    if(jugador!=Jugar.countJugadores-1)
                    {jugador++;}
                    else{jugador=0;}
                }


        });

    }

    public void MoureJugador(Fitxa fitxes, int valordau)
    {
        if(!(valordau < 5 && fitxes.getNum_casella()==10)) {
            int total = fitxes.getNum_casella() + valordau;
            if (total < 26) {
                for (int i = 0; i < valordau; i++) {
                    fitxes.setNum_casella(fitxes.getNum_casella() + 1);
                }
            }
        }
    }



    public void MostraJugador(Fitxa fitxes)
    { tv_dau.setText("Tira " + fitxes.getNom());

    }

    public int TiraDau()
    {
        Random r = new Random();
        int valorDado = r.nextInt(6)+1;

        return valorDado;
    }

    public class Fitxa {
        // Variables de instancia
        int num_casella;
        String nom;
        String color;

        public Fitxa(int num_casella, String nom,String color) {
            this.num_casella = num_casella;
            this.nom = nom;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNum_casella() {
            return num_casella;
        }

        public void setNum_casella(int num_casella) {
            this.num_casella = num_casella;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    }
}