package com.zjm.Dao.DaoImpl;

import com.zjm.Dao.IUserDao;
import com.zjm.entity.User;
import com.zjm.utils.CloseUtils;
import com.zjm.utils.DBUtils;
import org.apache.commons.beanutils.BeanUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements IUserDao {
    @Override
    public User checkUser(String username, String password) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = new User();
        Map<String,String> map = new HashMap<>();
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement("select * from user where username=? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while (rs.next()){
                map.put("id",rs.getString(1));
                map.put("username",rs.getString(2));
                map.put("password",rs.getString(3));
                map.put("sex",rs.getString(4));
                map.put("hobbies",rs.getString(5));
                map.put("phone",rs.getString(6));
                map.put("email",rs.getString(7));
                map.put("addrs",rs.getString(8));
                map.put("flag",rs.getString(9));
            }
            BeanUtils.populate(user,map);
            System.out.println(user.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int register(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        int i = 0;
        String sql = "INSERT INTO `step1`.`user`(" +
                "`username`,`password`,`sex`,`hobbies`," +
                "`phone`,`email`,`addrs`,`flag`)" +
                "VALUES(?,?,?,?,?,?,?,1)";

        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSex());
            ps.setString(4,user.getHobbies());
            ps.setString(5,user.getPhone());
            ps.setString(6,user.getEmail());
            ps.setString(7,user.getAddrs());
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            CloseUtils.closeAll(ps,connection);
        }
        return i;
    }
}
