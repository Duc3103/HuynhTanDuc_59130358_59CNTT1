package SoDo;


public class Main12 {

    public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        
        HocSinh HS1 = new HocSinh("61KDTM", "Đá Bóng", "Nguyễn Văn A", 24, "Ninh Hòa", "0124681011");
        HocSinh HS2 = new HocSinh("60QTKD", "Bóng chuyền", "Nguyễn Văn B", 23, "Nha Trang", "0123456789");
        HocSinh HS3 = new HocSinh("59NTTS", "Hát", "Nguyễn Văn C", 22, "Vĩnh Thái", "1215186647");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        
        LH.inDSHS();
    }
    
}
