package com.teammates.studentgrademanager.model;

import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlOutputText;

public class FailRegisterBeanClass {
    private HtmlOutputText outputText1;
    private HtmlForm form1;

    public FailRegisterBeanClass() {
    }

    public void setOutputText1(HtmlOutputText outputText1) {
        this.outputText1 = outputText1;
    }

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setForm1(HtmlForm form1) {
        this.form1 = form1;
    }

    public HtmlForm getForm1() {
        return form1;
    }
}
