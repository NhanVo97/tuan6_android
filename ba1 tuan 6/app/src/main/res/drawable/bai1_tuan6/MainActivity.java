package hoangduy.code.bai1_tuan6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvmonan;
    ArrayList<hoangduy.code.bai1_tuan6.thongtin> mangmonan;
    TextView idd, ten;
    Button themnhanvien;
    RadioButton nutnam, nutnu;
    CheckBox nutcheck;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        themnhanvien = findViewById(R.id.them);
        idd = findViewById(R.id.idneduy);
        ten = findViewById(R.id.tenneduy);
        lvmonan = findViewById(R.id.listview);
        nutnam = findViewById(R.id.nam);
        nutnu = findViewById(R.id.nu);
       // nutcheck = findViewById(R.id.check);
        mangmonan = new ArrayList<hoangduy.code.bai1_tuan6.thongtin>();


        themnhanvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nutnam.isChecked()) {
                    mangmonan.add(new hoangduy.code.bai1_tuan6.thongtin(R.drawable.nam, idd.getText().toString(), ten.getText().toString(), false));

                } else {
                    mangmonan.add(new hoangduy.code.bai1_tuan6.thongtin(R.drawable.nu, idd.getText().toString(), ten.getText().toString(), false));
                }
                hoangduy.code.bai1_tuan6.adapterthongtin hihi = new hoangduy.code.bai1_tuan6.adapterthongtin(
                        hoangduy.code.bai1_tuan6.MainActivity.this,
                        R.layout.row_layout,
                        mangmonan
                );

                lvmonan.setAdapter(hihi);
            }

        });

        lvmonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View
                    view, int position, long id) {
                Toast.makeText(hoangduy.code.bai1_tuan6.MainActivity.this, "duydeptrai", Toast.LENGTH_SHORT).show();
                idd.setText(mangmonan.get(position).getMa());
                ten.setText(mangmonan.get(position).getChu());
                if (mangmonan.get(position).getNut() == true) {
                    nutnam.setChecked(true);
                } else {
                    nutnu.setChecked(false);
                }

            }
        });

        hoangduy.code.bai1_tuan6.adapterthongtin hihi = new hoangduy.code.bai1_tuan6.adapterthongtin(
                hoangduy.code.bai1_tuan6.MainActivity.this,
                R.layout.row_layout,
                mangmonan
        );

        lvmonan.setAdapter(hihi);


    }


}
