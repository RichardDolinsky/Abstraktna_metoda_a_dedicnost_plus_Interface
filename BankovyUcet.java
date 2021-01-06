package sk.richard.uloha12;

public class BankovyUcet extends AbstraktnaMetoda implements Cislo {
	
	 private double aktualnyZostatok;

	    
	    /**
	        Vytvara bankovy ucet s nulovym pociatocnym zostatkom.
	    */
	    public BankovyUcet()
	    {
	        aktualnyZostatok = 0;
	    }

	    /**
	       Vytvara bankovy ucet s danym pociatocnym zostatkom.
	    */
	    public BankovyUcet(double pociatocnyZostatok)
	    {
	        this.aktualnyZostatok = pociatocnyZostatok;
	    }

	    /**
	       Vklada urcitu sumu penazi na ucet.
	       @param ciastka 
	    */
	    public void vloz(double ciastka)
	    {
	        this.aktualnyZostatok += ciastka;
	    }

	    /**
	       Vybera urcitu sumu penazi z uctu.
	       @param ciastka
	    */
	    public void vyber(double ciastka)
	    {
	        this.aktualnyZostatok -= ciastka;
	    }

	    /**
	       Vracia aktualny zostatok na bankovom ucte.
	       @return aktualny zostatok
	    */
	    public double getAktualnyZostatok()
	    {
	        return this.aktualnyZostatok;
	    }


		@Override
		public void koniecMesiaca() {
			double suma =getAktualnyZostatok()*getCislo()/100;
			suma +=getAktualnyZostatok();
			aktualnyZostatok=suma;
		//	System.out.println(poplatokZaUcet());
			double suma2= getAktualnyZostatok()-poplatokZaUcet();
			aktualnyZostatok=suma2;


		}
		
		
		@Override
		public double getCislo() {
			return 0;
		}

		@Override
		public double poplatokZaUcet() {
			return 0;
		}






	    /**
	       Abstraktna metoda, ktora vykonava potrebne ukony na konci mesiaca.
	    */
	   
	

}
