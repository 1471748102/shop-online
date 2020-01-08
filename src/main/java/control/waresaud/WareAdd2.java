package control.waresaud;

import bean.Ware;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

public class WareAdd2 extends ActionSupport {

    private Ware wareb;
    private int flags;

    public Ware getWareb() {
        return wareb;
    }

    public void setWareb(Ware wareb) {
        this.wareb = wareb;
    }

    public String execute() throws Exception {
        waredao wb = new waredaoimp();

        flags=wb.wareadd(wareb);
        if(flags!=0)
            return ERROR;
        else
            return SUCCESS;
    }
}
