/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private String maHoaDon;
    private String maNguoiMua;
    private String maSach;
    private String ngayMua;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maNguoiMua, String maSach, String ngayMua) {
        this.maHoaDon = maHoaDon;
        this.maNguoiMua = maNguoiMua;
        this.maSach = maSach;
        this.ngayMua = ngayMua;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaNguoiMua() {
        return maNguoiMua;
    }

    public void setMaNguoiMua(String maNguoiMua) {
        this.maNguoiMua = maNguoiMua;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
    
    
}
