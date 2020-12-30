public class NhaBepNgayChay extends NhaBep {
    @Override
    public MonAn makeComChienDuongChau() {
        return new ComChienDuongChauChay();
    }
}
