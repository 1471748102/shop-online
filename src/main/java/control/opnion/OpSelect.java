package control.opnion;


import bean.Ware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;
import java.util.Map;


public class OpSelect extends ActionSupport {


    private List<Ware> TypeSelect;
    private String depart;

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public List<Ware> getTypeSelect() {
        return TypeSelect;
    }

    public void setTypeSelect(List<Ware> typeSelect) {
        TypeSelect = typeSelect;
    }

    public String execute() throws Exception {

        waredao stu = new waredaoimp();
        TypeSelect=stu.selectbytype(depart);
        Map session = ActionContext.getContext().getSession();
        session.put("depart",depart);
        session.put("TypeSelect",TypeSelect);
        System.out.println(depart+"4464464");
        return SUCCESS;

    }
}
