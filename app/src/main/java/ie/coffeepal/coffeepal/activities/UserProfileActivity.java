package ie.coffeepal.coffeepal.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import ie.coffeepal.coffeepal.R;
import ie.coffeepal.coffeepal.Utils.TransformCircle;

/**
 * Created by Tommy on 15/03/2017.
 */

import butterknife.BindView;

public class UserProfileActivity extends AppCompatActivity {

    private int avatarSize;
    private String profilePhoto;


    @BindView(R.id.userProfilePhoto)
    ImageView userProfilePhoto;

    @BindView(R.id.UserProfileTabs)
    TabLayout UserProfileTabs;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.avatarSize = getResources().getDimensionPixelSize(R.dimen.user_profile_photo);
        this.profilePhoto = getString(R.string.user_name);

        Picasso.with(this)
                .load(profilePhoto)
                .placeholder(R.drawable.circle)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new TransformCircle())
                .into(userProfilePhoto);

        setupTabs();
    }
    private void setupTabs(){
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));

    }

    }





