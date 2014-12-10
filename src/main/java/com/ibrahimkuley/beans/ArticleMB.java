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

    private Article article;

    private String buttonAction;

    private boolean editable;

    public ArticleMB() { // Bean ilk oluşturulduğunda bir Article nesnesine ihtiyaç var kayıt yapa bilmek için
        if (article == null)//Yeni Kayıt
        {
            article = new Article();
            this.setButtonAction("Kaydet");
            this.setEditable(false);
        } else {
            this.setButtonAction("Güncelle");
            this.setEditable(true);
        }
    }

    public List<Article> getArticleList() {
        return articleService.articleList();
    }

    public String saveArticle() {
        articleService.addArticle(article);
        article = new Article();
        return null;
    }

    public String deleteArticle(Article article) {
        articleService.deleteArticle(article);
        this.setButtonAction("Kaydet");
        this.setEditable(false);
        article = new Article();
        return null;
    }

    public String editArticle() {
        articleService.updateArtcile(article);
        article = new Article();
        return null;
    }

    public String editPageArticle(Article article) {
        this.article = article;
        this.setButtonAction("Güncelle");
        this.setEditable(true);
        return null;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    /**/

    public String getButtonAction() {
        return buttonAction;
    }

    public void setButtonAction(String buttonAction) {
        this.buttonAction = buttonAction;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
