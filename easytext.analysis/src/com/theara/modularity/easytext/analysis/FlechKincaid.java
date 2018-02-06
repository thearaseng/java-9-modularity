package com.theara.modularity.easytext.analysis;

import com.theara.modularity.easytext.analysis.internal.SyllableCounter;

public class FlechKincaid {

    public double analyze(String statement){
        // TODO : dumy code
        return ((double) new SyllableCounter().counterSyllables(statement)) / 100;
    }

}
