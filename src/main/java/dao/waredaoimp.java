package dao;

import bean.ST;
import bean.Ware;
import bean.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class waredaoimp implements waredao {

    String url = "jdbc:hsqldb:hsql://localhost";
    String driver = "org.hsqldb.jdbcDriver";
    String user = "sa";
    String pass = "";

    public boolean user(String username, String password) throws Exception {

        boolean flag = false;
        Class.forName(driver);
        String sql = "select * from USER_INFO where NAME=? and PASS =?";
        flag = isFlag(username, password, sql);
        return flag;
    }

    private boolean isFlag(String username, String password, String sql) throws SQLException {
        boolean flag;
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                flag = rs.next();
            }
        }
        return flag;
    }

    public boolean admin(String adminname,String adminpass) throws Exception{
        boolean flag = false;
        Class.forName(driver);
        String sql = "select * from ADMIN_INFO where NAME=? and PASS =?";
        flag = isFlag(adminname, adminpass, sql);
        return flag;
    }

    public boolean wareinter(String name) throws Exception{

        boolean flag;
        Class.forName(driver);
        String sql = "select * from WARE_INFO where NUM=?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, name);
            try (ResultSet rs = pstmt.executeQuery()) {
                flag = rs.next();
            }
        }
        return flag;


    }


    public boolean zhanghao(String username) throws Exception {

        boolean flag = false;
        Class.forName(driver);
        String sql = "select * from USER_INFO where NAME=?";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                flag = rs.next();
            }
        }
        return flag;
    }

    public int zhuce(user usera) throws Exception
    {
        int flags = 0;
        Class.forName(driver);
        String sql = "insert into USER_INFO VALUES(?,?,?,?,?)";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pret = con.prepareStatement(sql);

            pret.setString(1, usera.getName());
            pret.setString(2, usera.getPass());
            pret.setString(3, usera.getEmail());
            pret.setString(4, usera.getTel());
            pret.setString(5, usera.getAddr());
            pret.execute();
            flags = pret.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flags;
    }


    public List<Ware> ShowByPage(int pagenow, int pagesize) throws Exception{
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        List<Ware> list=new ArrayList<Ware>();

        String sql="select * from WARE_INFO order by NUM limit ?,?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (pagenow*pagesize-pagesize));
            ps.setInt(2, pagesize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ware wa = new Ware();
                wa.setNum(rs.getString("num"));
                wa.setName(rs.getString("name"));
                wa.setType(rs.getString("type"));
                wa.setPrice(rs.getString("price"));
                wa.setRootate(rs.getString("rootate"));
                wa.setStock(rs.getString("stock"));
                list.add(wa);

            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Exception");

        }

        return list;
    }


    public int count()throws Exception{
        int  count=0;
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        String sql="select count(*) from WARE_INFO";
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                count=rs.getInt(1);
            }
            rs.close();
            conn.close();

        } catch (Exception e) {

        }
        return count;
    }


    public List<ST> shopshow(int pagenow, int pagesize) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        List<ST> list = new ArrayList<ST>();

        String sql = "select * from ST_INFO order by STNUM limit ?,?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (pagenow * pagesize - pagesize));
            ps.setInt(2, pagesize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ST stcd = new ST();
                stcd.setStnum(rs.getString("stnum"));
                stcd.setNum(rs.getString("num"));
                stcd.setName(rs.getString("name"));
                stcd.setType(rs.getString("type"));
                stcd.setPrice(rs.getString("price"));
                stcd.setRootate(rs.getString("rootate"));
                stcd.setStstock(rs.getString("ststock"));
                list.add(stcd);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");

        }
        return  list;
    }




    public int shopcount()throws Exception{
        int  count=0;
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        String sql="select count(*) from ST_INFO";
        try {
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                count=rs.getInt(1);
            }
            rs.close();
            conn.close();

        } catch (Exception e) {

        }
        return count;
    }






    public int wareadd(Ware wareb) throws Exception{

        int flags = 0;

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sql = "insert into WARE_INFO VALUES(?,?,?,?,?,?)";
        try {

            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, wareb.getNum());
            pres.setString(2, wareb.getName());
            pres.setString(3, wareb.getType());
            pres.setString(4, wareb.getPrice());
            pres.setString(5, wareb.getRootate());
            pres.setString(6, wareb.getStock());
            pres.execute();
            flags = pres.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;

    }


    public boolean waredel(String num) throws Exception {
        boolean isSuc = false;
        String sql = "delete from WARE_INFO where NUM = ?";
        Class.forName(driver);
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, num);
            int row = pstmt.executeUpdate();
            if (row > 0) {
                isSuc = true;
            }
        }
        return isSuc;
    }

    public void wareupdate(Ware warec) throws Exception{
        Class.forName(driver);
        String sql = "update WARE_INFO set name ='" +warec.getName() + "', TYPE='" + warec.getType() + "',PRICE='" + warec.getPrice() + "',rootate='" + warec.getRootate() + "',STOCK='" + warec.getStock() +"' where NUM = '" + warec.getNum() + "'";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List selectbynum(String num) throws Exception {

        List st = new ArrayList();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlselect = "select * from WARE_INFO where num='" + num + "'";
        PreparedStatement pref = con.prepareStatement(sqlselect);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            Ware wareb= new Ware();
            wareb.setNum(rst.getString("num"));
            wareb.setName(rst.getString("name"));
            wareb.setType(rst.getString("type"));
            wareb.setPrice(rst.getString("price"));
            wareb.setRootate(rst.getString("rootate"));
            wareb.setStock(rst.getString("stock"));
            st.add(wareb);
        }
        return st;

    }

    public List selectbytype(String type) throws Exception {

        List st = new ArrayList();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlselect = "select * from WARE_INFO where TYPE='" + type + "'";
        PreparedStatement pref = con.prepareStatement(sqlselect);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            Ware wareb= new Ware();
            wareb.setNum(rst.getString("num"));
            wareb.setName(rst.getString("name"));
            wareb.setType(rst.getString("type"));
            wareb.setPrice(rst.getString("price"));
            wareb.setRootate(rst.getString("rootate"));
            wareb.setStock(rst.getString("stock"));
            st.add(wareb);
        }
        return st;

    }

    public List opindex() throws Exception{
        List st = new ArrayList();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sql = "select TYPE from WARE_INFO group by TYPE" ;
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            Ware wareb= new Ware();
            wareb.setType(rst.getString("type"));
            st.add(wareb);
        }
        return st;

    }

    public int opcount() throws Exception{
        int i = 0;
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sql = "select count(*) from (select TYPE from WARE_INFO group by TYPE);" ;
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            i=Integer.parseInt(rst.getString("C1"));
        }
        return i;

    }

    public List selectbyname(String name) throws Exception {

        List st = new ArrayList();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlselect = "select * from WARE_INFO where NAME like '%" + name + "%'";
        PreparedStatement pref = con.prepareStatement(sqlselect);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            Ware use= new Ware();
            use.setNum(rst.getString("num"));
            use.setName(rst.getString("name"));
            use.setType(rst.getString("type"));
            use.setPrice(rst.getString("price"));
            use.setRootate(rst.getString("rootate"));
            use.setStock(rst.getString("stock"));
            st.add(use);
        }
        return st;

    }

    public List selectbyprice(int pricea,int priceb) throws Exception{
        List st = new ArrayList();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlselect = "SELECT * FROM WARE_INFO where PRICE <"+priceb+" and PRICE>"+pricea+"";
        PreparedStatement pref = con.prepareStatement(sqlselect);
        ResultSet rst = pref.executeQuery();

        while (rst.next())
        {
            Ware use= new Ware();
            use.setNum(rst.getString("num"));
            use.setName(rst.getString("name"));
            use.setType(rst.getString("type"));
            use.setPrice(rst.getString("price"));
            use.setRootate(rst.getString("rootate"));
            use.setStock(rst.getString("stock"));
            st.add(use);
        }
        return st;

    }


    public void wareshopadd(ST st) throws Exception{

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sql = "insert into ST_INFO VALUES(?,?,?,?,?,?,?)";
        try {

            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, st.getStnum());
            pres.setString(2, st.getNum());
            pres.setString(3, st.getName());
            pres.setString(4, st.getType());
            pres.setString(5, st.getPrice());
            pres.setString(6, st.getRootate());
            pres.setString(7, st.getStstock());
            pres.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql2 = "update WARE_INFO set STOCK = STOCK - "+st.getStstock()+" where NUM = '" + st.getNum() + "'";
        System.out.println(sql2);
        try {
            PreparedStatement pstmt = con.prepareStatement(sql2);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }


    }

    public void wareshopdel(String num) throws Exception {
        String sql = "delete from ST_INFO where STNUM = ?";
        Class.forName(driver);
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, num);
            int row = pstmt.executeUpdate();
        }
    }


}
