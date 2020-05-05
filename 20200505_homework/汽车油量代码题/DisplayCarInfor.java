
public class DisplayCarInfor {

	public static void main(String[] args) {

		//人为设置car的里程数、油耗、油箱容积、价格、品牌、车型信息
		CarInformation carInformation = new CarInformation("宝马","530",200000.0,20.6,1000.0,600.0);
		
		//计算剩余油量
		double surplusOil = calculateOilSurplus(carInformation);
		
		//显示car的所有信息
		displayCarInfor(carInformation,surplusOil);
			

	}
	
	static void displayCarInfor(CarInformation carInformation,double surplusOil){
		
		//输出car的各种信息
		System.out.println("车的信息:");
		System.out.println("车型:"+carInformation.getBrand());
		System.out.println("价格:"+carInformation.getPrice());
		System.out.println("油耗:"+carInformation.getOilUsed());
		System.out.println("里程数:"+carInformation.getDistanceRunned());
		System.out.println("油箱容积:"+carInformation.getOilVolume());
		System.out.println("剩余油量:"+surplusOil);	
	}
	
	static double calculateOilSurplus(CarInformation carInformation){
		//计算剩余油量
		double tempt = carInformation.getOilVolume()-carInformation.getDistanceRunned()/100*carInformation.getOilUsed();
		return tempt;
	}

}
