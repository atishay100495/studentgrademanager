package com.teammates.studentgrademanager.model.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class PasswordValidator implements Validator {
    public PasswordValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uIComponent,
                         Object object) throws ValidatorException {
        String password = object.toString();
        
        
        if(password.isEmpty()) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setDetail("Please enter a password");
            message.setSummary("Password field cannot be left blank");
            throw new ValidatorException(message);
        }
        
        String confirmPassword = (String) uIComponent.getAttributes()
                        .get("confirmpasswordbox");
          // Let required="true" do its job.
          if (password == null || password.isEmpty() || confirmPassword == null
                || confirmPassword.isEmpty()) {
                        return;
          }
         
          if (!password.equals(confirmPassword)) {
                //uiInputConfirmPassword.setValid(false);
                throw new ValidatorException(new FacesMessage(
                        "Password must match confirm password."));
          }
    }
}
