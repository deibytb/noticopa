package com.devy.noticopa.domain.repository;

/**
 * Created by RONALD on 25/06/2016.
 */
public interface RepositoryCallback {
    void onError(Object object);

    void onSuccess(Object object);
}
