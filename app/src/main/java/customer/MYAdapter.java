package customer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbmsproject.R;

import java.util.ArrayList;

import Product.ProductModel;

public class MYAdapter extends RecyclerView.Adapter<MYAdapter.ViewHolder> {

    private ArrayList<ProductModel> mData=new ArrayList<>();
    CustomerHome fragment;
    FragmentManager fragmentManager;
    private Context context;


    public MYAdapter(Context context1) {

        context = context1;
//            mListener = listener;
    }

    public void setData(ArrayList<ProductModel> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ProductModel productm = mData.get(position);
//        holder.price.setText(productm.getPrice());
        holder.name.setText(productm.getName());
        Log.d("11111",productm.getName());
//        holder.id1.setText(productm.getId());
//        holder.categ.setText(productm.getCategory());
    }

    @Override
    public int getItemCount() {
//        if(mData.isEmpty()) {
            return mData.size();
//        }return 7;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
//        public TextView id1;
//        public TextView price;
//        public TextView categ;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Product);
//            id1= itemView.findViewById(R.id.id11);
//            price = itemView.findViewById(R.id.price);
//            categ = itemView.findViewById(R.id.category);

        }
    }
}
