package position.web.vo;

import lombok.Data;

/**
 * @author cty
 * @date 2022/6/24
 */
@Data
public class ObjectItem {
    private String objectName;
    private Long size;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
