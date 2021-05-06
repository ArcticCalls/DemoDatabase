package sg.edu.rp.c347.id19045104.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> taskList;
    private Context context;
    private TextView tvid, tvdesc, tvdate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        taskList = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
         tvid = rowView.findViewById(R.id.tvID);
         tvdate = rowView.findViewById(R.id.tvDate);
         tvdesc = rowView.findViewById(R.id.tvDesc);

         Task currItem = taskList.get(position);

         tvid.setText("Item: " + currItem.getId());
         tvdesc.setText("Desc: " + currItem.getDescription());
         tvdate.setText("Date: " + currItem.getDate());

         return rowView;

    }
}
