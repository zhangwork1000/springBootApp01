package com.evan.wj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evan.wj.pojo.Book;
import com.evan.wj.pojo.Category;

public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}