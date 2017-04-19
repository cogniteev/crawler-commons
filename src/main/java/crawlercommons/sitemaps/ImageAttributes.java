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

/**
 * Data model for Google extension to the sitemap protocol regarding images indexing,
 * as per http://www.google.com/schemas/sitemap-image/1.1
 */
public class ImageAttributes {
    /**
     * Image location attribute found under image/loc (required)
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


    public URL getLoc() {
        return loc;
    }

    public void setLoc(URL loc) {
        this.loc = loc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public URL getLicense() {
        return license;
    }

    public void setLicense(URL license) {
        this.license = license;
    }

    private ImageAttributes(){}

    public ImageAttributes(URL loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other instanceof ImageAttributes) {
            ImageAttributes that = (ImageAttributes)other;
            if (loc == null) {
                if (that.loc != null) {
                    return false;
                }
            } else if (!loc.equals(that.loc)) {
                return false;
            }
            if (caption == null) {
                if (that.caption != null) {
                    return false;
                }
            } else if (!caption.equals(that.caption)) {
                return false;
            }
            if (geoLocation == null) {
                if (that.geoLocation != null) {
                    return false;
                }
            } else if (!geoLocation.equals(that.geoLocation)) {
                return false;
            }
            if (title == null) {
                if (that.title != null) {
                    return false;
                }
            } else if (!title.equals(that.title)) {
                return false;
            }
            if (license == null) {
                if (that.license != null) {
                    return false;
                }
            } else if (!license.equals(that.license)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
