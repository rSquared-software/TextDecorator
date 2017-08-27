package software.rsquared.textdecorator;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

/**
 * @author Rafal Zajfert
 */
class UrlStyle extends SpanStyle {

    private final String url;

    /**
     * @see URLSpan#URLSpan(String)
     */
    UrlStyle(String url) {
        this.url = url;
    }

    @Override
    void apply(SpannableStringBuilder builder, int start, int end) {
        apply(builder, start, end, new URLSpan(url));
    }
}
