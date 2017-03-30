package com.raquel.menulistas.test;

import com.raquel.menulistas.R;
import com.raquel.menulistas.beans.CamisaBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 03/03/2017.
 */

public class modelo {
    public static ArrayList<CamisaBean> getCamisa(){
        ArrayList<CamisaBean> camisas= new ArrayList<>();
        camisas.add(new CamisaBean(500, "Camisa roja", R.drawable.camisaroja, 10));
        camisas.add(new CamisaBean(100, "Camisa roja", R.drawable.camisaroja,510));
        camisas.add(new CamisaBean(300, "Camisa roja", R.drawable.camisaroja, 2));
        camisas.add(new CamisaBean(200, "Camisa roja", R.drawable.camisaroja, 20));

        return camisas;
    }
}
