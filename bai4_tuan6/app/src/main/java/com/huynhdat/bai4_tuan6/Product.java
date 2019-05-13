package com.huynhdat.bai4_tuan6;

public class Product extends Goods{
    //Lấy tham chiếu
    private Catalog Dmuc;

    public Catalog getDmuc() {
        return Dmuc;
    }

    public void setDmuc(Catalog dmuc) {
        Dmuc = dmuc;
    }

    public Product(String ma, String name, Catalog dmuc) {
        super(ma, name);
        Dmuc = dmuc;
    }

    public Product(String ma, String name) {
        super(ma, name);
    }
    public Product() {
        super();
    }

}
