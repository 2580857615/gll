
public class HighSpeedRail {
	private static String[] seatKing = {"一等座","二等座"};
	private static String[] stationPlace = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
	private static float[] priceOne = {0,(float) 44.5,(float) 64.5,(float) 99.5,(float) 129.5,(float) 159.5,(float) 219.5};
    private static float[] priceTwo = {0,(float) 29.5,(float) 39.5,(float) 64.5,(float) 79.5,(float) 99.5,(float) 139.5};
	
    public static void main(String[] args) {
    	/* 用一个数组来表示高铁票,数组的第一个元素表示几等座,第二个元素表示终点站,这里还可以再创建一个元素来表示起点站
    	 * ,考虑到本例并没有用到起点站这个元素,所以并没有创建了,默认起点站南京
    	 */
		String[] selection = {"二等座","南京"};
		//数组元素随着终点站和几等座位的变化而变化着
		printPrice(selection, seatKing, stationPlace, priceOne, priceTwo);
	}
	
	static void printPrice(String[] selection,String[] seatKing,String[] stationPlace,float[] priceOne,float[] priceTwo) {
		if (selection[0].equals("一等座")) {
			if (selection[1].equals(stationPlace[0])) {
				System.out.println("对不起,您输入的终点站与起点站是同一站,请重新输入终点站");
			}else {
				/*flag用来作为一个标记,当for循环遍历一遍stationPlace后没有找到与selection中对应的站点,
				则可以判断selection所选不在staionPlace中
				 */
				int flag = 1;
				for(int i=1;i<stationPlace.length;i++){
					if (selection[1].equals(stationPlace[i])) {
						System.out.println(priceOne[i]);
						break;
					}
					flag++;
				}
				if (flag==stationPlace.length) {
					System.out.println("对不起,您选择的站不在本次列车行径站中,请在以下站点重新选择:");
					for(int j=0;j<stationPlace.length;j++){
						System.out.print(stationPlace[j]+" ");
				    }
				}
			}
		}else if (selection[0].equals("二等座")) {
			if (selection[1].equals(stationPlace[0])) {
				System.out.println("对不起,您输入的终点站与起点站是同一站,请重新输入终点站");
			}else {
				int flag = 1;
				for(int i=1;i<stationPlace.length;i++){
					if (selection[1].equals(stationPlace[i])) {
						System.out.println(priceTwo[i]);
						break;
					}
					flag++;
				}
				if (flag==stationPlace.length) {
					System.out.println("对不起,您选择的站不在本次列车行径站中,请在以下站点重新选择:");
					for(int j=0;j<stationPlace.length;j++){
						System.out.print(stationPlace[j]+" ");
				    }
				}
			}
		}else {
			System.out.println("请输入正确的座位级别");
		}	
	}
}
