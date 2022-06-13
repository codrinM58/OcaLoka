package cat.dam.jaume.ocaloka;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
    private ImageView iv_enrrere;
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.c1,
            R.drawable.c2,
            R.drawable.c3,
            R.drawable.c4,
            R.drawable.c5,
            R.drawable.c6,
            R.drawable.c7,
            R.drawable.c8,
            R.drawable.c9,
            R.drawable.c10,
            R.drawable.c11,
            R.drawable.c12,
            R.drawable.c13,
            R.drawable.c14,
            R.drawable.c15,
            R.drawable.c16,
            R.drawable.c17,
            R.drawable.c18,
            R.drawable.c20,
            R.drawable.c21,
            R.drawable.c22,
            R.drawable.c23,
            R.drawable.c24,
            R.drawable.c25
    };
    // list of titles
    public String[] lst_title = {

            "INICI",
            "MATAR/CASAR/BESAR",
            "CASAMENT",
            "XUPITO",
            "QUI ÉS MÉS PROBABLE...",
            "JUTGE",
            "MIRADES",
            "Jo mai mai...",
            "INTERCAMBI",
            "PRESÓ",
            "VERITAT O PROVA",
            "ELS INFORMÀTICS BEUEN",
            "RECULAR",
            "BESECIÓ",
            "KARAOKE",
            "ROBA FORA",
            "QUIN FRED!",
            "GLOP",
            "CEL/INFERN",
            "JOC DE L'AMPOLLA",
            "MORT",
            "ARMARI MÀGIC",
            "MÒBIL",
            "GUNYADOR!"
    };
    // list of descriptions
    public String[] lst_description = {


            "Benvinguts al joc de la Oca Loka!!! per començar tots els participants fan un xupito!!!",
            "Tria una persona del grup amb la que et mataries, una amb la que et casaries i una que besaries",
            "Tria un participant i us caseu, cada vegada que un begui l'altre també haurà de beure i viscaversa",
            "Pren un xupito",
            "Proposa una votació, el jugador més votat beura un xupito",
            "Tens el dret de triar una nomra que durarà 3 rotacions",
            "Tots els participants miraran a terra, contaran fins a 3 i és miraran, els que hagin creuat mirades beuran",
            "Tens una afirmació per fer amb un 'jo mai' a devant, si algun jugador a fet aquesta cosa afirmada beurà",
            "Roteu els vostres cubatas cap a la dreta",
            "Estas a la presó! Fins que no treguis un nombre major que 5 no pots sortir. Has de beure un glop del teu cubata a cada torn mentres estiguis tencat",
            "Fes una pregunta a un participant, si no la vol contestar has de proposar-li una prova si es nega a fer la prova i a contestar a de beure 5 xupitos",
            "Si ets informàtic beus un xupito",
            "Recules 3 caselles i veus un glop",
            "Tria un dels participants per besar-lo si es nega, els dos beuen un xupito",
            "Els participants triaran una canço i tu la cantaràs",
            "Et treus la peça de roba que tu triïs, si no vols beus 2 xupitos o t'acabas tot el cubata de cop (Sant Hilari)",
            "Tria un participant i paseu-vos un gel amb la boca (si no disposeu d'un gel o podeu fer amb qualsavol objecte semblant)",
            "Tria un participant perquè begui un glop",
            "Tens dos opcions, si ets una santa ballaras batxata si ets una demonia ballaras twerk",
            "Poseu una ampolla buida al terra i gireu-la a qui assenyali la ampolla beura o se'l i proposara un repte",
            "Torna a l'inici i t'acabas tot el cubata de cop (Sant Hilari)",
            "Tria un participant del grup i hos heu de tencar a un armari (si no és disposa d'un armari es pot fer en un lloc semblant) ",
            "Tria el mòvil d'un participant i tel ha de deixar 1 minut",
            "Felicitats!! Has sobreviscut al joc de la Oca Loka!!!!"
    };
    // list of background colors
    public int[] lst_backgroundcolor = {


            Color.rgb(55, 55, 55),//INICI
            Color.rgb(239, 85, 85),//MATARCASABESAR
            Color.rgb(110, 49, 89),//CASMANET
            Color.rgb(1, 188, 212),//XUPITO
            Color.rgb(55, 55, 55),//MES PROBABLE
            Color.rgb(1, 188, 212),//JUTGE
            Color.rgb(55, 55, 55),//MIRADES
            Color.rgb(51, 204, 51), //YO NUNCA
            Color.rgb(239, 85, 85),//INTERCAMBI
            Color.rgb(110, 49, 89),//PRESO
            Color.rgb(1, 188, 212),//VERITAR PROVA
            Color.rgb(55, 55, 55),//INFORMATICS
            Color.rgb(1, 188, 212),//RECULAR
            Color.rgb(51, 153, 255),//BESEASIO
            Color.rgb(55, 55, 55),//KARAOKE
            Color.rgb(239, 85, 85),//ROBA FORA
            Color.rgb(110, 49, 89),//QUIN FRED
            Color.rgb(1, 188, 212),//GLOP
            Color.rgb(55, 55, 55),//CEL/INFERN
            Color.rgb(255, 51, 0),//JOC AMPOLLENCA
            Color.rgb(0, 204, 102),//MORT
            Color.rgb(1, 188, 212),//ARMARI
            Color.rgb(55, 55, 55),//MOBIL
            Color.rgb(245, 194, 05),//GUANYADOR
    };


    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}