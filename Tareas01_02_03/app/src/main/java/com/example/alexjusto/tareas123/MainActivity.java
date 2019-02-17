package com.example.alexjusto.tareas123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    List<Tarea> task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tarea tarea1 = new Tarea("tarea1", "21/05/2019", "2pm");
        task.add(tarea1);

        Tarea tarea2 = new Tarea("tarea2", "21/05/2019", "2pm");
        task.add(tarea2);

        Tarea tarea3 = new Tarea("tarea3", "21/05/2019", "2pm");
        task.add(tarea3);

        imprimir(task);
    }

    public void imprimir(List<Tarea> tasks) {
        for(Tarea lista: tasks){
            Log.d(TAG,"Tareas: " + lista.getNombre());
        }
    }

}
