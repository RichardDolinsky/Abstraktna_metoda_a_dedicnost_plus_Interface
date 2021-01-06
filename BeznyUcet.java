package sk.richard.uloha12;

public class BeznyUcet extends BankovyUcet implements Cislo {
	private double zostatok;
	private int sumaZaUcet=4;
	private double suma;
	public BeznyUcet(double zostatok) {
		super(zostatok);
	
	}
	public void odcitajPoplatok() {
		//suma =getAktualnyZostatok()-sumaZaUcet;
		vyber(suma);
	}

	@Override
	public double poplatokZaUcet() {
		// TODO Auto-generated method stub
		return sumaZaUcet;
	}



}
