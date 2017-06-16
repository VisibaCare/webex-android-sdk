package com.ciscospark.phone;

import java.util.List;

/**
 * Created by lm on 6/16/17.
 */

public interface DialObserver {

    public enum ErrorCode {
        generalError,
        illegalParameter,
        illegalStatus     //for example, if in a ActivitedCall period, dial can not be called.
    }

    public void onSuccess(Call call);
    public void onFailed(ErrorCode errorcode);

}
