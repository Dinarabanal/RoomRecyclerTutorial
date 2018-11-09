package edu.cnm.deepdive.roomrecyclertutorial;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

 class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {


  @Override
  public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewTyoe) {
    return null;
  }
  @Override
  public void onBindViewHolder( UserAdapter.ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount(){
    return 0;

  }
  public class ViewHolder extends RecyclerView.ViewHolder {

    public ViewHolder(View itemView) {
      super(itemView);
    }
  }

}

