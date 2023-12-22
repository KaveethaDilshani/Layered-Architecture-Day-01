package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.model.OrderListDTO;

import java.sql.SQLException;

public interface SQLQueryDAO {
    OrderListDTO orderList() throws SQLException, ClassNotFoundException;
}


