package android.example.wid_android_proj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText personName = findViewById(R.id.person_name);
        final Button generateCard = findViewById(R.id.generate_card);

        generateCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, card.class);
                intent1.putExtra("name", personName.getText().toString());
                startActivity(intent1);
            }
        });
    }
}