package pojo;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class MultiFileDomain {
    private List<String> description;
    private List<MultipartFile> myfile;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<MultipartFile> getMyfile() {
        return myfile;
    }

    public void setMyfile(List<MultipartFile> myfile) {
        this.myfile = myfile;
    }
}
