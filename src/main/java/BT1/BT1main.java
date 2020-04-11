package BT1;

public class BT1Main {

    public static void main(String[] args) {
       NhanVien NV1 = new NhanVien("Huỳnh Tấn Đức",22,"31 Phạm Văn Đồng",200000,1000);
        NhanVien NV2 = new NhanVien("Huỳnh Tấn Tài",22,"31 Phạm Văn Đồng",200000,1000);
        
        NV1.getThongTin();
        NV2.getThongTin();
    }
}

