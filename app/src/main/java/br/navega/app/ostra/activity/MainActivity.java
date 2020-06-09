package br.navega.app.ostra.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.example.myapplicationn.R;

import br.navegasaberes.app.fragments.ArtigosFragment;
import br.navegasaberes.app.fragments.BancoFragment;
import br.navegasaberes.app.fragments.CuriosidadesFragment;
import br.navegasaberes.app.fragments.HistoricoFragment;
import br.navegasaberes.app.fragments.InterCuidadosFragment;
import br.navegasaberes.app.fragments.ReceitasFragment;
import br.navegasaberes.app.fragments.CuidadosFragment;
import br.navegasaberes.app.fragments.VidaUtilFragment;
import br.navegasaberes.app.fragments.SettingsFragment;


public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  setupToolBar();

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout.isDrawerOpen(GravityCompat.START);
        drawerLayout.closeDrawer(GravityCompat.START);
        replaceFragment(new CuriosidadesFragment());


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.action_about: makeToastSlow(getString(R.string.desenvolvimento));

            break;
            case R.id.action_exit: finish();
            break;
            case R.id.action_share:

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);

            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_item_curiosidades:

               drawerLayout.isDrawerOpen(GravityCompat.START);
               drawerLayout.closeDrawer(GravityCompat.START);
               replaceFragment(new CuriosidadesFragment());
               break;
           /* case R.id.nav_item_ostraVidaUtil:
                makeToastFast("vida util");
                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new VidaUtilFragment());
                break;*/
            case R.id.nav_item_tamanho:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new ReceitasFragment());
                break;
                case R.id.nav_item_cuidados_ostra:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
               // startActivity(new Intent(this,InterCuidadosFragment.class));
                 replaceFragment(new InterCuidadosFragment());
                break;

           /* case R.id.nav_item_cuidados_ostra:
                makeToastFast("Cuidados com a ostra");
                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new CuidadosFragment());
                break;*/

            case R.id.nav_item_noticias:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new HistoricoFragment());
                break;
            case R.id.nav_item_settings:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new SettingsFragment());
            break;
            case R.id.nav_item_banco_de_ideias:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new BancoFragment());
                break;
            case R.id.nav_item_artigos:

                drawerLayout.isDrawerOpen(GravityCompat.START);
                drawerLayout.closeDrawer(GravityCompat.START);
                replaceFragment(new ArtigosFragment());
                break;

        }

        return true;
    }
    public void replaceFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction().replace(R.id.container4,frag, "TAG").commit();

    }


}
