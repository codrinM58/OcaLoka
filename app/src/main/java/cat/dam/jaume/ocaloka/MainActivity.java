package cat.dam.jaume.ocaloka;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jugar;
    Button biblioteca;
    Button sortir;

    Animation scaleUp,scaleDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BUTTONS
        jugar = (Button)findViewById(R.id.jugar);
        biblioteca = (Button)findViewById(R.id.biblioteca);
        sortir = (Button)findViewById(R.id.btn_sortir);
        //ANIMATIONS
        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        jugar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    jugar.startAnimation(scaleUp);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP)
                    jugar.startAnimation(scaleDown);
                Intent jugar = new Intent(MainActivity.this, Jugar.class);
                startActivity(jugar);
                return true;
            }
        });


        biblioteca.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    biblioteca.startAnimation(scaleUp);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP)
                    biblioteca.startAnimation(scaleDown);
                Intent biblioteca = new Intent(MainActivity.this, biblioteca.class);
                startActivity(biblioteca);
                return true;
            }
        });


        sortir.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    sortir.startAnimation(scaleUp);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP)
                    sortir.startAnimation(scaleDown);

                Intent rdata=new Intent(MainActivity.this, Login.class);
                startActivity(rdata);
                return true;
            }
        });
    }
}