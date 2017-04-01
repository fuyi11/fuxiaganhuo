package com.dingmouren.fujialiangmvp.ui.gallery;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.dingmouren.fujialiangmvp.Constant;
import com.dingmouren.fujialiangmvp.R;
import com.dingmouren.fujialiangmvp.base.BaseActivity;
import com.dingmouren.fujialiangmvp.util.SPUtil;
import com.dingmouren.fujialiangmvp.util.StatusBarUtil;

import butterknife.BindView;

/**
 * Created by dingmouren on 2016/12/3.
 */

public class GalleryActivity extends BaseActivity{

    @BindView(R.id.toolbar)  Toolbar mToolbar;
    @BindView(R.id.frame_gallery)  FrameLayout mFrameGallery;
    @BindView(R.id.relative_gallery) RelativeLayout mRelativeLayout;
    @Override
    protected int setLayoutResourceID() {
        return R.layout.activity_gallery;
    }


    @Override
    protected void setUpView() {
        initToolbar();//初始化toolbar
        initNightMode();//初始化夜间模式
    }

    @Override
    protected void setUpData() {
        getSupportFragmentManager().beginTransaction().add(R.id.frame_gallery,new GalleryFragment()).commit();
    }

    /**
     * 初始化toolbar
     */
    private void initToolbar(){
        mToolbar.setTitle("相册");
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(mArrowListener );
    }

    View.OnClickListener mArrowListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };


    /**
     * 初始化夜间模式
     */
    private void initNightMode(){
        if ((Boolean) SPUtil.get(GalleryActivity.this, Constant.NIGHT_MODE,true)){
            mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.gray));
            mToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            mToolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
            mToolbar.setNavigationIcon(R.mipmap.arrow_back);
            StatusBarUtil.setStatusBarColor(GalleryActivity.this,getResources().getColor(R.color.colorPrimaryDark));
        }else {
            mRelativeLayout.setBackgroundColor(getResources().getColor(android.R.color.black));
            mToolbar.setBackgroundColor(getResources().getColor(android.R.color.black));
            mToolbar.setTitleTextColor(getResources().getColor(android.R.color.darker_gray));
            mToolbar.setNavigationIcon(R.mipmap.arrow_back_night);
            StatusBarUtil.setStatusBarColor(GalleryActivity.this,getResources().getColor(android.R.color.black));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
