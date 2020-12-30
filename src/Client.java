import java.time.LocalDate;

public class Client {
    private static LocalDate[] danhSachNgayChay = new LocalDate[]{}; //Đây là những ngày mà quán sẽ bán chay.
    public static void main(String[] args) {
        NhaBep nhaBep = null;
        LocalDate homNay = LocalDate.now();
        for (LocalDate ngayChay : danhSachNgayChay) {
            if (homNay.equals(ngayChay)) {
                //Nếu hôm nay là ngày chay thì nhà bếp chuyển sang làm món chay.
                nhaBep = new NhaBepNgayChay();
                break;
            }
        }
        //Nếu đây là ngày thường thì nhà bếp làm món mặn.
        if (nhaBep == null) {
            nhaBep = new NhaBepNgayThuong();
        }
        //Làm cơm chiên dương châu.
        MonAn comChienDuongChau = nhaBep.makeComChienDuongChau();
    }
}
