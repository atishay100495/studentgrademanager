package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class PhoneValidator implements Validator {
    public PhoneValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String phone = object.toString();
        
        
        if(phone.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter a phone number");
            message.setSummary("Phone number cannot be left blank");
            throw new ValidatorException(message);
        }
        
        char[] nameArr = phone.toCharArray();
        for(Character ch: nameArr) {
            if(!Character.isDigit(ch)) {
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                message.setDetail("Please enter a valid phone number");
                message.setSummary("Phone number must contain digits");
                throw new ValidatorException(message);
            }
        }
    }
}
