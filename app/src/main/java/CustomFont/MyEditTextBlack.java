package CustomFont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import static java.security.AccessController.getContext;

/**
 * Created by ADMIN on 06-10-2016.
 */

public class MyEditTextBlack extends EditText {

    public MyEditTextBlack(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyEditTextBlack(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditTextBlack(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Black.ttf");
            setTypeface(tf);
        }
    }

}
