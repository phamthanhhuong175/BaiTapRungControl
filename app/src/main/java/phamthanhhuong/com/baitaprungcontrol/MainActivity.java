package phamthanhhuong.com.baitaprungcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText edtUser, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        edtUser=findViewById(R.id.edtUser);
        edtPassword=findViewById(R.id.edtPassword);
    }

    public void xuLyDangNhap(View view) {
        String user=edtUser.getText().toString();
        String pass=edtPassword.getText().toString();
        if(user.equals("admin")==false||user.equals("123")==false)
        {
            Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.laclac);
            edtUser.startAnimation(animation);
            edtPassword.startAnimation(animation);
        }
    }

    public void xuLyThoat(View view) {
        LinearLayout linearLayout=findViewById(R.id.activity_main);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.xoayxoay);
        linearLayout.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
