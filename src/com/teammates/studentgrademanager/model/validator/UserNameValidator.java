package com.teammates.studentgrademanager.model.validator;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class UserNameValidator implements Validator {
    public UserNameValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String userName = object.toString();
        System.out.println(userName);
        List<String> database = new ArrayList<String>();
        
        //TODO
        //add usernames to database list
        
        
        boolean flag = false;
        for(String s: database) {
            if(s.equals(userName)) {
                System.out.println(s);
                flag=true;
                break;
            }
        }
        if(flag==true) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("User Name already exists");
            message.setSummary("Record already exists in database");
            throw new ValidatorException(message);
        }
        else {
            System.out.println("validated");
        }
        
    }
}
