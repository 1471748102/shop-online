package control.wareshop;

import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

public class WareShopCal extends ActionSupport {
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String execute() throws Exception {

        waredao stu = new waredaoimp();
        try {
            stu.wareshopdel(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
}
