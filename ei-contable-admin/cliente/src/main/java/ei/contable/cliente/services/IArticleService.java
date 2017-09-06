package ei.contable.cliente.services;

import java.io.Serializable;
import java.util.List;

import ei.contable.cliente.mdl.dto.ArticleDTO;

public interface IArticleService extends Serializable {
     List<ArticleDTO> getAllArticles();
     ArticleDTO getArticleById(int articleId);
     boolean addArticle(ArticleDTO article);
     void updateArticle(ArticleDTO article);
     void deleteArticle(int articleId);
}
