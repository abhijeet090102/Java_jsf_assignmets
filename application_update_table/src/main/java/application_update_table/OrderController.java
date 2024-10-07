package application_update_table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class OrderController {
    private List<OrderBean> orders;
    private OrderBean selectedOrder;

    // Initialize the list of orders
    public OrderController() {
        orders = new ArrayList<>();
        orders.add(new OrderBean("A0001", "Intel CPU", 700.00, 1));
        orders.add(new OrderBean("A0002", "Harddisk 10TB", 500.00, 2));
        orders.add(new OrderBean("A0003", "Dell Laptop", 11600.00, 8));
        orders.add(new OrderBean("A0004", "Samsung LCD", 5200.00, 3));
        orders.add(new OrderBean("A0005", "A4Tech Mouse", 100.00, 10));
    }

    // Getters and Setters
    public List<OrderBean> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderBean> orders) {
        this.orders = orders;
    }

    public OrderBean getSelectedOrder() {
        return selectedOrder;
    }

    public void setSelectedOrder(OrderBean selectedOrder) {
        this.selectedOrder = selectedOrder;
    }

    // Save the changes made to the selected order
    public void saveChanges() {
        // Find the order in the list by its orderNo and update it
        for (OrderBean order : orders) {
            if (order.getOrderNo().equals(selectedOrder.getOrderNo())) {
                order.setProductName(selectedOrder.getProductName());
                order.setPrice(selectedOrder.getPrice());
                order.setQuantity(selectedOrder.getQuantity());
                break; // Exit loop once the order is found and updated
            }
        }

        // Optionally, reset the selectedOrder after saving
        selectedOrder = null;
    }

    // Edit an order by selecting it
    public void editOrder(OrderBean order) {
        this.selectedOrder = order;
    }
}

