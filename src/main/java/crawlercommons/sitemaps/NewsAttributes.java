package crawlercommons.sitemaps;

import java.util.Date;

/**
 * Created by tanguy on 18/04/2017.
 */
public class NewsAttributes {
    /**
     * News publication name found under news/publication/name (required)
     */
    private String name;

    /**
     * News publication language found under news/publication/language (required)
     */
    private String language;

    /**
     * News genres found under news/genres (required if applicable)
     */
    private NewsGenre[] genres;

    /**
     * News publication date found under news/publication_date (required)
     */
    private Date publicationDate;

    /**
     * News title found under news/title (required)
     */
    private String title;

    /**
     * News keywords found under news/keywords (optional)
     * @see https://support.google.com/news/publisher/answer/116037 for examples
     */
    private String[] keywords;

    /**
     * News stock tickers found under news/stock_tickers (optional)
     */
    private String[] stockTickers;


    public enum NewsGenre { Blog, OpEd, Opinion, PressRelease, Satire, UserGenerated }
}
