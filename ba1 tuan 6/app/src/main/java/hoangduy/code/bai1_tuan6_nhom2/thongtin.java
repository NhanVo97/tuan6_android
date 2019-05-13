package hoangduy.code.bai1_tuan6_nhom2;

public class thongtin {
    int hinhanh;
    String ma;
    String chu;
    Boolean nut;

    public thongtin(int hinhanh, String ma, String chu, Boolean nut) {
        this.hinhanh = hinhanh;
        this.chu = chu;
        this.ma = ma;
        this.nut = nut;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public String getChu() {
        return chu;
    }

    public String getMa() {
        return ma;
    }

    public Boolean getNut() {
        return nut;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setChu(String chu) {
        this.chu = chu;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setNut(Boolean nut) {
        this.nut = nut;
    }
}
