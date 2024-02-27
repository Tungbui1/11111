package cau1;

public class Sach extends TaiLieu {
	private String tentacgia;
	private int sotrang;
	public Sach() {
		super();
	}
	
	public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,String tentacgia, int sotrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tentacgia = tentacgia;
		this.sotrang = sotrang;
		// TODO Auto-generated constructor stub
	}

	public String getTentacgia() {
		return tentacgia;
	}
	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	@Override
	public String toString() {
		return "Sach [tentacgia=" + tentacgia + ", sotrang=" + sotrang + ", toString()=" + super.toString() + "]";
	}
	

}
