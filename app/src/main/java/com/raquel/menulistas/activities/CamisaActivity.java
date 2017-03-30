package com.raquel.menulistas.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.raquel.menulistas.R;
import com.raquel.menulistas.beans.CamisaBean;
import com.raquel.menulistas.fragment.ListCamisasFragment;

public class CamisaActivity extends AppCompatActivity {

    private ImageView imgCamisa;
    private TextView txtDescripcion;
    private TextView txtPrecio;
    private TextView txtCantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisa);
         imgCamisa = (ImageView) findViewById(R.id.imgCamisa);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);
        txtPrecio = (TextView) findViewById(R.id.txtPrecio);
        txtCantidad = (TextView) findViewById(R.id.txtCantidad);

        CamisaBean camisaBean= (CamisaBean) getIntent().getSerializableExtra(ListCamisasFragment.CAMISA_KEY);

        txtCantidad.setText(String.valueOf(camisaBean.getCantidad()));
        txtPrecio.setText(String.valueOf(camisaBean.getPrecio()));
        txtDescripcion.setText(camisaBean.getDescripcion());
        imgCamisa.setImageDrawable(ContextCompat.getDrawable(this,camisaBean.getFoto()));

    }
}
