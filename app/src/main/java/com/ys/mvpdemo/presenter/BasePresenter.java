package com.ys.mvpdemo.presenter;

/**
 * Created by Jim on 17/4/12.
 *
 */

public interface BasePresenter {

    void executeTask();

    void cancelTask();

    void onTaskCancelled();

    void onTaskCompleted(String result);

    int getCurrentTaskId();
}
