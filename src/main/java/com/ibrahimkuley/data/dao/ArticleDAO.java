package com.ibrahimkuley.data.dao;

import com.ibrahimkuley.data.entity.Article;

import java.util.List;

public interface ArticleDAO {

    public void addArticle(Article article);

    public void updateArtcile(Article article);

    public List<Article> articleList();

    public void deleteArticle(Article article);

    public Article getAtricleById(int id);
}
