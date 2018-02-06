import com.theara.easytext.service.Analysis;
import com.theara.modularity.easytext.service.impl.Lexile;

module easytext.analysis.secondprovider {

    requires easytext.analysis.service;

    provides Analysis with Lexile;

}