package Innoppl.Selenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class WebCrawler {
    private HashSet<String> links;

    public WebCrawler() {
        links = new HashSet<String>();
    }

    public void getPageLinks(String URL) {
        //3. Check if you have already crawled the URLs
        //(we are intentionally not checking for duplicate content in this example)
        if (!links.contains(URL)) {
            try {
                //4. (i) If not add it to the index
                if (links.add(URL)) {
                	
                	System.out.println(URL);
                	
                }
                    
                
               

                //2. Fetch the HTML code
                Document document = Jsoup.connect(URL).get();
                //3. Parse the HTML to extract links to other URLs
                
                  Elements linksOnPage = document.select("src");

                //5. For each extracted URL... go back to Step 4.
                
                	for (Element page : linksOnPage){

                	if((page.attr("src").contains("https://www.malabarbay.com/savannah-navy-laundry-bag.html")))
                    getPageLinks(page.attr("abs:src"));
                	
                }
            } catch (IOException e) {
                System.err.println("For '" + URL + "': " + e.getMessage());
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    public static void main(String[] args){
        //1. Pick a URL from the frontier
        new WebCrawler().getPageLinks("https://www.malabarbay.com/savannah-navy-laundry-bag.html");
    }

}


