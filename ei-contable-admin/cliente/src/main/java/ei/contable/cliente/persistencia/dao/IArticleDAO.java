package ei.contable.cliente.persistencia.dao;

import java.util.List;

import ei.contable.cliente.mdl.dto.ArticleDTO;
public interface IArticleDAO {
    List<ArticleDTO> getAllArticles();
    ArticleDTO getArticleById(int articleId);
    void addArticle(ArticleDTO article);
    void updateArticle(ArticleDTO article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}
 