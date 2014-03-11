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

public class TapTelegraph_getHiScore_reqArg
{

    private boolean corrupt = false;

    public boolean isCorrupt() {
        return corrupt;
    }

    public void setCorrupt() {
        corrupt = true;
    }

    private boolean pookyIsSet = false;
    private int pooky;

    public int getPooky(){
        return pooky;
    }
    public boolean pookyIsSet(){
        return pookyIsSet;
    }
    public void setPooky(int pooky){
        this.pooky = pooky;
        this.pookyIsSet = true;
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

        if(this.pookyIsSet){
            sb.append(prefix + "1: " + this.pooky+"\n");
        }

        return sb;
    }

    private void deserialise(GolgiPayload payload){
        if(!isCorrupt() && payload.containsFieldKey("1:")){
            String str = payload.getField("1:");
            try{
                setPooky(Integer.valueOf(str));
            }
            catch(NumberFormatException nfe){
                setCorrupt();
            }
        }
        else{
            setCorrupt();
        }
    }

    public TapTelegraph_getHiScore_reqArg(){
        this(true);
    }

    public TapTelegraph_getHiScore_reqArg(boolean isSetDefault){
        super();
        pookyIsSet = isSetDefault;
        pooky = 0;
    }

    public TapTelegraph_getHiScore_reqArg(GolgiPayload payload){
        this(false);
        deserialise(payload);
    }

    public TapTelegraph_getHiScore_reqArg(String payload){
        this(JavaType.createPayload(payload));
    }

}
