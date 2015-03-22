package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class AddressLineValidator implements Validator {
    public AddressLineValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String addressLine = object.toString();
        
        
        if(addressLine.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter an address");
            message.setSummary("Address cannot be left blank");
            throw new ValidatorException(message);
        }
        
    }
}
