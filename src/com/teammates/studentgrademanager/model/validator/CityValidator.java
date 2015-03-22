package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class CityValidator implements Validator {
    public CityValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String city = object.toString();
        
        
        if(city.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please select a city");
            message.setSummary("City cannot be left blank");
            throw new ValidatorException(message);
        }
        
    }
}
