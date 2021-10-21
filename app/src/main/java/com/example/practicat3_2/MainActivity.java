package com.example.practicat3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {




    ListView lista;

    String[][] datos = {
            {"Battle Game in 5 Seconds", "Christopher Nolan", "2:49", "9", "Personas aleatorias de todo el mundo son secuestradas y reciben una habilidad especial, y luego son forzadas a participar en algún tipo de experimento retorcido. Lo que se encuentra al final de este experimento no está claro, como lo que sucederá con aquellos que fallen..."},
            {"Castlevania", "James Mangold", "2:17", "7", "Un cazador de vampiros trata de defender una ciudad frente a un ejército de bestias malignas liderado por el mismísimo Drácula. Inspirada en los legendarios videojuegos.."},
            {"Devilman Crybaby", "Baltasar Kormákur", "2:01", "8", "Los demonios han despertado y la humanidad es presa del caos. Un sensible chico-demonio se verá arrastrado a una violenta guerra contra el mal por su misterioso amigo.."},
            {"La Leyenda de Korra", "Guillermo del Toro", "2:12", "7", "La serie tiene lugar en el mismo universo ficticio que su predecesora: un mundo con características orientales, donde algunas personas tienen la capacidad de manipular el agua, tierra, fuego o aire, mediante una habilidad llamada \"control\". En este mundo, hay una sola persona capaz de dominar los cuatro elementos: el Avatar, quien también debe mantener el equilibrio entre las cuatro naciones, y que además, puede entrar en un estado poderoso, llamado El estado Avatar, pero también, debe aprender a controlarla para que ingrese en el estado cuando lo desee. La serie está ambientada 70 años después de los hechos finales de la serie original y sigue al Avatar Korra, una joven de la Tribu Agua del Sur y la reencarnación del Avatar Aang, mientras viaja a la metrópolis de la Ciudad República para aprender aire control y enfrentarse a un grupo revolucionario de anti-maestros, los \"igualitarios\". La serie, cuyo estilo está muy influido por la animación japonesa, obtuvo la mayor audiencia promedio para una serie animada en los Estados Unidos durante el 2012, con 4.3 millones de televidentes; y fue elogiada por los críticos por la calidad de su animación y por hacer frente a problemas sociopolíticos, tales como disturbios sociales y el terrorismo. Fue concebida inicialmente como una miniserie de 12 episodios, pero debido a la aceptación del público ahora está programada para emitirse por 52 episodios, separados en cuatro \"libros\".."},
            {"Parasyte", "Alex Garland", "1:48", "9", "Ellos llegan en silencio cubiertos bajo la oscuridad. Descienden de los cielos. Tienen hambre de carne humana. Están por todas partes. Son parásitos, criaturas alienígenas que deben invadir y tomar el control de un anfitrión humano para sobrevivir; y una vez que han infectado y se han apoderado de sus víctimas, pueden asumir cualquier forma mortal que elijan: monstruos con dientes gigantes, demonios alados, criaturas con cuchillas en vez de manos etc... Pero la mayoría de ellos ha optado por ocultar su letal propósito detrás de rostros humanos ordinarios. Así que nadie sabe su secreto, a excepción de un estudiante de secundaria común y corriente, su nombre es Shinichi Izumi, y esto es porque él mismo está luchando por mantener el control de su propio cuerpo contra uno de estos parásitos alienígena, pero ¿podrá él encontrar una manera de advertir a la humanidad de los horrores que los acechan?."},
            {"Super Once","Baltasar Kormákur", "2:01", "8", "Según la información dada por Akihiro Hino y el tráiler, los hechos ocurridos en la primera temporada de esta saga estará situada un año después de la primera temporada de la Saga de Mark, pero en un mundo paralelo donde algunos hechos nunca ocurrieron como la invasión de la Academia Alius o las muertes de algunos personajes como Aiden Froste y Xavier Schiller aunque con una diferencia de edad a comparación de sus contrapartes originales.."}
    };



    int[] datosImg = {R.drawable.battle_game, R.drawable.castlevania, R.drawable.devilman_crybaby, R.drawable.la_eyenda_de_korra, R.drawable.parasyte, R.drawable.super_once};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista=(ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new Adaptador(this,datos,datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetallesPelicula.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][4]);
                startActivity(visorDetalles);
            }
        });

       /*
        FloatingActionButton Favorito=(FloatingActionButton) findViewById(R.id.Favorito);
        Favorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Se añadio a Favoritos",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });*/
    }
}