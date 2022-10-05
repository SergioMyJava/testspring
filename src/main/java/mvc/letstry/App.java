package mvc.letstry;

import mvc.letstry.config.SpringConfir;
import mvc.letstry.service.TeastBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfir.class);
        TeastBean bean = context.getBean(TeastBean.class);//не понятно что сдесь происходит TeastBean.class-возвраащет полное имяя типа, не понял что это значит, бин днлается на основании имя.Class ?
        String nameFromBean = bean.getName();
        System.out.println( "Hello World!" + nameFromBean );
    }
}
