package com.ibrahimkuley.data.service;

import com.ibrahimkuley.data.entity.Article;

import java.util.List;

public interface ArticleService {

    public void addArticle(Article article);

    public void updateArtcile(Article article);

    public List<Article> articleList();

    public void deleteArticle(Article article);

    public Article getAtricleById(int id);
}
