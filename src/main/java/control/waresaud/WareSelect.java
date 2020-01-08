package control.waresaud;

import bean.Ware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.waredao;
import dao.waredaoimp;

import java.util.List;

public class WareSelect extends ActionSupport {

    private List<Ware> StudentList;
    private String num;

    public List<Ware> getStudentList() {
        return StudentList;
    }

    public String getNum() {
        return num;
    }

    public void setStudentList(List<Ware> studentList) {
        StudentList = studentList;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String execute() throws Exception {
        waredao stu = new waredaoimp();
        StudentList=stu.selectbynum(num);
        ActionContext.getContext().put("StudentList",StudentList);
        return SUCCESS;
    }
}
