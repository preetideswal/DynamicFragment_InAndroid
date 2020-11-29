package com.example.dynamicallyfragment;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an object of your Fragment
                Dynamicfragment b = new Dynamicfragment();
                // Create an object of FragmentManager
                FragmentManager fm = getSupportFragmentManager();
                // Begin the transaction
                FragmentTransaction ft = fm.beginTransaction();
                // Replace the container with the new fragment
                ft.replace(R.id.fragment,b);
                ft.commit();
            }
        });
    }
}