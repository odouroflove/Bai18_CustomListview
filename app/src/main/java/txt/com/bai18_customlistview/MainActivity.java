package txt.com.bai18_customlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import txt.com.bai18_customlistview.adapter.CustomAdapter;
import txt.com.bai18_customlistview.model.Contact;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lvContact);

        ArrayList<Contact> arrayList = new ArrayList<>();

        Contact contact1 = new Contact(Color.BLUE,"Trần Xuân Trường","0988 xxx xxx");
        Contact contact2 = new Contact(Color.YELLOW,"Trường Trần Xuân","0988 xxx xxx");
        Contact contact3 = new Contact(Color.MAGENTA,"Trần Trường Xuân","0988 xxx xxx");
        Contact contact4 = new Contact(Color.DKGRAY,"Xuân Trần Trường","0988 xxx xxx");
        Contact contact5 = new Contact(Color.CYAN,"Xuân Trần Trường","0988 xxx xxx");
        Contact contact6 = new Contact(Color.GREEN,"Xuân Trường Trần","0988 xxx xxx");
        Contact contact7 = new Contact(Color.BLACK,"Xuân Trường Trần","0988 xxx xxx");
        Contact contact8 = new Contact(Color.GREEN,"Xuân Trường Trần","0988 xxx xxx");
        Contact contact9 = new Contact(Color.DKGRAY,"Xuân Trường Trần","0988 xxx xxx");
        Contact contact10 = new Contact(Color.DKGRAY,"Xuân Trường Trần","0988 xxx xxx");
        Contact contact11 = new Contact(Color.DKGRAY,"Xuân Trường Trần","0988 xxx xxx");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        arrayList.add(contact9);
        arrayList.add(contact10);
        arrayList.add(contact11);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact, arrayList);

        lvContact.setAdapter(customAdapter);
    }
}
