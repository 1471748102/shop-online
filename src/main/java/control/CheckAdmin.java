package control;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.Map;

public class CheckAdmin extends ActionSupport {

    private String adminname;
    private String adminpass;

    public String getAdminname() {
        return adminname;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public String execute() throws Exception {

        waredao ad = new waredaoimp();
        boolean flagadmin = ad.admin(adminname,adminpass);
        if(flagadmin){
            Map session= ActionContext.getContext().getSession();
            session.put("adminname",adminname);
        }
        return flagadmin? SUCCESS : ERROR;

    }
}
