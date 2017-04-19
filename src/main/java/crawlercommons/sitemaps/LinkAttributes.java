package crawlercommons.sitemaps;

import java.net.URL;
import java.util.Map;

/**
 * Created by tanguy on 18/04/2017.
 */
public class LinkAttributes {
    /**
     * Link's href attribute
     */
    private URL href;

    /**
     * Link's other attributes key and values
     */
    private Map<String, String> params;


    private LinkAttributes(){}

    public LinkAttributes(URL href) {
        this.href = href;
    }

    public URL getHref() {
        return href;
    }

    public void setHref(URL href) {
        this.href = href;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other instanceof LinkAttributes) {
            LinkAttributes that = (LinkAttributes)other;
            if (href == null) {
                if (that.href != null) {
                    return false;
                }
            } else if (!href.equals(that.href)) {
                return false;
            }
            if (params == null) {
                if (that.params != null) {
                    return false;
                }
            } else if (!params.equals(that.params)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
