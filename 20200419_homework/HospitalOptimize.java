package test.java;

public class HospitalOptimize {

	public static void main(String[] args) {
		int[] numDate = {3,1660,1750};
		//numDate[0]代表已经挂号的次数;numDate[1]代表上一次挂号的时间;numDate[2]代表这次去挂号的时间
		register(numDate);

	}
	public static void register(int[] numDate){
		
		int b = (int)(numDate[1]/100);
		int c = numDate[1]-b*100;
		int a = (int)(numDate[2]/100);
		int d = numDate[2]-a*100;				
		if(c>=60||d>=60){
			System.out.println("请输入正确的时间");
		}else{
			if(numDate[2]>=800 && numDate[2]<=2000){
				if(numDate[0]>3){
					System.out.println("今天您已经挂号三次，请明天再来");
				}else{
					if(a==b){
						if((numDate[2]-numDate[1])<=30){
							if(c<30){
								System.out.println("对不起距离上一次挂号时间不足30分钟请"+b+"点"+c+"分再来挂号");	
							}else{
								System.out.println("对不起距离上一次挂号时间不足30分钟请"+(b+1)+"点"+(c-30)+"分再来挂号");				
							}
						}else{
							System.out.println("您在"+a+"点"+d+"分成功挂号");
						}
					}else{
						if((numDate[2]-numDate[1])<=70){
							if(c<30){
								System.out.println("对不起距离上一次挂号时间不足30分钟请"+b+"点"+c+"分再来挂号");	
							}else{
								System.out.println("对不起距离上一次挂号时间不足30分钟请"+(b+1)+"点"+(c-30)+"分再来挂号");				
							}
						}else{
							System.out.println("您在"+a+"点"+d+"分成功挂号");
						}

					}
				}
			}else{
				System.out.println("现在不在医院工作时间内，请8:00~20;00再来");				
			}		
		}	
	}

}
