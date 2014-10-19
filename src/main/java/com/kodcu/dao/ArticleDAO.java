package com.kodcu.dao;

import com.kodcu.entity.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hikuley on 19.10.2014.
 */
@Repository(value = "articleDAO") //bean
public class ArticleDAO {

    @Autowired
    SessionFactory sessionFactory; // SessionFactory sınıfımızı otomatik olarak alır . . .

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Transactional
    public void saveArticle(Article article) {
        getSession().save(article);
    }

    @Transactional
    public void removeArticle(Article article) {
        getSession().delete(article);
    }

    @Transactional
    public List<Article> articleList() {
        return getSession().createQuery("from Article").list();
    }

}
