public class NhaBepNgayThuong extends NhaBep {
    @Override
    public MonAn makeComChienDuongChau() {
        return new ComChienDuongChauMan();
    }
}
