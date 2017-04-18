package crawlercommons.sitemaps;

import java.net.URL;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by tanguy on 18/04/2017.
 */
public class VideoAttributes {

    /**
     * Video thumbnail URL found under video/thumbnail_loc (required)
     */
    private URL thumbnailLoc;

    /**
     * Video title found under video/title (required)
     */
    private String title;

    /**
     * Video description found under video/description (required)
     */
    private String description;

    /**
     * Video content location found under video/content_loc (depends)
     * if not specified, player location must be specified
     */
    private URL contentLoc;

    /**
     * Video player location found under video/player_loc (depends)
     * if not specified, content location must be specified
     */
    private URL playerLoc;

    /**
     * Video duration in seconds found under video/duration (recommended)
     * Must be integer between 0 and 28800 (8 hours)
     */
    private Integer duration;

    /**
     * Video expiration date found under video/expiration_date (recommended if applicable)
     */
    private Date expirationDate;

    /**
     * Video rating found under video/rating (optional)
     * Must be float value between 0.0 and 5.0
     */
    private Float rating;

    /**
     * Video view count found under video/view_count (optional)
     */
    private Integer viewCount;

    /**
     * Video publication date found under video/publication_date (optional)
     */
    private Date publicationDate;

    /**
     * Video family friendly attribute found under video/family_friendly (optional)
     */
    private Boolean familyFriendly;

    /**
     * Video tags found under video/tag (optional)
     * Up to 32 tags can be specified
     */
    private String[] tags;

    /**
     * Video category found under video/category (optional)
     */
    private String category;

    /**
     * Video restricted countries found under video/restriction (optional)
     * blacklist of countries filled if video/restriction node has an attribute named relationship with a value of deny.
     */
    private String[] restrictedCountries;

    /**
     * Video allowed countries found under video/restriction (optional)
     * whitelist of countries filled if video/restriction node has an attribute named relationship with a value of allow.
     */
    private String[] allowedCountries;

    /**
     * Video gallery location found under video/gallery_loc (optional)
     */
    private URL galleryLoc;

    /**
     * Video gallery title found under video/gallery_loc[@title] (optional)
     */
    private String galleryTitle;

    /**
     * Video prices found under video/price (optional)
     */
    private VideoPrice[] prices;

    /**
     * Video requires subscription (free or paid) found under video/requires_subscription (optional)
     */
    private Boolean requiresSubscription;

    /**
     * Video uploader found under video/uploader (optional)
     */
    private String uploader;

    /**
     * Video uploader location (optional)
     * Must be on the same domain as the &lt;loc&gt; this property refers to
     */
    private URL uploaderInfo;

    /**
     * Video restricted platforms found under video/platform (optional)
     * blacklist of platform filled if video/platform node has an attribute named relationship with a value of deny.
     */
    private String[] restrictedPlatforms;

    /**
     * Video allowed platforms found under video/platform (optional)
     * whitelist of platforms filled if video/platform node has an attribute named relationship with a value of allow.
     */
    private String[] allowedPlatforms;

    public URL getThumbnailLoc() {
        return thumbnailLoc;
    }

    public void setThumbnailLoc(URL thumbnailLoc) {
        this.thumbnailLoc = thumbnailLoc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getContentLoc() {
        return contentLoc;
    }

    public void setContentLoc(URL contentLoc) {
        this.contentLoc = contentLoc;
    }

    public URL getPlayerLoc() {
        return playerLoc;
    }

    public void setPlayerLoc(URL playerLoc) {
        this.playerLoc = playerLoc;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Boolean getFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(Boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getRestrictedCountries() {
        return restrictedCountries;
    }

    public void setRestrictedCountries(String[] restrictedCountries) {
        this.restrictedCountries = restrictedCountries;
    }

    public String[] getAllowedCountries() {
        return allowedCountries;
    }

    public void setAllowedCountries(String[] allowedCountries) {
        this.allowedCountries = allowedCountries;
    }

    public URL getGalleryLoc() {
        return galleryLoc;
    }

    public void setGalleryLoc(URL galleryLoc) {
        this.galleryLoc = galleryLoc;
    }

    public String getGalleryTitle() {
        return galleryTitle;
    }

    public void setGalleryTitle(String galleryTitle) {
        this.galleryTitle = galleryTitle;
    }

    public VideoPrice[] getPrices() {
        return prices;
    }

    public void setPrices(VideoPrice[] prices) {
        this.prices = prices;
    }

    public Boolean getRequiresSubscription() {
        return requiresSubscription;
    }

    public void setRequiresSubscription(Boolean requiresSubscription) {
        this.requiresSubscription = requiresSubscription;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public URL getUploaderInfo() {
        return uploaderInfo;
    }

    public void setUploaderInfo(URL uploaderInfo) {
        this.uploaderInfo = uploaderInfo;
    }

    public String[] getRestrictedPlatforms() {
        return restrictedPlatforms;
    }

    public void setRestrictedPlatforms(String[] restrictedPlatforms) {
        this.restrictedPlatforms = restrictedPlatforms;
    }

    public String[] getAllowedPlatforms() {
        return allowedPlatforms;
    }

    public void setAllowedPlatforms(String[] allowedPlatforms) {
        this.allowedPlatforms = allowedPlatforms;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }

    /**
     * Video is a live stream found under video/live (optional)
     */
    private Boolean isLive;

    public enum VideoPriceType { own, rent }
    public enum VideoPriceResolution { SD, HD }

    static final class VideoPrice {
        /**
         * Video price currency found under video/price[@currency] (required)
         */
        final String currency;

        /**
         * Video price type (rent vs own) found under video/price[@type] (optional, defaults to own)
         */
        final VideoPriceType type;

        /**
         * Video price resolution found under video/price[@resolution]
         */
        final VideoPriceResolution resolution;

        /**
         * Video price
         */
        float price;

        VideoPrice(final String currency, final float price) {
            this(currency, price, VideoPriceType.own);
        }

        VideoPrice(final String currency, final float price, final VideoPriceType type) {
            this(currency, price, type, null);
        }

        VideoPrice(final String currency, final float price, final VideoPriceType type, final VideoPriceResolution resolution) {
            this.currency = currency;
            this.price = price;
            this.type = type;
            this.resolution = resolution;
        }

        @Override
        public String toString() {
            return String.format("value: %.2f, currency: %s, type: %s, resolution: %s", price, currency, type, resolution);
        }

        @Override
        public boolean equals(Object other) {
            if (other == null) {
                return false;
            }
            if (other instanceof VideoPrice) {
                VideoPrice that = (VideoPrice)other;
                if (currency == null) {
                    if (that.currency != null) {
                        return false;
                    }
                } else if (!currency.equals(that.currency)) {
                    return false;
                }
                if (price != that.price) {
                    return false;
                }
                if (type != that.type) {
                    return false;
                }
                if (resolution == null) {
                    if (that.resolution != null) {
                        return false;
                    }
                } else if (!resolution.equals(that.resolution)) {
                    return false;
                }
            } else {
                return false;
            }
            return true;
        }
    }

    private VideoAttributes(){}

    public VideoAttributes(final URL thumbnailLoc, final String title, final String description, final URL contentLoc, final URL playerLoc) {
        this.thumbnailLoc = thumbnailLoc;
        this.title = title;
        this.description = description;
        this.contentLoc = contentLoc;
        this.playerLoc = playerLoc;
    }

    @Override
    public String toString() {
        return String.format("Video title: %s, description: %s, thumbnail: %s, contentLoc: %s, playerLoc:%s, prices: %s",
            title, description, thumbnailLoc, contentLoc, playerLoc, prices);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other instanceof VideoAttributes) {
            VideoAttributes that = (VideoAttributes)other;
            if (thumbnailLoc == null) {
                if (that.thumbnailLoc != null) {
                    return false;
                }
            } else if (!thumbnailLoc.equals(that.thumbnailLoc)) {
                return false;
            }
            if (title == null) {
                if (that.title != null) {
                    return false;
                }
            } else  if (!title.equals(that.title)) {
                return false;
            }
            if (description == null) {
                if (that.description != null) {
                    return false;
                }
            } else  if (!description.equals(that.description)) {
                return false;
            }
            if (contentLoc == null) {
                if (that.contentLoc != null) {
                    return false;
                }
            } else if (!contentLoc.equals(that.contentLoc)) {
                return false;
            }
            if (playerLoc == null) {
                if (that.playerLoc != null) {
                    return false;
                }
            } else if (!playerLoc.equals(that.playerLoc)) {
                return false;
            }
            if (duration == null) {
                if (that.duration != null) {
                    return false;
                }
            } else  if (!duration.equals(that.duration)) {
                return false;
            }
            if (expirationDate == null) {
                if (that.expirationDate != null) {
                    return false;
                }
            } else if (!expirationDate.equals(that.expirationDate)) {
                return false;
            }
            if (rating == null) {
                if (that.rating != null) {
                    return false;
                }
            } else if (!rating.equals(that.rating)) {
                return false;
            }
            if (viewCount == null) {
                if (that.viewCount != null) {
                    return false;
                }
            } else if (!viewCount.equals(that.viewCount)) {
                return false;
            }
            if (publicationDate == null) {
                if (that.publicationDate != null) {
                    return false;
                }
            } else  if (!publicationDate.equals(that.publicationDate)) {
                return false;
            }
            if (familyFriendly == null) {
                if (that.familyFriendly != null) {
                    return false;
                }
            } else  if (!familyFriendly.equals(that.familyFriendly)) {
                return false;
            }
            if (!Arrays.deepEquals(tags, that.tags)) {
                return false;
            }
            if (category == null) {
                if(that.category != null) {
                    return false;
                }
            } else if (!category.equals(that.category)) {
                return false;
            }
            if (!Arrays.deepEquals(restrictedCountries, that.restrictedCountries)) {
                return false;
            }
            if (!Arrays.deepEquals(allowedCountries, that.allowedCountries)) {
                return false;
            }
            if (galleryLoc == null) {
                if (that.galleryLoc != null) {
                    return false;
                }
            } else if (!galleryLoc.equals(that.galleryLoc)) {
                return false;
            }
            if (galleryTitle == null) {
                if (that.galleryTitle != null) {
                    return false;
                }
            } else if (!galleryTitle.equals(that.galleryTitle)) {
                return false;
            }
            if (!Arrays.deepEquals(prices, that.prices)) {
                return false;
            }
            if (requiresSubscription == null) {
                if (that.requiresSubscription != null) {
                    return false;
                }
            } else if (!requiresSubscription.equals(that.requiresSubscription)) {
                return false;
            }
            if (uploader == null) {
                if (that.uploader != null) {
                    return false;
                }
            } else if (!uploader.equals(that.uploader)) {
                return false;
            }
            if (uploaderInfo == null) {
                if (that.uploaderInfo != null) {
                    return false;
                }
            } else if (!uploaderInfo.equals(that.uploaderInfo)) {
                return false;
            }
            if (!Arrays.deepEquals(allowedPlatforms, that.allowedPlatforms)) {
                return false;
            }
            if (!Arrays.deepEquals(restrictedPlatforms, that.restrictedPlatforms)) {
                return false;
            }
            if (isLive == null) {
                if (that.isLive != null) {
                    return false;
                }
            } else if (!isLive.equals(that.isLive)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
