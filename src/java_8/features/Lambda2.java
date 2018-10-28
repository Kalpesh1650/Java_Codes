package java_8.features;


interface Percentage{
	double calculate_Percentage(int amount,int cent_rate);
}

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Percentage cent_amount = new Percentage() {
			
			@Override
			public double calculate_Percentage(int amount,int cent_rate) {
				// TODO Auto-generated method stub
				return (amount*cent_rate)/100;
			}
		};*/
		int amount=1250;
		int cent_rate=12;
		Percentage p =(amount1,cent_rate1) -> (amount1*cent_rate1)/100;
		System.out.println(amount+ " % " +cent_rate +"= " + cal_percentage(p,1250,12));
			//cal_percentage((amount,cent_rate) -> System.out.println("Final Amount: "+(amount*cent_rate)/100),1250,12);	

	}
	private static double cal_percentage(Percentage p_instance,int amount,int cent_rate){
		return p_instance.calculate_Percentage(amount, cent_rate);
	}

}
