
package Principal;
import entidade.Cliente;
import entidade.Enum.OrderStatus;
import entidade.Order;
import entidade.OrderItem;
import entidade.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;


public class Principal {

   
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
       Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       System.out.println("Digite os Dados do cliente:");
       System.out.print("Name: ");
       String name = ler.nextLine();
         System.out.print("E-mail: ");
       String email= ler.nextLine();
         System.out.print("Data de Nascimento: ");
       Date dataDeNascimento = sdf.parse(ler.next());
        
      
       Cliente cliente = new Cliente (name,email,dataDeNascimento);
       
       
       System.out.println("Digite os dados da encomenda:");
       System.out.print("Status: ");
          
        OrderStatus status = OrderStatus.valueOf(ler.next());
        
        Order order = new Order(status,new Date(),cliente);
    
       System.out.print("Quantos itens serão pedidos: ");
       int n = ler.nextInt();
       
       for(int i=1;i<=n;i++){
           ler.nextLine();
           System.out.println("Digite os dados do "+i+"º item");
           System.out.print("Nome do produto: ");
           String nomeProduto = ler.nextLine();
          
            System.out.print("Preço do produto: ");
           double precoProduto = ler.nextDouble();
            Produto produto = new Produto(nomeProduto,precoProduto);
           
            System.out.print("Quantidade: ");
           int quantidade = ler.nextInt();
          
          
           OrderItem orderItem = new OrderItem(quantidade, precoProduto, produto);
          order.addItem(orderItem);
                     
       }
       
       System.out.print(order.toString());
       ler.close();
    }
   
}
