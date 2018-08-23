/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import web.login.database.Database;

/**
 *
 * @author safev
 */
public class UserDaoImpl extends Database implements UserDao{
    
    @Override
    public boolean checkLogin(String username, String password) {
        boolean result = false;
        String sql = "SELECT password FROM user"
                + " WHERE username = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                if (password.equals(rs.getString("password"))) {
                    result = true;
                }else{
                    result = false;
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
        public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        if(dao.checkLogin("admin", "admin")) {
            System.out.println("เข้าสู่ระบบสำเร็จ");
        } else {
            System.out.println("รหัสไม่ถูกต้อง");
        }
                
    }
    
}
