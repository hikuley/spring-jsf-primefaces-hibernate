package test;

import com.ibrahimkuley.service.ArticleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hikuley on 19.10.2014.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ArticleService service = (ArticleService) context.getBean("articleService");

        //service metodunu kullanarak her türlü dataya ulaşabiliriz

        System.out.println("Olay budur be kardeşim :)");

    }

}
