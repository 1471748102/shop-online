package control.SelectByMt;

import bean.Ware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;
import java.util.Map;

public class SeelectByPrice extends ActionSupport {

    private List<Ware> waref;
    private int pricea,priceb;

    public List<Ware> getWaref() {
        return waref;
    }

    public void setWaref(List<Ware> waref) {
        this.waref = waref;
    }

    public int getPricea() {
        return pricea;
    }

    public void setPricea(int pricea) {
        this.pricea = pricea;
    }

    public int getPriceb() {
        return priceb;
    }

    public void setPriceb(int priceb) {
        this.priceb = priceb;
    }

    public String execute() throws Exception {

        waredao stu = new waredaoimp();
        Map session = ActionContext.getContext().getSession();
        session.put("waref",waref);
        waref=stu.selectbyprice(pricea,priceb);
        return SUCCESS;
    }
}
