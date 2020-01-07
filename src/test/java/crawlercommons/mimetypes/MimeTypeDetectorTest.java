package crawlercommons.mimetypes;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MimeTypeDetectorTest {

    @Test
    public void testXMLDetection() throws Exception {
        MimeTypeDetector detector = new MimeTypeDetector();

        byte[] content = getSitemap("atom.xml");
        String mimeType = detector.detect(content);
        assertTrue(detector.isXml(mimeType));
        assertFalse(detector.isText(mimeType));
        assertFalse(detector.isGzip(mimeType));
    }

    @Test
    public void testTextDetection() throws IOException {
        MimeTypeDetector detector = new MimeTypeDetector();
        byte[] content = getSitemap("sitemap.txt");
        String mimeType = detector.detect(content);
        assertFalse(detector.isXml(mimeType));
        assertTrue(detector.isText(mimeType));
        assertFalse(detector.isGzip(mimeType));

        content = getSitemap("sitemap-with-bom.txt");
        mimeType = detector.detect(content);
        assertFalse(detector.isXml(mimeType));
        assertTrue(detector.isText(mimeType));
        assertFalse(detector.isGzip(mimeType));
    }

    @Test
    public void testGzipDetection() throws IOException {
        MimeTypeDetector detector = new MimeTypeDetector();

        byte[] content = getSitemap("xmlSitemap.gz");
        String mimeType = detector.detect(content);
        assertFalse(detector.isXml(mimeType));
        assertFalse(detector.isText(mimeType));
        assertTrue(detector.isGzip(mimeType));

        content = getSitemap("sitemap.txt.gz");
        mimeType = detector.detect(content);
        assertFalse(detector.isXml(mimeType));
        assertFalse(detector.isText(mimeType));
        assertTrue(detector.isGzip(mimeType));
    }

    @Test
    public void testLeadingSpace() throws IOException {
        MimeTypeDetector detector = new MimeTypeDetector();

        byte[] whitespace = { (byte) 0x20, (byte) 0x0a };
        byte[] content = getSitemap("sitemap.txt");
        byte[] wscontent = new byte[whitespace.length + content.length];
        System.arraycopy(whitespace, 0, wscontent, 0, whitespace.length);
        System.arraycopy(content, 0, wscontent, whitespace.length, content.length);

        String mimeType = detector.detect(wscontent);
        assertFalse(detector.isXml(mimeType));
        assertTrue(detector.isText(mimeType));
        assertFalse(detector.isGzip(mimeType));

        content = getSitemap("sitemap-with-bom.txt");
        wscontent = new byte[whitespace.length + content.length];
        System.arraycopy(content, 0, wscontent, 0, 3);
        System.arraycopy(whitespace, 0, wscontent, 3, whitespace.length);
        System.arraycopy(content, 3, wscontent, (3 + whitespace.length), (content.length - 3));

        mimeType = detector.detect(wscontent);
        assertFalse(detector.isXml(mimeType));
        assertTrue(detector.isText(mimeType));
        assertFalse(detector.isGzip(mimeType));
    }

    @Test
    public void testNormalizeContentTypeWithCharset() throws IOException {
        MimeTypeDetector detector = new MimeTypeDetector();

        assertEquals("application/xml", detector.normalize("text/xml; charset=utf-16", null));
    }

    private byte[] getSitemap(String filename) throws IOException {
        return IOUtils.toByteArray(MimeTypeDetectorTest.class.getResourceAsStream("/sitemaps/" + filename));
    }

}
