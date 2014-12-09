package com.ibrahimkuley.beans;

import com.ibrahimkuley.data.entity.Article;
import com.ibrahimkuley.data.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hikuley on 09.12.2014.
 */

public class ArticleMB {

    @Autowired
    private ArticleService articleService;

    public List<Article> getArticleList() {
        return articleService.articleList();
    }
}
