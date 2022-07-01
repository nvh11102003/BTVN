
package buoi2.service.impl;

import buoi2.model.SinhVien;
import buoi2.service.ISinhVienSerivce;
import java.util.ArrayList;

public class SinhVienSerivceImpl implements ISinhVienSerivce{
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    @Override
    public Boolean addSinhVien(SinhVien sinhVien) {
        if(sinhVien == null){
            return false;
        }else{
            listSinhVien.add(sinhVien);
            return true;
        }
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return this.listSinhVien;
    }

    @Override
    public Boolean xoa(SinhVien sinhVien) {
        if(sinhVien == null){
            return false;
        }
        listSinhVien.remove(sinhVien);
        return true;
    }

    @Override
    public Boolean update(int viTri, SinhVien sinhVien) {
        if(sinhVien == null){
            return false;
        }
        listSinhVien.set(viTri, sinhVien);
        return true;
    }

    @Override
    public ArrayList<SinhVien> timKiem(String ten) {
        ArrayList<SinhVien> listOutPut = new ArrayList<>();
        for(SinhVien sinhVien : listSinhVien){
            if(sinhVien.getTenSV().contains(ten)){
                listOutPut.add(sinhVien);
            }
        }
        return listOutPut;
    }
    
}
