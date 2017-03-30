package com.raquel.menulistas.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.raquel.menulistas.R;
import com.raquel.menulistas.activities.CamisaActivity;
import com.raquel.menulistas.test.modelo;
import com.raquel.menulistas.adapter.CamisasAdapter;
import com.raquel.menulistas.beans.CamisaBean;

import java.util.ArrayList;

public class ListCamisasFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listCamisas;
    private ArrayList<CamisaBean> camisas;
    public static final String CAMISA_KEY="CAMISA_KEY";

    public ListCamisasFragment() {
        // Required empty public constructor
    }

    public static ListCamisasFragment newInstancia(){
        return new  ListCamisasFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_camisas, container, false);
        listCamisas = (ListView) view.findViewById(R.id.listCamisas);
        camisas = modelo.getCamisa();
        CamisasAdapter adapter = new CamisasAdapter(getActivity(),R.layout.item_camisa,camisas);
        listCamisas.setAdapter(adapter);
        listCamisas.setOnItemClickListener(this);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        CamisaBean camisaBean = camisas.get(posicion);
        Intent intent = new Intent(getActivity(), CamisaActivity.class);
        intent.putExtra(CAMISA_KEY,camisaBean);
        startActivity(intent);
    }
}
