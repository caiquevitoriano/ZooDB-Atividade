
import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import modelo.ItemPedido;
import modelo.Pedido;
import modelo.PessoaJuridica;
import modelo.Produto;

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
    
     public void insert () {
            pm.currentTransaction().begin();
            
            PessoaJuridica cliente1 = new PessoaJuridica("111111111", 5000, 4,"Caique");
            
            Produto p1 = new Produto(1, "Celular", 800);
            Produto p2 = new Produto(2, "Computador", 2000);
            Produto p3 = new Produto(3, "Norbook", 2500);
            Produto p4 = new Produto(4, "Televisao", 2100);
            
            ItemPedido item1 = new ItemPedido(1,2,p1);
            ItemPedido item2 = new ItemPedido(2,1,p2);
            ItemPedido item3 = new ItemPedido(3,3,p3);
            ItemPedido item4 = new ItemPedido(4,4,p4);
                       
            Pedido pedido = new Pedido(4, cliente1);
            
            pedido.addItens(item1);
            pedido.addItens(item2);
            pedido.addItens(item3);
            pedido.addItens(item4);
                       
            pm.makePersistent(pedido);
            
            pm.currentTransaction().commit();            
       }

    private void listarPedidos() {

        pm.currentTransaction().begin();

        Extent<Pedido> pedidos = pm.getExtent(Pedido.class);

        for (Pedido pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getCodigo());
        }
    }

    public void pedidoCliente(int codigo) {

        pm.currentTransaction().begin();

        Extent<Pedido> pedidos = pm.getExtent(Pedido.class);

        System.out.println("Todos os pedidos do cliente :");

        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().getCodigo() == codigo) {
                
                System.out.println("Pedidos :" + pedido.getItens().toString());
            }
        }

    }
    
    public void clientesComprou (int codigoProduto) {
           
           pm.currentTransaction().begin();           
                     
           Extent<Pedido> pedidos = pm.getExtent(Pedido.class);
           
           System.out.println("Todos os pedidos dado o código de um cliente :");
            
            for (Pedido pedido : pedidos) {                 
                for(ItemPedido p : pedido.getItens()) {
                    if(p.getCodigo() == codigoProduto) {
                        System.out.println("Cliente :" + pedido.getCliente().getNome());
                    }
                }
            }
           
       }

}
