package cau1;

public class Bao extends TaiLieu {
	private int ngayphathanh;
	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,int ngayphathanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayphathanh = ngayphathanh;
	}
		// TODO Auto-generated constructor stub
	public int getNgayphathanh() {
		return ngayphathanh;
	}
	public void setNgayphathanh(int ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}
	@Override
	public String toString() {
		return "bao [ngayphathanh=" + ngayphathanh + ", toString()=" + super.toString() + "]";
	}
	

}
