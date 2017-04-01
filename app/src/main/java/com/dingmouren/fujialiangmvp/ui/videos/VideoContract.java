package com.dingmouren.fujialiangmvp.ui.videos;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dingmouren.fujialiangmvp.base.BasePresenter;
import com.dingmouren.fujialiangmvp.base.BaseView;
import com.dingmouren.fujialiangmvp.bean.video.VideoBean;

import java.util.List;

/**
 * Created by dingmouren on 2017/1/11.
 */

public interface VideoContract {

    interface View extends BaseView{
        void notifyDataSetChanged();
        List<VideoBean> getVideoAdapterList();
        void setRefresh(boolean refresh);
        void loadMore(boolean loadMore);
        LinearLayoutManager getLayoutManager();
        RecyclerView getRecyclerView();
        boolean isRefreshingg();
    }

    interface Presenter<V extends View> extends BasePresenter{
        void requestData();
    }
}
