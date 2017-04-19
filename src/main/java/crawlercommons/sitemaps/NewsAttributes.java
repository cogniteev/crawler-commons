/**
 * Copyright 2016 Crawler-Commons
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crawlercommons.sitemaps;

import java.util.Arrays;
import java.util.Date;

/**
 * Data model for Google's extension to the sitemap protocol regarding news indexing, as per
 * http://www.google.com/schemas/sitemap-news/0.9
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


    private NewsAttributes() {}

    public NewsAttributes(final String name, final String language, final Date publicationDate, final String title) {
        this.name = name;
        this.language = language;
        this.publicationDate = publicationDate;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public NewsGenre[] getGenres() {
        return genres;
    }

    public void setGenres(NewsGenre[] genres) {
        this.genres = genres;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getStockTickers() {
        return stockTickers;
    }

    public void setStockTickers(String[] stockTickers) {
        this.stockTickers = stockTickers;
    }


    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other instanceof NewsAttributes) {
            NewsAttributes that = (NewsAttributes)other;
            if (name == null) {
                if (that.name != null) {
                    return false;
                }
            } else if (!name.equals(that.name)) {
                return false;
            }
            if (language == null) {
                if (that.language != null) {
                    return false;
                }
            } else if (!language.equals(that.language)) {
                return false;
            }
            if (title == null) {
                if (that.title != null) {
                    return false;
                }
            } else if (!title.equals(that.title)) {
                return false;
            }
            if (!Arrays.deepEquals(keywords, that.keywords)) {
                return false;
            }
            if (!Arrays.deepEquals(genres, that.genres)) {
                return false;
            }
            if (!Arrays.deepEquals(stockTickers, that.stockTickers)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public enum NewsGenre { Blog, OpEd, Opinion, PressRelease, Satire, UserGenerated }
}
