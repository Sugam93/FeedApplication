package feedapp.app.com.feedapp;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splashThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                    finish();

                } catch (Exception e) {

                }
            }
        };
        splashThread.start();

        Animation anim= AnimationUtils.loadAnimation(this,R.anim.move_up);
        ImageView imageView= (ImageView) findViewById(R.id.splashImageView);
        imageView.setAnimation(anim);

        Animation animText= AnimationUtils.loadAnimation(this,R.anim.moveup_text);
        ImageView imageViewText= (ImageView) findViewById(R.id.splashImageViewText);
        imageViewText.setAnimation(animText);

    }
}
