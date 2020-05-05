
public class CarInformation {
	private String brand;
	private String carModel;
	private Double price;
	private Double oilUsed;
	private Double distanceRunned;
	private Double oilVolume;
	private Double oilSurplus;
	
	
	//get,set参数
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getOilUsed() {
		return oilUsed;
	}
	public void setOilUsed(Double oilUsed) {
		this.oilUsed = oilUsed;
	}
	public Double getDistanceRunned() {
		return distanceRunned;
	}
	public void setDistanceRunned(Double distanceRunned) {
		this.distanceRunned = distanceRunned;
	}
	public Double getOilVolume() {
		return oilVolume;
	}
	public void setOilVolume(Double oilVolume) {
		this.oilVolume = oilVolume;
	}
	public Double getOilSurplus() {
		return oilSurplus;
	}
	public void setOilSurplus(Double oilSurplus) {
		this.oilSurplus = oilSurplus;
	}
	
	
	//构造方法
	public CarInformation(String brand, String carModel, Double price, Double oilUsed, Double distanceRunned, Double oilVolume
			) {
		this.brand = brand;
		this.carModel = carModel;
		this.price = price;
		this.oilUsed = oilUsed;
		this.distanceRunned = distanceRunned;
		this.oilVolume = oilVolume;
		
	}
	
	
	
}
