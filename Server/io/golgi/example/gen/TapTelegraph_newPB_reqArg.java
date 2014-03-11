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

public class TapTelegraph_newPB_reqArg
{

    private boolean corrupt = false;

    public boolean isCorrupt() {
        return corrupt;
    }

    public void setCorrupt() {
        corrupt = true;
    }

    private boolean hiScoreDataIsSet = false;
    private HiScoreData hiScoreData;

    public HiScoreData getHiScoreData(){
        return hiScoreData;
    }
    public boolean hiScoreDataIsSet(){
        return hiScoreDataIsSet;
    }
    public void setHiScoreData(HiScoreData hiScoreData){
        this.hiScoreData = hiScoreData;
        this.hiScoreDataIsSet = true;
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

        if(this.hiScoreDataIsSet){
            hiScoreData.serialise(prefix + "" + 1 + "." , sb);
        }

        return sb;
    }

    private void deserialise(GolgiPayload payload){
        if(!isCorrupt() && payload.containsNestedKey("1")){
            HiScoreData inst = new HiScoreData(payload.getNested("1"));
            setHiScoreData(inst);
               if(inst == null || inst.isCorrupt()){
                   setCorrupt();
               }
        }
        else {
            setCorrupt();
        }
    }

    public TapTelegraph_newPB_reqArg(){
        this(true);
    }

    public TapTelegraph_newPB_reqArg(boolean isSetDefault){
        super();
        hiScoreDataIsSet = isSetDefault;
        hiScoreData = new HiScoreData(isSetDefault);
    }

    public TapTelegraph_newPB_reqArg(GolgiPayload payload){
        this(false);
        deserialise(payload);
    }

    public TapTelegraph_newPB_reqArg(String payload){
        this(JavaType.createPayload(payload));
    }

}
