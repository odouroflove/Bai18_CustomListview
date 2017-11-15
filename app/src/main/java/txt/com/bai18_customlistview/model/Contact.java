package txt.com.bai18_customlistview.model;

/**
 * Created by Acer on 12/11/2017.
 */

public class Contact {
    private int mColor;
    private String nName;
    private String mNumber;

    public Contact(int mColor, String nName, String mNumber) {
        this.mColor = mColor;
        this.nName = nName;
        this.mNumber = mNumber;
    }

    public int getmColor() {
        return mColor;
    }

    public String getnName() {
        return nName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
