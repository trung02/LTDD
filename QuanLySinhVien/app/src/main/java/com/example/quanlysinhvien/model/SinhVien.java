package com.example.quanlysinhvien.model;

public class SinhVien {
    private int MaSV;
    private String HoTen;
    private int GioiTinh;
    private String DienThoai;
    private String Email;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int gioiTinh, String dienThoai, String email) {
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        DienThoai = dienThoai;
        Email = email;
    }

    public SinhVien(int maSV, String hoTen, int gioiTinh, String dienThoai, String email) {
        MaSV = maSV;
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        DienThoai = dienThoai;
        Email = email;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int maSV) {
        MaSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String dienThoai) {
        DienThoai = dienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
