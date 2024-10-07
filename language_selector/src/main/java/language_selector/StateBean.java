package language_selector;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "stateBean")
@SessionScoped
public class StateBean {
	private String selectedState;
	private String language;
	
	public String getSelectedState() {
		return selectedState;
	}
	
	public void setSelectedState(String selectedState) {
        this.selectedState = selectedState;
    }

    // Getter for language
    public String getLanguage() {
        return language;
    }

    // Value Change Listener method
    public void stateChanged(ValueChangeEvent event) {
    	selectedState = event.getNewValue().toString();
        if (selectedState != null) {
            switch (selectedState) {
                case "West Bengal":
                    language = "Bangla";
                    break;
                case "Assam":
                    language = "Assami";
                    break;
                case "Jammu Kashmir":
                    language = "Jammui";
                    break;
                case "Panjab":
                    language = "Panjabi";
                    break;
                default:
                    language = "Unknown";
                    break;
            }
        } else {
            language = "Please select a state.";
        }
    }
}
