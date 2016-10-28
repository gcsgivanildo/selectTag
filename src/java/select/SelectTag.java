/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package select;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author givanildo
 */
public class SelectTag extends SimpleTagSupport {

    private String nameLabel;
    private String nameSelect;
    private String id;
    private int qtdOption;
    private List<String> nameOption;

    


    public void setNameOption(List<String> nameOption) {
        this.nameOption = nameOption;
    }
    

    public void setNameLabel(String nameLabel) {
        this.nameLabel = nameLabel;
    }

    public void setNameSelect(String nameSelect) {
        this.nameSelect = nameSelect;
    }  

    public void setId(String id) {
        this.id = id;
    }

    public void setQtdOption(int qtdOption) {
        this.qtdOption = qtdOption;
    }

   


    
    @Override
    public void doTag() throws JspException, IOException {
       

        getJspContext().getOut().print("<label for="+nameLabel+"> "+nameLabel+": </label>");
        getJspContext().getOut().print(" <select id = '" + id + "' name = '" + nameSelect + "'>");
       
        
       
        for (Object option : nameOption) {
            getJspContext().getOut().print("<option value='" + option + "'>" + option+ "</option>");
        }
        
        getJspContext().getOut().print("</select>");

    }
}
