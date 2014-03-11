/* IS_AUTOGENERATED_SO_ALLOW_AUTODELETE=YES */
/* The previous line is to allow auto deletion */

package io.golgi.example.gen;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Iterator;
import com.openmindnetworks.golgi.JavaType;
import com.openmindnetworks.golgi.GolgiPayload;
import com.openmindnetworks.golgi.B64;
import com.openmindnetworks.golgi.api.GolgiException;

public class TapTelegraph_streamGame_reqArg
{

    private boolean corrupt = false;

    public boolean isCorrupt() {
        return corrupt;
    }

    public void setCorrupt() {
        corrupt = true;
    }

    private boolean golgiIdIsSet = false;
    private String golgiId;

    public String getGolgiId(){
        return golgiId;
    }
    public boolean golgiIdIsSet(){
        return golgiIdIsSet;
    }
    public void setGolgiId(String golgiId){
        this.golgiId = golgiId;
        this.golgiIdIsSet = true;
    }

    public StringBuffer serialise(){
        return serialise(null);
    }

    public StringBuffer serialise(StringBuffer sb){
        return serialise("", sb);
    }

    public StringBuffer serialise(String prefix, StringBuffer sb){
        if(sb == null){
            sb = new StringBuffer();
        }

        if(this.golgiIdIsSet){
            sb.append(prefix + "1: " + JavaType.encodeString(this.golgiId) + "\n");
        }

        return sb;
    }

    private void deserialise(GolgiPayload payload){
        if(!isCorrupt() && payload.containsFieldKey("1:")){
            String val = payload.getField("1:");
            String str = JavaType.decodeString(val);
            if(str != null){
                setGolgiId(str);
            }
            else{
                setCorrupt();
            }
        }
        else{
            setCorrupt();
        }
    }

    public TapTelegraph_streamGame_reqArg(){
        this(true);
    }

    public TapTelegraph_streamGame_reqArg(boolean isSetDefault){
        super();
        golgiIdIsSet = isSetDefault;
        golgiId = new String();
    }

    public TapTelegraph_streamGame_reqArg(GolgiPayload payload){
        this(false);
        deserialise(payload);
    }

    public TapTelegraph_streamGame_reqArg(String payload){
        this(JavaType.createPayload(payload));
    }

}
