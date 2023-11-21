package org.cw.blog.controller;

import org.cw.blog.bean.Article;
import org.cw.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/all")
    private List<Article> getAllArticles(){
        return articleService.getAllArticles();
    }
}
