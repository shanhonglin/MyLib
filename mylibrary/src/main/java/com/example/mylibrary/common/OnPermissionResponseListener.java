package com.example.mylibrary.common;

/**
 * @author dell-pc
 */
public interface OnPermissionResponseListener {
    void onSuccess(String[] permissions);
    void onFail();
}
