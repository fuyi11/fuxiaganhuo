package com.dingmouren.fujialiangmvp.ui.gallery;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dingmouren.fujialiangmvp.base.BasePresenter;
import com.dingmouren.fujialiangmvp.base.BaseView;

/**
 * Created by dingmouren on 2016/12/3.
 */

public interface GalleryContract {

    interface View extends BaseView{
        void setDataRefresh(boolean refresh);
        RecyclerView getRecyclerView();
        GalleryAdapter getGalleryAdapter();
        LinearLayoutManager getLayoutManager();
    }

    interface Presenter<V extends View> extends BasePresenter{

    }
}
