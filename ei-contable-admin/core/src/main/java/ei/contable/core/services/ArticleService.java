package ei.contable.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ei.contable.cliente.persistencia.dao.IArticleDAO;


import ei.contable.cliente.mdl.dto.ArticleDTO;
import ei.contable.cliente.services.IArticleService;
@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public ArticleDTO getArticleById(int articleId) {
		ArticleDTO obj = articleDAO.getArticleById(articleId);
		return obj;
	}
	@Override
	public List<ArticleDTO> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	@Override
	public synchronized boolean addArticle(ArticleDTO article){
		if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
			return false;
		} else {
			articleDAO.addArticle(article);
			return true;
		}
	}
	@Override
	public void updateArticle(ArticleDTO article) {
		articleDAO.updateArticle(article);
	}
	@Override
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}

}
