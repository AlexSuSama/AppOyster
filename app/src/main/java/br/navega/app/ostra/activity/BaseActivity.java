package br.navega.app.ostra.activity;

import android.drm.DrmStore;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.myapplicationn.R;
import br.com.livroandroid.androidutils.*;

public class BaseActivity extends AppCompatActivity {

    protected DrawerLayout drawerLayout;

    protected void setupToolBar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

    }
    //configura a nav
    protected void setupNavDrawer(){
        //draw layout
        final ActionBar actionBar = getSupportActionBar();
        //icone do menu do nav drawer
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        if(navigationView!= null && drawerLayout != null){
            //atualiza a iamgem e os textos do header

        }
    }

    public void makeToastFast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    public void makeToastSlow(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
