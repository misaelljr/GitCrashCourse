package id_54899ba8e5646e372a5203d15e56af0a;

public class Strategy_2 extends Player{

	public Strategy_2(int name){
		this.totalCash = 0;
		this.name = name;
		this.strategy = 2;
	}

	public double declareDonationTo(Competitor c){
		return 0;
	}
}