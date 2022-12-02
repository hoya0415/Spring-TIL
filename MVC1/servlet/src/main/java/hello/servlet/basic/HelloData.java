package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter // 게터세터 따로 생성할 필요 없음. 롬복 덕분.
public class HelloData {

    private String username;
    private int age;

}
