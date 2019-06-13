package com.zjm.Dao.DaoImpl;

import com.zjm.Dao.IGoodsDao;
import com.zjm.entity.Goods;
import com.zjm.utils.CloseUtils;
import com.zjm.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Goods> show() {
        Connection connection = null;
        List<Goods> list = new ArrayList<>();
        PreparedStatement  ps = null;
        ResultSet rs = null;

        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement("select * from goodsinfo where flag = 1");
            rs = ps.executeQuery();
            while (rs.next()){
                Goods goods = new Goods((int) rs.getShort(1)
                        , rs.getString(2), rs.getString(3)
                        , rs.getString(4), rs.getString(5)
                        , rs.getString(6), rs.getString(7));
                list.add(goods);

            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            CloseUtils.closeAll();
        }
        return list;
    }

    @Override
    public Goods get(int id) {
        return null;
    }

    @Override
    public int Modify(Goods goods) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int add(Goods goods) {
        return 0;
    }
}
