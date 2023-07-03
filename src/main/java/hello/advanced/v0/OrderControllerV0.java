package hello.advanced.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderControllerV0.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.03
 */
@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {

    private final OrderService orderService;

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }
}
