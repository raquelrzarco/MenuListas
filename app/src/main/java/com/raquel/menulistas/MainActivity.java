package com.raquel.menulistas;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.raquel.menulistas.fragment.ListCamisasFragment;
import com.raquel.menulistas.fragment.ListadoPantalonesFragment;
import com.raquel.menulistas.fragment.ListadoZapatosFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navView;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer= (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        navView = (NavigationView) findViewById(R.id.navView);

        setSupportActionBar(toolbar);
        navView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_adb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fm = getSupportFragmentManager();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
                case R.id.item_camisas:
                    ListCamisasFragment listCamisasFragment = ListCamisasFragment.newInstancia();
                    fm.beginTransaction().replace(R.id.container,listCamisasFragment).commit();
                    fm.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    break;

                case R.id.item_pantalones:
                    ListadoPantalonesFragment listadoPantalonesFragmentis = ListadoPantalonesFragment.newInstancia();
                    fm.beginTransaction().replace(R.id.container,listadoPantalonesFragmentis).commit();
                    fm.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    break;

                case R.id.item_zapatos:
                    ListadoZapatosFragment listadoZapatosFragment = ListadoZapatosFragment.newInstancia();
                    fm.beginTransaction().replace(R.id.container,listadoZapatosFragment).commit();
                    fm.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    break;
        }
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawer.closeDrawers();

        return true;
    }
}
