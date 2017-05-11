package com.hackingperu.tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nombre=(TextView)findViewById(R.id.txtnombre);
        final TextView direccion=(TextView)findViewById(R.id.txtdireccion);

        Button agregar=(Button)findViewById(R.id.btnagregar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TableLayout lista=(TableLayout)findViewById(R.id.lista);
                String[]cadena={nombre.getText().toString(),direccion.getText().toString()};
                TableRow row=new TableRow(getBaseContext());
                TextView textView;
                for(int i=0; i<2;i++){
                    textView=new TextView(getBaseContext());
                    textView.setGravity(Gravity.CENTER_VERTICAL);
                    textView.setPadding(15,15,15,15);
                    textView.setBackgroundResource(R.color.colorPrimary);
                    textView.setText(cadena[i]);
                    textView.setTextColor(Color.WHITE);
                    row.addView(textView);

                }
                lista.addView(row);
            }
        });

    }
}
