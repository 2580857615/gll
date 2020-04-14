package test.java;

public class Hospital2 {

	public static void main(String[] args) {
		int num = 3; // 今天已经挂号的次数
		int dateBefore =1648; // 距离最近的上一次挂号时间
		int dateNow = 1709;    //本次去挂号的时间
		register(num,dateNow,dateBefore);
		
	}
	public static void register(int num,int dateNow,int dateBefore){
		
		if(dateNow>=800 && dateNow<=2000){
			if(num>3){
				System.out.println("今天您已经挂号三次，请明天再来");
			}else{
				int a = (int)(dateNow/100);
				int b = (int)(dateBefore/100);
				int c = dateBefore-b*100;
				int d = dateNow-a*100;
				if(a==b){
					if((dateNow-dateBefore)<=30){
						if(c<30){
							System.out.println("对不起距离上一次挂号时间不足30分钟请"+b+"点"+c+"分再来挂号");	
						}else{
							System.out.println("对不起距离上一次挂号时间不足30分钟请"+(b+1)+"点"+(c-30)+"分再来挂号");				
						}
					}else{
						System.out.println("您在"+a+"点"+d+"分成功挂号");
					}
				}else{
					if((dateNow-dateBefore)<=70){
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
				
				
		