package hoangduy.code.bai1_tuan6_nhom2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapterthongtin extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<thongtin> arrmonan;

    public adapterthongtin(Context context, int layout, List<thongtin> mangmonan) {
        myContext = context;
        myLayout = layout;
        arrmonan = mangmonan;

    }

    class monanne {
        ImageView hinh;
        TextView chu1, chu2;
        CheckBox check;

    }

    @Override
    public int getCount() {
        return arrmonan.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // dòng này để lấy file dong_sinh_vien.xml
//        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater = ((Activity) myContext).getLayoutInflater();
        // lấy trong dong_sinhvien.xml bằng converview
        monanne mon;

        if (convertView == null) {
            convertView = inflater.inflate(myLayout, null);
            // ảnh xạ và gán giá trị
            mon = new monanne();
            mon.hinh = convertView.findViewById(R.id.hinhanh);
            mon.chu1 = convertView.findViewById(R.id.idne);
            mon.chu2 = convertView.findViewById(R.id.chune);
            mon.check = convertView.findViewById(R.id.check);

            convertView.setTag(mon);

        } else {
            mon = (monanne) convertView.getTag();
        }
        mon.hinh.setImageResource(arrmonan.get(position).getHinhanh());
        mon.chu1.setText(arrmonan.get(position).getMa());
        mon.chu2.setText(arrmonan.get(position).getChu());
        mon.check.setChecked(arrmonan.get(position).getNut());

        return convertView;
    }
}
