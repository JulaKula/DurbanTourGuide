package com.example.android.durbantourguide;


import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new InfoFragment()).commit();
        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout = findViewById(R.id.drawer_layout);



        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();


                        switch (menuItem.getItemId()) {
                            case R.id.nav_museums:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new MuseumFragment()).commit();
                                break;
                            case R.id.nav_restaurants:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new RestaurantFragment()).commit();
                                break;
                            case R.id.nav_info:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new InfoFragment()).commit();
                                break;
                            case R.id.nav_attractions:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new AttractionsFragment()).commit();
                                break;
                            case R.id.nav_nature:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new NatureFragment()).commit();
                                break;
//                            default:
//                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new InfoFragment()).commit();
//                                return true;

                        }

                        return true;
                    }
                });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


//                            if (menuItem.getItemId() == R.id.nav_museums) {
//                            }
//                            Fragment museumFragment = (Fragment) new MuseumFragment();
//                            android.app.FragmentManager fragmentManager = getSupportFragmentManager();
//                            fragmentManager.beginTransaction().replace(R.id.container, museumFragment);


//                            getSupportFragmentManager().beginTransaction().attach(MuseumFragment.instantiate())
//                            Log.i("MainActi","itemID" + menuItem.getItemId());
//                            Log.i("MainDruga", "r.id" + R.id.nav_museums);
//                            Intent intent = new Intent(MainActivity.this, MuseumFragment.class);
//                            startActivityFromFragment(MuseumFragment.class, intent, );


//                        MenuItem museums = findViewById(R.id.nav_museums);
//                        museums.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Intent intent = new Intent(MainActivity.this, MuseumFragment.class);
//                                startActivity(intent);       }
//                        });

// jak rozpisać ładnie onNavigationItemSelected
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_settings:
//                // User chose the "Settings" item, show the app settings UI...
//                return true;
//
//            case R.id.action_favorite:
//                // User chose the "Favorite" action, mark the current item
//                // as a favorite...
//                return true;
//
//            default:
//                // If we got here, the user's action was not recognized.
//                // Invoke the superclass to handle it.
//                return super.onOptionsItemSelected(item);
//
//        }
//    }