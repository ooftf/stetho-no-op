package com.facebook.stetho.okhttp3;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @author ooftf
 * @email 994749769@qq.com
 * @date 2019/6/10 0010
 */
public class StethoInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request());
    }
}
