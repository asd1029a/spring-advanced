package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * SuvClassLogic1.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.04
 */
@Slf4j
public class SubClassLogic1 extends AbstractTemplate {
    @Override
    protected void call() {
        log.info("비즈니스 로직1 실행");
    }
}
