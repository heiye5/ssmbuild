package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

public interface BookService {
    //添加
    int addBook(Books books);

    //删除
    int deleteBook(int id);

    //修改
    int updateBook(Books books);

    //查询一个数据
    Books queryBookById(int id);

    //查询所有
    List<Books> queryAllBook();
}
