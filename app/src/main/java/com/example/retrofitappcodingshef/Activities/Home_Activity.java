package com.example.retrofitappcodingshef.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.retrofitappcodingshef.NavFragments.DashboardFragment;
import com.example.retrofitappcodingshef.NavFragments.ProfileFragment;
import com.example.retrofitappcodingshef.NavFragments.UsersFragment;
import com.example.retrofitappcodingshef.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bottomNavigationView = findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemReselectedListener(this);

        loadFragment(new DashboardFragment());//we want by default to show dashboard to user
    }


    @Override
    public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;//fragment khali ha jesy koi load ho g woh ajaye ga

        switch (menuItem.getItemId()){
            case R.id.Dashboard:
                fragment = new DashboardFragment();
                break;
            case R.id.Users:
                fragment = new UsersFragment();
                break;
            case R.id.Profile:
                fragment = new ProfileFragment();
                break;
        }

        if(fragment!=null){
            loadFragment(fragment);
        }

        return;
    }

        void loadFragment(Fragment fragment) {

        //to attach fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.relativelayoutHome,fragment).commit();

    }
}
