package com.master.killercode.toolboxrecyclerview;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;

public class ToolBoxRecyclerView {

    /**
     * Create LinearLayoutManager for recyclerview
     *
     * @param activity   activity
     * @param horizontal true return linearLayoutManager in VERTICAL mode
     * @return new linearLayoutManager
     */
    public static LinearLayoutManager LinearLayoutManagerFuntion(Activity activity, Boolean horizontal) {

        LinearLayoutManager linearLayoutManager = null;

        if (horizontal) {
            return linearLayoutManager = new LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false);
        } else {
            return linearLayoutManager = new LinearLayoutManager(activity, LinearLayout.VERTICAL, false);
        }
    }

    /**
     * Create GridLayoutManager for recyclerview
     *
     * @param activity activity
     * @return new GridLayoutManager with number spanCount related to screen size
     */

    public static GridLayoutManager GridLayoutManagerFuntion(Activity activity) {

        GridLayoutManager gridLayoutManager = null;

        if (FunctionGetScreenWidthDp(activity) >= 1200) {
            return gridLayoutManager = new GridLayoutManager(activity, 3);
        } else if (FunctionGetScreenWidthDp(activity) >= 800) {
            return gridLayoutManager = new GridLayoutManager(activity, 2);
        } else {
            return gridLayoutManager = new GridLayoutManager(activity, 2);
        }
    }

    //Bonus**

    /**
     *  get screen size in DP
     * @param activity activity
     * @return int size
     */

    public static int FunctionGetScreenWidthDp(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

}
