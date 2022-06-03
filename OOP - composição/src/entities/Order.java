package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;


public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status; 
	
	private List<OrderItem> orderItems = new ArrayList<>();
	private Client client;
	
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void addItem (OrderItem item) {
		orderItems.add(item);
	}
	
	public void removeItem (OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		double counter = 0; 
		for (OrderItem item : orderItems) {
			counter += item.subTotal();
		}
		
		return counter;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ").append(sdf.format(moment) + "\n");
		sb.append("Order status: ").append(status + "\n");
		sb.append("Client: ").append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : orderItems) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $").append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
