package modification;

import java.util.Date;

public class Father {

    protected CommonUtils commonUtils;

    public Father(){

    }

    public Father(CommonUtils commonUtils){
        this.commonUtils = commonUtils;
    }

    public Date getFatherDate(){
       return  commonUtils.getDate();
    }
}
