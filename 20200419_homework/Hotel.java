package test.java;

import javax.swing.table.TableStringConverter;

public class Hotel {

	public static void main(String[] args) {
		String[] selection = { "格林豪泰苏州火车站南广场拙政园商务酒店", "格雅苏州工业园区金鸡湖东方之门酒店", "格林豪泰苏州漕湖工业园智选酒店" };
		String[] roomtype = { "大床房", "标间", "豪华双床房"};
		int member = 0;                    // 0,1分别代表是否是会员,0为有,1为无
		int cash = 1;                      //0,1分别代表是否有代金券,0为有,1为无
		int i = 0;                         //0,1,2分别代表三种酒店
		int j = 1;                         //0,1,2分别代表大床房,标间,豪华双人房间
		Hotel(selection, member, cash, roomtype, i,j);

	}

	public static void Hotel(String[] selection,int member,int cash,String[] roomtype,int i,int j){
		String[] location ={"江苏省苏州市姑苏区人民路2156号","江苏省苏州工业园区星海街169号","江苏省苏州市相城区黄畦路3号"};
		if(i == 0){
			for(String b:roomtype){
				if(b.equals(roomtype[j])){
					if(member == 0){
						int[] price ={161,149,190};
						if(cash == 0){
							System.out.println("订单信息:");
							System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[j]+" "+"价格:"+(price[i]-20));
						}else{
							System.out.println("订单信息:");
							System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[j]+" "+"价格:"+price[i]);
						}								
					}else{
						int[] price ={189,169,209};
						if(cash == 0){
							System.out.println("订单信息:");
							System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[j]+" "+"价格:"+(price[i]-20));
						}else{
							System.out.println("订单信息:");
							System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[j]+" "+"价格:"+price[i]);
						}	
						
					}			
			   }
			}
		}else if(i == 1){
			if(member == 0){
				if(cash == 0){
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[2]+" "+"价格:319");
				}else{
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[2]+" "+"价格:339");
				}								
			}else{
				if(cash == 0){
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[2]+" "+"价格:379");
				}else{
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:"+roomtype[2]+" "+"价格:399");
				}			
			}			
		}else {
			if(member == 0){
				if(cash == 0){
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:高级大床房"+" "+"价格:151");
				}else{
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:高级大床房"+" "+"价格:161");
				}								
			}else{
				if(cash == 0){
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:高级大床房"+" "+"价格:179");
				}else{
					System.out.println("订单信息:");
					System.out.println("名称:"+selection[i]+" "+"地址:"+location[i]+" "+"房型:高级大床房"+" "+"价格:189");
				}			
			}			
		}	
	}
}
				
			
				
					
				
			
				
			
					
				
			
					
				
				
		
			
		



