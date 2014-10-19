package com.kodcu.main;

import com.kodcu.dao.ArticleDAO;
import com.kodcu.entity.Article;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by hikuley on 19.10.2014.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
        Article article = new Article();
        article.setAuthor("Halil ibrahim");
        article.setContent("Hayatin Anlami bence Ebru");
        article.setTitle("Ebruyu seviyorum olene kadar!");
        article.setCategory("Ask Mevsimi");
        articleDAO.saveArticle(article);


        List list = articleDAO.articleList();
        System.out.println("kayıtlar");
    }

}
