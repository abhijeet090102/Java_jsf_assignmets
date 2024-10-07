package jsf_card_validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("creditCardValidator")  // Register the validator with an ID
public class CreditCardValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String creditCardNumber = value.toString();
        
        // Validate the credit card using the Luhn algorithm
        if (!isValidCreditCard(creditCardNumber)) {
            FacesMessage msg = new FacesMessage("Credit card validation failed.", "Invalid credit card number.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }

    // Luhn algorithm to validate credit card numbers
    private boolean isValidCreditCard(String cardNumber) {
        int total = 0;
        boolean alternate = false;
        
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            total += n;
            alternate = !alternate;
        }
        return (total % 10 == 0);
    }
}
