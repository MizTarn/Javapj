package baitap;

public class baitap3_week4 {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public double LUONG_MAX;
	
	public boolean tangLuong(double i) {
		heSoLuong += i;
		if(tinhLuong() > LUONG_MAX) {
			System.out.println("Khong thuc hien duoc");
			heSoLuong -= i;
			return false;
		}
		else {
			return true;
		}
	}
	
	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}
	
	public void inTTin() {
		System.out.println("ten nhan vien la : " + tenNhanVien);
		System.out.println("Co luong la: " + tinhLuong());
	}
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	
	public void setTenNhanVien(String s) {
		tenNhanVien = s;
	}
	
	public double getLUONG_MAX() {
		return LUONG_MAX;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	
}
