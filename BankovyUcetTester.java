package sk.richard.uloha12;


public class BankovyUcetTester {

	public static void main(String[] args) {
		
        SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
        BeznyUcet beznyUcet = new BeznyUcet(0);
       

        test(sporiaciUcet);
        
        System.out.println(sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakavany zostatok: 6300.0");
       
        test(beznyUcet);
        System.out.println(beznyUcet.getAktualnyZostatok());
        System.out.println("Ocakavany zostatok: 5996");

      
	}
	
	private static void test(BankovyUcet ucet)
    {
        for (int i = 1; i <= 5; i++)
        {
            if (i % 2 == 1)			// test na neparne i
            {
                ucet.vloz(i * 1000);
            }
            else
            {
                ucet.vyber(i * 500);
            }
        }
        ucet.koniecMesiaca();
    }

}
