/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package select;


import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author givanildo
 */
public class SelectTag extends SimpleTagSupport {

    private String nameLabel;
    private String nameSelect;
    private String nameOption;
    private String nameId;
    private int qtdOption;

    public void setNameLabel(String nameLabel) {
        this.nameLabel = nameLabel;
    }

    public void setNameSelect(String nameSelect) {
        this.nameSelect = nameSelect;
    }

    public void setNameOption(String nameOption) {
        this.nameOption = nameOption;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public void setQtdOption(int qtdOption) {
        this.qtdOption = qtdOption;
    }

    public void doTag() throws JspException, IOException {
       

        getJspContext().getOut().print("<label for="+nameLabel+"> "+nameLabel+": </label>");
        getJspContext().getOut().print(" <select id = '" + nameId + "' name = '" + nameSelect + "'>");
        //for (int i = 1; i <nameOption.length(); i++) {
            for (int i = 1; i <=qtdOption; i++) {
           getJspContext().getOut().print("<option value='" + nameOption + "'>" + nameOption + "</option>");
         
        }
        getJspContext().getOut().print("</select>");

    }
}
