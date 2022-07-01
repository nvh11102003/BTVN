
package buoi2.model;

public class SinhVien {
    private String tenSV;
    private double diem;
    private boolean gioiTinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String tenSV, double diem, boolean gioiTinh, String lop) {
        this.tenSV = tenSV;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public String hienThiGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }
    public String xepLoai(){
        if(getDiem() >= 5){
            return "Tốt";
        }else{
            return "Yếu";
        }
    }
}
