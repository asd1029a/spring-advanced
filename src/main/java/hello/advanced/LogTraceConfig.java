package hello.advanced;

import hello.advanced.trace.logtrace.FiledLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * LogTraceConfig.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.04
 */
@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
