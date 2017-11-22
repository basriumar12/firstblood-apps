package id.noidea.firstblood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void daftar(View v){
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
    }

    public void login(View v){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}
