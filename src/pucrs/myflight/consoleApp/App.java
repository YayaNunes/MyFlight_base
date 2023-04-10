package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

public class App {

	public static void main(String[] args) {

		CiaAerea LATAM = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea GOL = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea TAP = new CiaAerea("TP", "TAP Portugal");
		CiaAerea AD = new CiaAerea("AD", "Azul Linhas Aéreas");


		Geo geo = new Geo(-29.9939,-51.1711);//poa
		Aeroporto aeroportoPOA = new Aeroporto("POA", "Salgado Filho Intl Apt", geo);
		Geo geo1 = new Geo(-23.4356	,-46.4731);//SP
		Aeroporto aeroportoSP = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geo1);
		Geo geo2 = new Geo(38.7742	,-9.1342);//LISBON
		Aeroporto aeroportoLIS = new Aeroporto("LIS", "Lisbon", geo2);
		Geo geo3 = new Geo(25.7933,	-80.2906);//MIAMI
		Aeroporto aeroportoMM = new Aeroporto("MIA	", "Miami International Apt", geo3);

		Aeronave aeronave = new Aeronave("733","Boeing 737-300",140);
		Aeronave aeronave1 = new Aeronave("73G","Boeing 737-700",126);
		Aeronave aeronave2 = new Aeronave("380","Airbus Industrie A380",644);
		Aeronave aeronave3 = new Aeronave("764","Boeing 767-400",304);

		Rota rota = new Rota(AD, aeroportoLIS, aeroportoMM, aeronave3);

		Voo voo = new Voo(rota, null);

	}
}
