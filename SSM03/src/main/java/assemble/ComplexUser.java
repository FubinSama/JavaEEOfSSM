package assemble;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    private String uname;
    private List<String> hobbyList;
    private Map<String, String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;

    public ComplexUser(){
        super();
    }

    public ComplexUser(String uname, List<String> hobbyList, Map<String, String> residenceMap,
                       Set<String> aliasSet, String[] array) {
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ComplexUser{" +
                "uname='" + uname + '\'' +
                ", hobbyList=" + hobbyList +
                ", residenceMap=" + residenceMap +
                ", aliasSet=" + aliasSet +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
