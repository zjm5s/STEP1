package com.zjm.Dao;

import com.zjm.entity.Goods;

import java.util.List;

public interface IGoodsDao {
    List<Goods> show();
    Goods get(int id);
    int Modify(Goods goods);
    int delete(int id);
    int add(Goods goods);
}
