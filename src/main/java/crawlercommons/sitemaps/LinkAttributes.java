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

import java.net.URL;
import java.util.Map;

/**
 * Data model for Google extension to the sitemap protocol regarding alternate links indexing.
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
