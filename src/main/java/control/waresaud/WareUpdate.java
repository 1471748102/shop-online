package control.waresaud;

import bean.Ware;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;


public class WareUpdate extends ActionSupport {

    private Ware warec;

    public Ware getWarec() {
        return warec;
    }

    public void setWarec(Ware warec) {
        this.warec = warec;
    }

    public String execute() throws Exception {
        waredao data = new waredaoimp();
        data.wareupdate(warec);
        System.out.println(warec.getRootate());
        return SUCCESS;
    }
}
