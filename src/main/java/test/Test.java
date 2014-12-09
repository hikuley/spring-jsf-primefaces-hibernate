package test;

import com.ibrahimkuley.data.entity.Article;
import com.ibrahimkuley.data.service.ArticleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ArticleService service = (ArticleService) context.getBean("articleService");

        Article article=new Article();
        article.setAuthor("fewfwe");
        article.setCategory("fwefwe");
        article.setContent("fewfwefew");
        article.setTitle("fewfewfew");

        service.addArticle(article);


    }

}
