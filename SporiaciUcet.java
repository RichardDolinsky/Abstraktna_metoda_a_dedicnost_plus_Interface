package sk.richard.uloha12;

public class SporiaciUcet extends BankovyUcet implements Cislo {
	private double urokovaSadzba;
	private double suma;
	private double urokSuma;
	
	public SporiaciUcet(double urokovaSadzba) {
		//super(0);
		this.urokovaSadzba = urokovaSadzba;
		
	}
	public double getUrokovaSadzba() {
		System.out.println( urokovaSadzba);
		//urokovaSadzba=urokSuma;
		return urokovaSadzba ;
	}
	
	public void zapisUrok() {
		suma = getAktualnyZostatok()* urokovaSadzba/100;
		vloz(suma);
	}
	@Override
	public double getCislo() {
		// TODO Auto-generated method stub
		return urokovaSadzba;
	}

	
	
	

}
