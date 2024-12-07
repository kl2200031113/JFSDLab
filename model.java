package com.klef.jfsd.exam.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(nullable = false, unique = true)
    private Long orderId;
    @NotBlank(message = "Product Name is required")
    private String productName;
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;
    @NotNull(message = "Order Date is required")
    private LocalDate orderDate;
    @NotBlank(message = "Customer Name is required")
    private String customerName;
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
