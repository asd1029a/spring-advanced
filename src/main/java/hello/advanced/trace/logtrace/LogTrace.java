package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * LogTrace.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.04
 */
public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus traceStatus);

    void exception(TraceStatus status, Exception e);
}
