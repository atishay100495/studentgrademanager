package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class GenderValidator implements Validator {
    public GenderValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String gender = object.toString();
        
        
        if(gender.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please select a gender");
            message.setSummary("Gender field cannot be left blank");
            throw new ValidatorException(message);
        }
        
    }
}
