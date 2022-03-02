import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import asciiPanel.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        AsciiFont asciiFont = context.getBean(AsciiFont.class);

        System.out.print(asciiPanel.getAsciiFont().getFontFilename());
    }
}
