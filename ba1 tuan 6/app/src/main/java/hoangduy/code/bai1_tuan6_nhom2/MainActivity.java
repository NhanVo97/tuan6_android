package hoangduy.code.bai1_tuan6_nhom2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    ListView lvmonan;
    ArrayList<thongtin> mangmonan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvmonan = findViewById(R.id.listview);
        mangmonan  = new ArrayList<thongtin>();
        mangmonan.add(new thongtin(R.drawable.nam,"d","zz",true));
        adapterthongtin hihi = new adapterthongtin(
                MainActivity.this,
                R.layout.row_layout,
                mangmonan
        );

        lvmonan.setAdapter(hihi);


    }
}