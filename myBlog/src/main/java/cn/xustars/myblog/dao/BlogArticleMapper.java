package cn.xustars.myblog.dao;

import cn.xustars.myblog.entity.BlogArticle;

import java.util.List;
import java.util.Map;

public interface BlogArticleMapper {

    BlogArticle queryById(Integer blogId);

    Integer queryTotal();

    void insert(BlogArticle blogArticle);

    void updateById(Integer blogId);

    void deleteBatch(List<Integer> blogIds);

    List<BlogArticle> queryList(Map<String, Object> map);

    List<BlogArticle> queryListByCondition(Map<String, Object> map);
}