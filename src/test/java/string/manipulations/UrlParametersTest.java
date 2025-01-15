package string.manipulations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UrlParametersTest {

    @Test
    public void testStripUrlParams_noDuplicateParams() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2";
        String expected = "https://edabit.com?a=1&b=2";
        assertEquals(expected, urlParam.stripUrlParams(url));
    }

    @Test
    public void testStripUrlParams_withDuplicateParams() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2&a=2";
        String expected = "https://edabit.com?a=2&b=2";
        assertEquals(expected, urlParam.stripUrlParams(url));
    }

    @Test
    public void testStripUrlParams_withParamsToRemove() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2&a=2";
        String[] paramsToStrip = {"b"};
        String expected = "https://edabit.com?a=2";
        assertEquals(expected, urlParam.stripUrlParams(url, paramsToStrip));
    }

    @Test
    public void testStripUrlParams_withMultipleParamsToRemove() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2&c=3&a=2";
        String[] paramsToStrip = {"a", "b"};
        String expected = "https://edabit.com?c=3";
        assertEquals(expected, urlParam.stripUrlParams(url, paramsToStrip));
    }

    @Test
    public void testStripUrlParams_noQueryParams() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com";
        String expected = "https://edabit.com";
        assertEquals(expected, urlParam.stripUrlParams(url));
    }

    @Test
    public void testStripUrlParams_emptyParamsToStrip() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2&a=2";
        String[] paramsToStrip = {};
        String expected = "https://edabit.com?a=2&b=2";
        assertEquals(expected, urlParam.stripUrlParams(url, paramsToStrip));
    }

    @Test
    public void testStripUrlParams_withSingleParamToRemove() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com?a=1&b=2&c=3";
        String[] paramsToStrip = {"c"};
        String expected = "https://edabit.com?a=1&b=2";
        assertEquals(expected, urlParam.stripUrlParams(url, paramsToStrip));
    }

    @Test
    public void testStripUrlParams_urlWithNoParams() {

        UrlParameters urlParam = new UrlParameters(); // Create an object

        String url = "https://edabit.com";
        String[] paramsToStrip = {"a"};
        String expected = "https://edabit.com";
        assertEquals(expected, urlParam.stripUrlParams(url, paramsToStrip));
    }
}

