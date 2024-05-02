package exercicio12_heranca;

import java.util.ArrayList;
import java.util.List;

public class AppCaminhao {

	public static void main(String[] args) {
		List <CaminhaoBau> baus = new ArrayList();
		List <CaminhaoTanque> tanques = new ArrayList();
		
		baus.add(new  CaminhaoBau(11, "Volvo 123", 2020, 2000, 'T', 10, 2.20, 3.50));
		baus.add(new CaminhaoBau(12, "WV TURBO", 2021, 1800, 'T', 12, 2.20, 3.50));
		baus.add(new CaminhaoBau(13, "WV T1000", 2022, 2200, 'T', 14, 2.20, 3.8));
		
		
		tanques.add( new CaminhaoTanque(21, "Iveco Day", 2019, 3000, 'L',"Água"));
		tanques.add( new CaminhaoTanque(22, "MB 2000", 2021, 2500, 'L', "Combustível"));
	}

}
