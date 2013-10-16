package dkl.kshare;

import dkl.rideshare.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyPostsActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_posts);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_posts, menu);
        return true;
    }

}
