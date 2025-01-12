package io.realm;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import co.moonmonkeylabs.realmrecyclerview.LoadMoreListItemView;

/**
 * ViewHolder used with {@link RealmBasedRecyclerViewAdapter}
 */
public class RealmViewHolder extends RecyclerView.ViewHolder {

    public TextView headerTextView;

    public LoadMoreListItemView loadMoreView;

    public RealmViewHolder(View itemView) {
        super(itemView);
    }

    public RealmViewHolder(TextView headerTextView) {
        super(headerTextView);
        this.headerTextView = headerTextView;
    }

    public RealmViewHolder(LoadMoreListItemView loadMoreView) {
        super(loadMoreView);
        this.loadMoreView = loadMoreView;
    }
}