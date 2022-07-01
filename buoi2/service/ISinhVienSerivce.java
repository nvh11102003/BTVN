
package buoi2.service;

import buoi2.model.SinhVien;
import java.util.ArrayList;

public interface ISinhVienSerivce {
    public Boolean addSinhVien(SinhVien sinhVien);
    
    public ArrayList<SinhVien> getList();
    
    public Boolean xoa(SinhVien sinhVien);
    
    public Boolean update(int viTri, SinhVien sinhVien);
    
    public ArrayList<SinhVien> timKiem(String ten);
}
