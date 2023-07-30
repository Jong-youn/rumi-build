package home.rumi.controller.DTO.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

@Getter
@Setter
public class UserSaveRequest {

    private String name;


    public void validate() {
        if (ObjectUtils.isEmpty(name)) {
            throw new NullPointerException(name);
        }
    }
}
