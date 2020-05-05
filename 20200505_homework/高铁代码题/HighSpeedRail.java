
public class HighSpeedRail {
	private static String[] seatKing = {"一等座","二等座"};
	private static String[] stationPlace = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
	private static float[] priceOne = {0,(float) 44.5,(float) 64.5,(float) 99.5,(float) 129.5,(float) 159.5,(float) 219.5};
    private static float[] priceTwo = {0,(float) 29.5,(float) 39.5,(float) 64.5,(float) 79.5,(float) 99.5,(float) 139.5};
	
    public static void main(String[] args) {
    	/* 用一个数组来表示高铁票,数组的第一个元素表示几等座,第二个元素表示终点站,这里还可以再创建一个元素来表示起点站
    	 * ,考虑到本例并没有用到起点站这个元素,所以并没有创建了,默认起点站南京
    	 */
		String[] selection = {"二等座","江"};
		//数组元素随着终点站和几等座位的变化而变化着
		printPrice(selection, seatKing, stationPlace, priceOne, priceTwo);
	}
	
	static void printPrice(String[] selection,String[] seatKing,String[] stationPlace,float[] priceOne,float[] priceTwo) {
		if (selection[0].equals("一等座")) {
			if (selection[1].equals(stationPlace[0])) {
				System.out.println("对不起,您输入的终点站与起点站是同一站,请重新输入终点站");
			}else if (selection[1].equals(stationPlace[1])) {
				System.out.println(priceOne[1]);
			}else if (selection[1].equals(stationPlace[2])) {
				System.out.println(priceOne[2]);
			}else if (selection[1].equals(stationPlace[3])) {
				System.out.println(priceOne[3]);
			}else if (selection[1].equals(stationPlace[4])) {
				System.out.println(priceOne[4]);
			}else if (selection[1].equals(stationPlace[5])) {
				System.out.println(priceOne[5]);
			}else if (selection[1].equals(stationPlace[6])) {
				System.out.println(priceOne[6]);
			}else {
				System.out.println("对不起,您选择的站不在本次列车行径站中,请在以下站点重新选择:");
				for(int i=0;i<=stationPlace.length;i++){
					System.out.print(stationPlace[i]+" ");
				}
			}
		}else if (selection[0].equals("二等座")) {
			if (selection[1].equals(stationPlace[0])) {
				System.out.println("对不起,您输入的终点站与起点站是同一站,请重新输入终点站");
			}else if (selection[1].equals(stationPlace[1])) {
				System.out.println(priceTwo[1]);
			}else if (selection[1].equals(stationPlace[2])) {
				System.out.println(priceTwo[2]);
			}else if (selection[1].equals(stationPlace[3])) {
				System.out.println(priceTwo[3]);
			}else if (selection[1].equals(stationPlace[4])) {
				System.out.println(priceTwo[4]);
			}else if (selection[1].equals(stationPlace[5])) {
				System.out.println(priceTwo[5]);
			}else if (selection[1].equals(stationPlace[6])) {
				System.out.println(priceTwo[6]);
			}else {
				System.out.println("对不起,您选择的站不在本次列车行径站中,请在以下站点重新选择:");
				for(int i=0;i<stationPlace.length;i++){
					System.out.print(stationPlace[i]+" ");
				}
			}
		}else {
			System.out.println("请输入正确的座位级别");
		}	
	}
}
