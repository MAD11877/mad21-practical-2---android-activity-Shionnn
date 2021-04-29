package sg.edu.np.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create");
        User user1 = new User("Lester","Very Handsome",123,false);
        View image = findViewById(R.id.imageView3);
        Button follow = findViewById(R.id.button_follow);
        TextView name = findViewById(R.id.textView_name);
        TextView desc = findViewById(R.id.textView_desc);
        name.setText(user1.name);
        desc.setText(user1.description);

        if (user1.followed) {
            follow.setText("unfollow");
        }
        else{
            follow.setText("follow");
        }
        follow.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!user1.followed) {
                    follow.setText("follow");
                    user1.followed = true;
                    if (user1.followed) {
                        follow.setText("unfollow");
                    }
                    else{
                        follow.setText("follow");
                    }
                }
                else{
                    follow.setText("unfollow");
                    user1.followed = false;
                    if (user1.followed) {
                        follow.setText("unfollow");
                    }
                    else{
                        follow.setText("follow");
                    }
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }

}