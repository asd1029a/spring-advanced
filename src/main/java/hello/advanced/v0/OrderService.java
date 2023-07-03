package hello.advanced.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * OrderService.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.07.03
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepositoryV0 orderRepository;

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
