package service;

import java.util.List;

public class ClientWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueWS stub=new BanqueServiceService().getBanqueWSPort();
		double res=stub.conversionEuroToDA(900);
		System.out.println("resultat en DA est :"+res);
		Compte cp=stub.getCompte(2);
		System.out.println("le code du compte est :"+cp.getCode()+ ", le solde du compte est :"+cp.getSolde());
		
		System.out.println("----------------------------------------");
		List<Compte> cptes=stub.getCompts();
		for(Compte c:cptes){
			System.out.println("le code du compte est :"+c.getCode());
			System.out.println("le solde du compte est :"+c.getSolde());
		}
		
	}

}
