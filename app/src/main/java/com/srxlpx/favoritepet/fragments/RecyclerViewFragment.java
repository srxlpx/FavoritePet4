package com.srxlpx.favoritepet.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.R;
import com.srxlpx.favoritepet.adaptador.MascotaAdaptador;

import java.util.ArrayList;

/**
 * Created by Ed on 07/06/2016.
 */
public class RecyclerViewFragment extends Fragment{

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;

    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas (){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.bunny,"Bunny",0));
        mascotas.add(new Mascota(R.drawable.catty, "Katty",0));
        mascotas.add(new Mascota(R.drawable.doggy, "Doggy",0));
        mascotas.add(new Mascota(R.drawable.foxxy, "Foxxy",0));
        mascotas.add(new Mascota(R.drawable.goatty, "Goatty",0));
        mascotas.add(new Mascota(R.drawable.jiraffy,"Jiraffy",0));
        mascotas.add(new Mascota(R.drawable.lambby,"Lambby",0));
        mascotas.add(new Mascota(R.drawable.lionny,"Lionny",0));
        mascotas.add(new Mascota(R.drawable.piggy,"Piggy",0));
    }
}
