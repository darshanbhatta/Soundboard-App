package com.darshan.ugandanknucklessoundboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class SimpleAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private boolean isGrid;

    public SimpleAdapter(Context context, boolean isGrid) {
        layoutInflater = LayoutInflater.from(context);
        this.isGrid = isGrid;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.simple_grid_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) view.findViewById(R.id.text_view69);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.image_view69);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Context context = parent.getContext();
        switch (position) {
            case 0:
                viewHolder.textView.setText("Favorite/Unfavorite");
                viewHolder.imageView.setImageResource(R.drawable.hearticon);
                break;
            case 1:
                viewHolder.textView.setText(context.getString(R.string.google_maps_title));
                viewHolder.imageView.setImageResource(R.drawable.notific);
                break;
            case 2:
                viewHolder.textView.setText("Save as Ringtone");
                viewHolder.imageView.setImageResource(R.drawable.ringoneicon);
                break;
            default:
                viewHolder.textView.setText("Save as Alarm Sound");
                viewHolder.imageView.setImageResource(R.drawable.alarmicon);
                break;
        }

        return view;
    }

    static class ViewHolder {
        TextView textView;
        ImageView imageView;
    }
}
