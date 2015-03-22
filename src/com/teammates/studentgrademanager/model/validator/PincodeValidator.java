package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class PincodeValidator implements Validator {
    public PincodeValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String pincode = object.toString();
        
        
        if(pincode.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter a pincode");
            message.setSummary("Pincode cannot be left blank");
            throw new ValidatorException(message);
        }
        
        char[] nameArr = pincode.toCharArray();
        for(Character ch: nameArr) {
            if(!Character.isDigit(ch)) {
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                message.setDetail("Please enter a valid pincode");
                message.setSummary("Pincode must contain only digits");
                throw new ValidatorException(message);
            }
        }
        
    }
}
