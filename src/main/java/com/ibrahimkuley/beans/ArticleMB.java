package com.ibrahimkuley.beans;

import com.ibrahimkuley.data.entity.Article;
import com.ibrahimkuley.data.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hikuley on 09.12.2014.
 */

public class ArticleMB implements Serializable {

    @Autowired
    private ArticleService articleService;

    private int id;

    private String author;

    private String content;

    private String title;

    private String category;

    public List<Article> getArticleList() {
        return articleService.articleList();
    }

    public String saveArticle() {

        Article article = new Article();
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        article.setCategory(category);
        articleService.addArticle(article);

        title = null;
        author = null;
        content = null;
        category = null;

        return null;

    }


    /*get set*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
