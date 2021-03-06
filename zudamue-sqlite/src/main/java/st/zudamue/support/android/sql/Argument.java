package st.zudamue.support.android.sql;

import android.support.annotation.NonNull;

/**
 * Created by xdaniel on 12/31/16.
 *
 * @author Daniel Costa <costa.xdaniel@gmail.com>
 */

public abstract class Argument implements CharSequence {

    public abstract String argument();

    @Override
    public int length() {
        return argument().length();
    }

    @Override
    public char charAt(int index) {
        return argument().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return argument().subSequence(start, end);
    }

    @NonNull
    @Override
    public String toString() {
        return argument();
    }
}
