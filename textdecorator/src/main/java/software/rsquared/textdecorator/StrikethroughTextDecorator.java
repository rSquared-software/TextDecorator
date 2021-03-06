package software.rsquared.textdecorator;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;

/**
 * @author Rafal Zajfert
 */
class StrikethroughTextDecorator extends SpanTextDecorator {

    /**
     * @see StrikethroughSpan#StrikethroughSpan()
     */
    public StrikethroughTextDecorator() {
    }

    @Override
    void apply(SpannableStringBuilder builder, int start, int end) {
        apply(builder, start, end, new StrikethroughSpan());
    }
}
