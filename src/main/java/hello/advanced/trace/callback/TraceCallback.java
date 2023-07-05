package hello.advanced.trace.callback;

/**
 * TraceCallback.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.05
 */
public interface TraceCallback<T> {
    T call();
}
