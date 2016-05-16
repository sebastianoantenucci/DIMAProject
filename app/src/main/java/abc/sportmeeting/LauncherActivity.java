package abc.sportmeeting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity {

    /*
    * This method is used to create this LauncherActivities which has the job to load the LogIn Activity
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent goToLogIn = new Intent(LauncherActivity.this, LoginActivity.class);
        startActivity(goToLogIn);
    }
}
