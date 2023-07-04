package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * FiledLogTraceTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.04
 */
class FiledLogTraceTest {

    FiledLogTrace trace = new FiledLogTrace();

    @Test
    void begin__end_level2() {
        TraceStatus status = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status);
    }

    @Test
    void begin__exception_level3() {
        TraceStatus status = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status, new IllegalStateException());
    }
}