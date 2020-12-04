package apply;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello HTML</p></body></html>";
        Document document = Jsoup.parse(html);

        Elements elements = document.getElementsByTag("p");
        for(Element e : elements){
            System.out.println(e.text());
        }
    }
}
