package com.theara.modularity.easytext.analysis;

import com.theara.modularity.easytext.analysis.internal.SyllableCounter;
import com.theara.modularity.easytext.counter.Counter;

public class FlechKincaid {

    public Counter analyze(String statement){
        // TODO : dumy code
        return new SyllableCounter().getCounter(statement);
    }

}
