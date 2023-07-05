package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyLogic1.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.05
 */
@Slf4j
public class StrategyLogic1 implements Strategy {
    @Override
    public void call() {
        log.info("비즈니스 로직 1 실행");
    }
}
