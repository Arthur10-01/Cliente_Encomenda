
package entidade;

import entidade.Enum.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private OrderStatus status;
    
   
    private Cliente cliente;
    private List <OrderItem> orderItem = new ArrayList<>();
    
    public Order(){
        
    }

    public Order( OrderStatus status,Date momento, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    
    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

   

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

  

    public Cliente getCliente() {
        return cliente;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }
    
    public void addItem(OrderItem item){
        this.orderItem.add(item);
    }
     public void removeItem(OrderItem item){
        this.orderItem.remove(item);
    }
     
     public Double total(){
         double sum = 0.0;
         for(OrderItem item: orderItem){
             sum += item.subTotal();
         }
         return sum;
     }
     public String toString(){
         StringBuilder text = new StringBuilder();
         text.append("Resumo do pedido:"+"\n");
         text.append("Momento: "+sdf.format(momento)+"\n");
         text.append("Status: "+status+"\n");
         text.append("Cliente: "+cliente+"\n");
        for (OrderItem item : orderItem) {
			text.append(item + "\n");
		}
		text.append("Total: $");
		text.append(String.format("%.2f", total()));
		return text.toString();
         
     }
}
