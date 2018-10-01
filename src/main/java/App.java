
import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import modelo.Pedido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caique
 */
public class App {

   
	private static final String DB_FILE = "zoodb.zdb";

	private PersistenceManager pm;
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private void listarPedidos(){
        
        	Extent<Pedido> pedidos = pm.getExtent(Pedido.class);
		
		for (Pedido pedido : pedidos) {
			System.out.println(">> - " + pedido.getCodigo());
		}
    }
    
    
}
