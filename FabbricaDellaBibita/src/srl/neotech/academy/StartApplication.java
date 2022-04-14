package srl.neotech.academy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cantina cantina=new Cantina();
		
		for(int i=0;i<100;i++) {
			
			Cisterna cisternaDaCreare ;
			
			int randomTip = ThreadLocalRandom.current().nextInt(1,3 + 1);
			
			if(randomTip==1) {
				cisternaDaCreare.setTipologia(Tipologiac.ACCIAIO);
			}
			else if(randomTip==2) {
				cisternaDaCreare.setTipologia(Tipologiac.ALLUMINIO);
		}
			else {
				cisternaDaCreare.setTipologia(Tipologiac.RAME);
			}
		
			int randomQuant = ThreadLocalRandom.current().nextInt(1,1000 + 1);
			
			cisternaDaCreare.setContent(randomQuant);
			
			int randomEvapXDay = ThreadLocalRandom.current().nextInt(1,5 + 1);
			cisternaDaCreare.setEvapXDay(randomEvapXDay);

			cantina.getCisterne().add(cisternaDaCreare);
			
			System.out.print("i");
			System.out.println(cisternaDaCreare);
	}
	}
}
