package org.cw.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cw.blog.bean.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> getAllArticle();
}
