package com.klisly.bookbox.adapter;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.klisly.bookbox.R;
import com.klisly.bookbox.model.User2WxArticle;
import com.klisly.bookbox.model.WxArticle;
import com.klisly.bookbox.utils.DateUtil;

import butterknife.Bind;
import butterknife.ButterKnife;


public class WxUser2ArticleViewHolder extends BaseViewHolder<User2WxArticle> {
    @Bind(R.id.iv_image)
    SimpleDraweeView ivImage;
    @Bind(R.id.tv_wechat_item_title)
    TextView tvTitle;
    @Bind(R.id.tv_wechat_item_from)
    TextView tvFrom;
    @Bind(R.id.tv_wechat_item_time)
    TextView tvTime;

    public WxUser2ArticleViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_wx);
        ButterKnife.bind(this, itemView);
    }


    @Override
    public void setData(final User2WxArticle entity) {
        tvTitle.setText(entity.getArticleName());
        ivImage.setImageURI(Uri.parse(entity.getImg()));
        tvFrom.setText(entity.getAccount());
        tvTime.setText(DateUtil.getFriendlyTimeSpanByNow(((long)entity.getUpdate() * 1000)));
    }
}
