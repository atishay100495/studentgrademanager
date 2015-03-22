package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class NameValidator implements Validator {
    public NameValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String name = object.toString();
        
        if (object == null || "".equals(object.toString().trim()) || name.isEmpty())
        {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter a name");
            message.setSummary("Name cannot be left blank");
            throw new ValidatorException(message);
        }
        
        char[] nameArr = name.toCharArray();
        for(Character ch: nameArr) {
            if(Character.isDigit(ch)) {
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                message.setDetail("Please enter a valid name");
                message.setSummary("Name cannot contain digits");
                throw new ValidatorException(message);
            }
        }
        
    }
}
