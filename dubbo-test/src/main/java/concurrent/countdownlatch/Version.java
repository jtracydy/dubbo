package concurrent.countdownlatch;

import lombok.Data;

@Data
public class Version<T> {

    private T data;

    private String code;

    private String message;

}
