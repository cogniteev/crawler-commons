package crawlercommons.sitemaps;

import java.net.URL;

/**
 * Created by tanguy on 18/04/2017.
 */
public class ImageAttributes {
    /**
     * Image location attribute found under image/log (required)
     */
    private URL loc;

    /**
     * Image caption attribute found under image/caption (optional)
     */
    private String caption;

    /**
     * Image geo location attribute found under image/geo_location (optional)
     */
    private String geoLocation;

    /**
     * Image title attribute found under image/title (optional)
     */
    private String title;

    /**
     * Image license attribute found under image/license (optional)
     */
    private URL license;
}
