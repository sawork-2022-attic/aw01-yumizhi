package asciiPanel;

import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel();
    }

    @Bean
    public AsciiFont asciiFont(){
        return new AsciiFont("qbicfeet_10x10.png", 10, 10);
    }
}
