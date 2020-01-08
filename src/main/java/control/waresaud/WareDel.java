package control.waresaud;

import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

public class WareDel extends ActionSupport {

    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String execute() throws Exception {

        boolean isSuc = false;
        waredao stu = new waredaoimp();
        try {
            isSuc = stu.waredel(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuc? SUCCESS : ERROR;

    }
}
