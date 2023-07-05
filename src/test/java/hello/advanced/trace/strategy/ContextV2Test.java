package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.strategy.ContextV2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * ContextV2Test.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.05
 */
@Slf4j
public class ContextV2Test {

    @Test
    void strategyV1() {
        ContextV2 context = new ContextV2();
        context.execute(() -> log.info("비즈니스로직3 실행요"));
        context.execute(() -> log.info("비즈니스로직4 실행요"));
    }
}
