package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	
	public double conversion (double montant) {
		 return montant*3.36;
	}
	public Compte getCompte(int code) {
		return new Compte(code, 0, new Date());
		
	}
	List<Compte> getComptes(){
		List<Compte> list = new ArrayList<>();
		Date d = new Date(12, 01, 23);
		Compte cmt = new Compte(0, 100.6, d);
		list.add(cmt);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
