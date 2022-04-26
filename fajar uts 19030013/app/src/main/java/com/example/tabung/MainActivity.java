package com.example.tabung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText txtjarijari, txttinggi;
    Button btnvolume;
    Button btnselimut;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtjarijari=findViewById(R.id.jarijari);
        txttinggi=findViewById(R.id.tinggi);
        btnvolume=findViewById(R.id.volume);
        btnselimut=findViewById(R.id.selimut);
        txthasil=findViewById(R.id.hasil);
        btnvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t;
                int r;
                float v;

                if(txtjarijari.getText().toString().isEmpty()){
                    txtjarijari.setError("Eror");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("Eror");
                    return;
                }

                r=Integer.parseInt(txtjarijari.getText().toString());
                t=Integer.parseInt(txttinggi.getText().toString());

                v= (float) (3.14*r*r*t);

                txthasil.setText(String.valueOf(v));
            }
        });
        btnselimut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t;
                int r;
                float v;

                if(txtjarijari.getText().toString().isEmpty()){
                    txtjarijari.setError("Eror");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("Eror");
                    return;
                }

                r=Integer.parseInt(txtjarijari.getText().toString());
                t=Integer.parseInt(txttinggi.getText().toString());

                v= (float) (2*3.14*r*t);

                txthasil.setText(String.valueOf(v));
            }
        });
    }
}
