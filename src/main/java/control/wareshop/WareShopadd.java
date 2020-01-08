package control.wareshop;

import bean.ST;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

public class WareShopadd extends ActionSupport {

    private ST st;
    private int flag;

    public ST getSt() {
        return st;
    }

    public void setSt(ST st) {
        this.st = st;
    }

    public String execute() throws Exception {
        waredao wg = new waredaoimp();
        wg.wareshopadd(st);
        return SUCCESS;

    }
}
