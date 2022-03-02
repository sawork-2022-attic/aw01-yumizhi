
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static public void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlconfig.xml");
        AsciiPanel asciiPanel8x8 = context.getBean("asciiPanel8x8", AsciiPanel.class);
        AsciiPanel asciiPanel9x16 = context.getBean("asciiPanel9x16", AsciiPanel.class);
        System.out.println(asciiPanel8x8.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel9x16.getAsciiFont().getFontFilename());
    }

}