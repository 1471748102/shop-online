package control.opnion;

import bean.Ware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;

public class OpIndex extends ActionSupport {

    private List<Ware> WareGroup;
    private int i;

    public List<Ware> getWareGroup() {
        return WareGroup;
    }

    public void setWareGroup(List<Ware> wareGroup) {
        WareGroup = wareGroup;
    }

    public String execute() throws Exception {

        waredao stu = new waredaoimp();
        WareGroup=stu.opindex();
        i=stu.opcount();
        ActionContext.getContext().put("WareGroup",WareGroup);
        ActionContext.getContext().put("i",i);
        return SUCCESS;

    }
}
