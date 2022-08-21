package android.example.wid_android_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        final TextView getPersonName = findViewById(R.id.pname);
//        final Switch swt = findViewById(R.id.switch1);
        getPersonName.setText(this.getIntent().getStringExtra("name"));

    }
}