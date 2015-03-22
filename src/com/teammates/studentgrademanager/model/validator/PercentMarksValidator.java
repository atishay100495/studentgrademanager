package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class PercentMarksValidator implements Validator {
    public PercentMarksValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        
        
        
        if(object == null) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter percent marks");
            message.setSummary("Marks field cannot be left blank");
            throw new ValidatorException(message);
        }
        
        if(object!=null)
        {
            try{
            Double percentMarks = Double.parseDouble(object.toString());
            }
            catch(Exception e) {
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                message.setDetail("Please enter valid percent marks");
                message.setSummary("Marks cannot contain non-digits");
                throw new ValidatorException(message);
            }
        }
        
//        char[] nameArr = percentMarks.toCharArray();
//        for(Character ch: nameArr) {
//            if(!Character.isDigit(ch)) {
//                FacesMessage message = new FacesMessage();
//                message.setSeverity(FacesMessage.SEVERITY_ERROR);
//                message.setDetail("Please enter valid percent marks");
//                message.setSummary("Marks cannot contain non-digits");
//                throw new ValidatorException(message);
//            }
//        }
        
    }
}
