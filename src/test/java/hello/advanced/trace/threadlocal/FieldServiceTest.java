package hello.advanced.trace.threadlocal;

import hello.advanced.trace.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * FieldServiceTest.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.04
 */
@Slf4j
public class FieldServiceTest {

    private FieldService fieldService = new FieldService();

    @Test
    void field() {
        log.info("main start");
        Runnable userA = () -> {
            fieldService.logic("userA");
        };
        Runnable userB = () -> {
            fieldService.logic("userB");
        };

        Thread threadA = new Thread(userA);
        Thread threadB = new Thread(userB);
        threadA.setName("thread-A");
        threadB.setName("thread-B");

        threadA.start();
        sleep(100); //동시성 문제 x
        threadB.start();

        sleep(3000);
        log.info("main exit");
    }

    private void sleep(int mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
