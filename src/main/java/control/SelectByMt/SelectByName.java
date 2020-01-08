package control.SelectByMt;

import bean.Ware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;

public class SelectByName extends ActionSupport {
    private List<Ware> waree;
    private  String name;

    public List<Ware> getWaree() {
        return waree;
    }

    public void setWaree(List<Ware> waree) {
        this.waree = waree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        waredao stu = new waredaoimp();
        waree=stu.selectbyname(name);
        ActionContext.getContext().put("waree",waree);
        return SUCCESS;
    }
}
