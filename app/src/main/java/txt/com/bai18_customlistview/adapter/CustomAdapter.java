package txt.com.bai18_customlistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import txt.com.bai18_customlistview.R;
import txt.com.bai18_customlistview.model.Contact;

/**
 * Created by Acer on 15/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrayContact;
    private final String TAG = getClass().getSimpleName();

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrayContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.tv_anhlienhe = (TextView) convertView.findViewById(R.id.anhlienhe);
            viewHolder.tv_tenlienhe = (TextView) convertView.findViewById(R.id.tenlienhe);
            viewHolder.tv_sdtlienhe = (TextView) convertView.findViewById(R.id.sdtlienhe);

            convertView.setTag(viewHolder);
            Log.d(TAG, "getView: " + (position+1));
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
//            Log.d(TAG, "getView: " + (position+1));
        }


        Contact contact = arrayContact.get(position);

        viewHolder.tv_anhlienhe.setBackgroundColor(contact.getmColor());
        viewHolder.tv_anhlienhe.setText((position+1)+"");
        viewHolder.tv_tenlienhe.setText(contact.getnName());
        viewHolder.tv_sdtlienhe.setText(contact.getmNumber());



        return convertView;
    }

    public class ViewHolder{
        TextView tv_anhlienhe;
        TextView tv_tenlienhe;
        TextView tv_sdtlienhe;

    }
}
