package com.theara.modularity.easytext.service.impl;

import com.theara.modularity.easytext.counter.Counter;

public class Lexile implements com.theara.easytext.service.Analysis {

    public Counter analyze(String statement){
        // TODO : dumy code
        return new Counter(statement + " hello second world");
    }

}
