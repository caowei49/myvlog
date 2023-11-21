package org.cw.blog.service;

import org.cw.blog.bean.Article;
import org.cw.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    public List<Article> getAllArticles() {
        return articleMapper.getAllArticle();
    }
}
