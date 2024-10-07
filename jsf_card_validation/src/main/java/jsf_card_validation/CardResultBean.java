package jsf_card_validation;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cardResultBean")
@SessionScoped  
public class CardResultBean {
    private double amount;
    private String card;
    private String date;

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Method to process the payment
    public String processPayment() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Payment processed successfully!"));

        // Redirect to result page after successful processing
        return "result?faces-redirect=true"; // Ensure faces-redirect=true for post-redirect
    }
}
