package ie.coffeepal.coffeepal.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import butterknife.BindView;
import ie.coffeepal.coffeepal.R;
import ie.coffeepal.coffeepal.Utils.TransformCircle;

/**
 * Created by Tommy on 15/03/2017.
 */




public class UserProfileActivity extends AppCompatActivity {
    private final AppCompatActivity activity = UserProfileActivity.this;

    private int avatarSize;
    private String profilePhoto;


    @BindView(R.id.ivUserProfilePhoto)
    ImageView ivUserProfilePhoto;

    @BindView(R.id.UserProfileTabs)
    TabLayout UserProfileTabs;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        this.avatarSize = getResources().getDimensionPixelSize(R.dimen.user_profile_photo);
        this.profilePhoto = getString(R.string.user_profile_photo);

        Picasso.with(this)
                .load(profilePhoto)
                .placeholder(R.drawable.circle)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new TransformCircle())
                .into(ivUserProfilePhoto);


        setupTabs();
    }
    private void setupTabs(){
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));
        UserProfileTabs.addTab(UserProfileTabs.newTab().setIcon(R.drawable.logo));

    }

    }





