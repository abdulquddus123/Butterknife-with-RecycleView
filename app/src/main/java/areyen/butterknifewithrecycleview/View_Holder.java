package areyen.butterknifewithrecycleview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by a_qud on 1/17/2018.
 */

class View_Holder extends RecyclerView.ViewHolder {

    @BindView(R.id.cardView)
    CardView cardView;
    @BindView(R.id.textView)
    TextView title;
    @BindView(R.id.imageView)
    ImageView imageView;
    public View_Holder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
