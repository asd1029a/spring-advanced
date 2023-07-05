package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * TemplateCallbackTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.05
 */
@Slf4j
public class TemplateCallbackTest {

    @Test
    void callbackV1() {
        TimeLogTemplate timeLogTemplate = new TimeLogTemplate();
        timeLogTemplate.execute(() -> log.info("비즈니스 로직 1 실행"));
        timeLogTemplate.execute(() -> log.info("비즈니스 로직 2 실행"));
    }
}
