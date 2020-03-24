package gauravtomar.quotesapp;

public class NewsTemplate {

    private String newsMessage;
    private Boolean is_text_only; //this is our flag and depending on this we shall inflate different layouts;


    public NewsTemplate(String newsMessage, Boolean is_text_only) {
        this.newsMessage = newsMessage;
        this.is_text_only = is_text_only;
    }

    public String getNewsMessage() {
        return newsMessage;
    }

    public void setNewsMessage(String newsMessage) {
        this.newsMessage = newsMessage;
    }

    public Boolean getIs_text_only() {
        return is_text_only;
    }

    public void setIs_text_only(Boolean is_text_only) {
        this.is_text_only = is_text_only;
    }
}

