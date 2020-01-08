package control;

import bean.user;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

public class ZhuCe extends ActionSupport {
    private user usera;
    int flag=0;

    public user getUsera() {
        return usera;
    }

    public void setUsera(user usera) {
        this.usera = usera;
    }


    public void validate(){

        if(usera.getName()==null || usera.getName().length()==0 || usera.getPass() ==  null || usera.getPass().length()==0)
        {
            addFieldError("ukk",this.getText("Err!This Is Null!"));
        }

    }

    public String execute() throws Exception {

        waredao zhuce = new waredaoimp();

        if(zhuce.zhanghao(usera.getName()))
        {
            return ERROR;
        }
        else {
            flag = zhuce.zhuce(usera);
            if (flag != 0)
                return ERROR;
            else
                return SUCCESS;
        }
    }
}
