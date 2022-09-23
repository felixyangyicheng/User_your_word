package use_your_word.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import use_your_word.model.Produit;

public class ProduitListner implements ServletContextListener{

 
 public void contextInitialized(ServletContextEvent sce) {
		List<Produit> produits= new ArrayList<Produit>();
		
		for(int i=0; i<10; i++) {
			produits.add(new Produit("Number "+String.valueOf(i)));
		}
	 sce.getServletContext().setAttribute("produitList", produits);
 }

}
